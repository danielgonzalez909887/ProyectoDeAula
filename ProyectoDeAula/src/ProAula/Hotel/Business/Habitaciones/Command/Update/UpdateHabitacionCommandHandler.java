/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProAula.Hotel.Business.Habitaciones.Command.Update;

import ProAula.Hotel.Domain.Model.Habitaciones;
import ProAula.Hotel.Infrastructure.Persistence.Database;

/**
 *
 * @author DANIEL
 */
public class UpdateHabitacionCommandHandler implements IUpdateHabitacionCommand {

    @Override
    public Habitaciones handler(UpdateHabitacionCommand command) throws Exception {
        var database     = Database.iniciarBd();
        var habitaciones = database.habitacionesBd;

        // Buscar la habitación por ID
        Habitaciones toUpdate = null;
        for (Habitaciones h : habitaciones) {
            if (h.getId() == command.getHabitacionId()) {
                toUpdate = h;
                break;
            }
        }

        if (toUpdate == null) {
            throw new Exception("No se encontro la habitacion con ID: " + command.getHabitacionId());
        }

        // Actualizar campos
        toUpdate.setNumeroHabitacion(command.getNumeroHabitacion());
        toUpdate.setEstadoHabitacion(command.getEstadoHabitacion());
        toUpdate.setIdentificacionHuesped(command.getIdentificacionHuesped());

        return toUpdate;
    }
}