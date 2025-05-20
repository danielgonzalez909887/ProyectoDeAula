/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProAula.Hotel.Business.Reservas.Command.Update;

import ProAula.Hotel.Domain.Model.Reservas;
import ProAula.Hotel.Infrastructure.Persistence.Database;

/**
 *
 * @author DANIEL
 */
public class UpdateReservaCommandHandler implements IUpdateReservaCommand {
    @Override
    public Reservas handler(UpdateReservaCommand command) throws Exception {
        //Obtenemos la instancia de la base de datos en memoria
        var database = Database.iniciarBd();
        var reservas = database.reservasBd;
        
        //Buscamos la reserva a actualizar por ID
        Reservas reservaToUpdate = null;
        for (Reservas r : reservas) {
            if (r.getId() == command.getReservaId()) {
                reservaToUpdate = r;
                break;
            }
        }
        
        //Si no se encuentra la reserva, mostramos una excepcion
        if (reservaToUpdate == null) {
            throw new Exception("No se encontro la reserva con el ID: " + command.getReservaId());
        }
        
        //Actualizamos los datos de la reserva
        reservaToUpdate.setFechaReserva(command.getFechaReserva());
        reservaToUpdate.setFechaLlegada(command.getFechaLlegada());
        reservaToUpdate.setFechaSalida(command.getFechaSalida());
        reservaToUpdate.setHuespedes(command.getHuespedes());
        reservaToUpdate.setHabitaciones(command.getHabitaciones());
        reservaToUpdate.setUsuarios(command.getUsuarios());
        
        //Retornamos la reserva actualizada
        return reservaToUpdate;
    }
}