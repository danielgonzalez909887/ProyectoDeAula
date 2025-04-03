/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProAula.Hotel.Business.Reservas.Command;

import ProAula.Hotel.Domain.Model.Reservas;
import ProAula.Hotel.Infrastructure.Persistence.Database;
import java.util.ArrayList;

/**
 *
 * @author DANIEL
 */
public class CreateReservaCommandHandler implements ICreateReservaCommand {
    @Override
    public Reservas handler(CreateReservaCommand command) throws Exception {
        var database = Database.iniciarBd();

        // Crear una nueva reserva con los datos del comando
        Reservas nuevaReserva = new Reservas();
        nuevaReserva.setFechaReserva(command.getFechaReserva());
        nuevaReserva.setFechaLlegada(command.getFechaLlegada());
        nuevaReserva.setFechaSalida(command.getFechaSalida());
        nuevaReserva.setHuespedes(command.getHuespedes());
        nuevaReserva.setHabitaciones(command.getHabitaciones());
        nuevaReserva.setUsuarios(command.getUsuarios() != null ? command.getUsuarios() : new ArrayList<>());

        // Guardar la reserva en la base de datos en memoria
        database.reservasBd.add(nuevaReserva);

        return nuevaReserva;
    }
}