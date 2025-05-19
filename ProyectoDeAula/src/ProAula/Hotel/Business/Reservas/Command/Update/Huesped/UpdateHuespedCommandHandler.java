/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProAula.Hotel.Business.Reservas.Command.Update.Huesped;

import ProAula.Hotel.Domain.Model.Huesped;
import ProAula.Hotel.Infrastructure.Persistence.Database;

/**
 *
 * @author DANIEL
 */
public class UpdateHuespedCommandHandler implements IUpdateHuespedCommand {
    @Override
    public Huesped handler(UpdateHuespedCommand command) throws Exception {
        var database     = Database.iniciarBd();
        var huesped = database.huespedBd;

        // Buscar la habitación por ID
        Huesped toUpdate = null;
        for (Huesped h : huesped) {
            if (h.getId() == command.getHuespedId()) {
                toUpdate = h;
                break;
            }
        }

        if (toUpdate == null) {
            throw new Exception("No se encontro el huesped con ID: " + command.getHuespedId());
        }

        // Actualizar campos
        toUpdate.setNombresHuesped(command.getNombresHuesped());
        toUpdate.setApellidosHuesped(command.getApellidosHuesped());
        toUpdate.setIdentificacionHuespedAcompa(command.getIdentificacionHuespedAcompa());
        toUpdate.setFechaNacimientoHuesped(command.getFechaNacimientoHuesped());
        toUpdate.setGeneroHuesped(command.getGeneroHuesped());
        toUpdate.setEmailHuesped(command.getEmailHuesped());

        return toUpdate;
    }
}