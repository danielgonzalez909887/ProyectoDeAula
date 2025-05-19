/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProAula.Hotel.Business.Reservas.Command.Delete.Huesped;

import ProAula.Hotel.Domain.Model.Huesped;
import ProAula.Hotel.Infrastructure.Persistence.Database;

/**
 *
 * @author DANIEL
 */
public class DeleteHuespedCommandHandler implements IDeleteHuespedCommand {
    
    @Override
    public Huesped handler(DeleteHuespedCommand command) throws Exception {
        //Obtenemos la instancia de la base de datos en memoria
        var database = Database.iniciarBd();
        var huesped = database.huespedBd;
        
        //Buscamos el huesped a eliminar por su ID
        Huesped huespedAEliminar = null;
        for (Huesped h : huesped) {
            if (h.getId() == command.getHuespedId()) {
                huespedAEliminar = h;
                break;
            }
        }
        
        //Si no se encontro el huesped, mostramos una excepcion
        if (huespedAEliminar == null) {
            throw new Exception("No se encontro el huesped con el ID: " + command.getHuespedId());
        }
        
        //Eliminar el huesped de la lista
        huesped.remove(huespedAEliminar);
        
        //Retornamos el huesped eliminado
        return huespedAEliminar;
    }
}