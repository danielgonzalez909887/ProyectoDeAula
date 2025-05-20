/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProAula.Hotel.Business.Habitaciones.Command.Delete;

import ProAula.Hotel.Domain.Model.Habitaciones;
import ProAula.Hotel.Infrastructure.Persistence.Database;
import java.util.List;

/**
 *
 * @author DANIEL
 */
public class DeleteHabitacionCommandHandler implements IDeleteHabitacionCommand {

    @Override
    public Habitaciones handler(DeleteHabitacionCommand command) throws Exception {
        var database     = Database.iniciarBd();
        List<Habitaciones> habitaciones = database.habitacionesBd;

        if (habitaciones == null || habitaciones.isEmpty()) {
            throw new Exception("No hay habitaciones registradas.");
        }

        Habitaciones toDelete = null;
        for (Habitaciones h : habitaciones) {
            if (h.getId() == command.getHabitacionId()) {
                toDelete = h;
                break;
            }
        }

        if (toDelete == null) {
            throw new Exception("No se encontro la habitacion con el ID: " + command.getHabitacionId());
        }

        habitaciones.remove(toDelete);
        return toDelete;
    }
}