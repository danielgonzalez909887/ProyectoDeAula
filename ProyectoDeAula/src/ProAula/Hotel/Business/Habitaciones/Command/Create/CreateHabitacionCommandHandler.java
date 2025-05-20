/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProAula.Hotel.Business.Habitaciones.Command.Create;

import ProAula.Hotel.Domain.Model.Habitaciones;
import ProAula.Hotel.Infrastructure.Persistence.Database;

/**
 *
 * @author DANIEL
 */
public class CreateHabitacionCommandHandler implements ICreateHabitacionCommand {

    @Override
    public Habitaciones handler(CreateHabitacionCommand command) throws Exception {
        var database = Database.iniciarBd();

        Habitaciones nueva = new Habitaciones();
        nueva.setNumeroHabitacion(command.getNumeroHabitacion());
        nueva.setEstadoHabitacion(command.getEstadoHabitacion());
        nueva.setIdentificacionHuesped(command.getIdentificacionHuesped());

        database.habitacionesBd.add(nueva);

        return nueva;
    }
}