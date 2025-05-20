/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProAula.Hotel.Business.Habitaciones.Queries.GetById;

import ProAula.Hotel.Domain.Model.Habitaciones;
import ProAula.Hotel.Infrastructure.Persistence.Database;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author DANIEL
 */
public class GetHabitacionByIdentificacionQueryHandler implements IGetHabitacionByIdentificacionQuery {
    
    @Override
    public List<Habitaciones> handler(GetHabitacionByIdentificacionRequestQuery request) throws Exception {
        var database     = Database.iniciarBd();
        var habitaciones = database.habitacionesBd;

        if (habitaciones == null || habitaciones.isEmpty()) {
            throw new Exception("No hay habitaciones registradas.");
        }

        String idHuesped = request.getIdentificacionHuesped();
        // Filtramos todas las habitaciones cuya identificación coincida
        List<Habitaciones> encontradas = habitaciones.stream()
            .filter(hab -> idHuesped.equals(hab.getIdentificacionHuesped()))
            .collect(Collectors.toList());

        if (encontradas.isEmpty()) {
            throw new Exception("No se encontró ninguna habitación para la identificación: " + idHuesped);
        }

        return encontradas;
    }
}