/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProAula.Hotel.Business.Reservas.Queries;

import ProAula.Hotel.Business.Reservas.Queries.GetAll.IGetAllHabitacionesQuery;
import ProAula.Hotel.Domain.Model.Habitaciones;
import ProAula.Hotel.Infrastructure.Persistence.Database;
import java.util.List;

/**
 *
 * @author DANIEL
 */
public class GetAllHabitacionesQueryHandler implements IGetAllHabitacionesQuery {
    
    @Override
    public List<Habitaciones> handler() throws Exception {
        Database db = Database.iniciarBd();
        List<Habitaciones> habitaciones = db.habitacionesBd;
        
        if (habitaciones == null || habitaciones.isEmpty()) {
            throw new Exception("No hay habitaciones registradas.");
        }
        
        return habitaciones;
    }
}