/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProAula.Hotel.Business.Reservas.Command.Delete;

import ProAula.Hotel.Domain.Model.Reservas;
import ProAula.Hotel.Infrastructure.Persistence.Database;

/**
 *
 * @author DANIEL
 */
public class DeleteReservaCommandHandler implements IDeleteReservaCommand {
    
    @Override
    public Reservas handler(DeleteReservaCommand command) throws Exception {
        //Obtenemos la instancia de la base de datos en memoria
        var database = Database.iniciarBd();
        var reservas = database.reservasBd;
        
        //Buscamos la reserva a eliminar por su ID
        Reservas reservaAEliminar = null;
        for (Reservas r : reservas) {
            if (r.getId() == command.getReservaId()) {
                reservaAEliminar = r;
                break;
            }
        }
        
        //Si no se encontro la reserva, mostramos una excepcion
        if (reservaAEliminar == null) {
            throw new Exception("No se encontro la reserva con el ID: " + command.getReservaId());
        }
        
        //Eliminar la reserva de la lista
        reservas.remove(reservaAEliminar);
        
        //Retornamos la reserva eliminada
        return reservaAEliminar;
    }
}