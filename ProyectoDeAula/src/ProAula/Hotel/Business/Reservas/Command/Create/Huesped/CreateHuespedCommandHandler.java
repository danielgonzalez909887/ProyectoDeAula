/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProAula.Hotel.Business.Reservas.Command.Create.Huesped;

import ProAula.Hotel.Domain.Model.Huesped;
import ProAula.Hotel.Infrastructure.Persistence.Database;

/**
 *
 * @author DANIEL
 */
public class CreateHuespedCommandHandler implements ICreateHuespedCommand {
    
    @Override
    public Huesped handler(CreateHuespedCommand command) throws Exception {
        var database = Database.iniciarBd();

        Huesped nueva = new Huesped();
        nueva.setNombresHuesped(command.getNombresHuesped());
        nueva.setApellidosHuesped(command.getApellidosHuesped());
        nueva.setIdentificacionHuespedAcompa(command.getIdentificacionHuespedAcompa());
        nueva.setFechaNacimientoHuesped(command.getFechaNacimientoHuesped());
        nueva.setGeneroHuesped(command.getGeneroHuesped());
        nueva.setEmailHuesped(command.getEmailHuesped());

        database.huespedBd.add(nueva);

        return nueva;
    }
}