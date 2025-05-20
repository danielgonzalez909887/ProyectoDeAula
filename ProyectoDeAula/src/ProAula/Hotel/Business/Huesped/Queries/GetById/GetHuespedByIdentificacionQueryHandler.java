/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProAula.Hotel.Business.Huesped.Queries.GetById;

import ProAula.Hotel.Domain.Model.Huesped;
import ProAula.Hotel.Infrastructure.Persistence.Database;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author DANIEL
 */
public class GetHuespedByIdentificacionQueryHandler implements IGetHuespedByIdentificacionQuery {
    
    @Override
    public List<Huesped> handler(GetHuespedByIdentificacionRequestQuery request) throws Exception {
        var database     = Database.iniciarBd();
        var huesped = database.huespedBd;

        if (huesped == null || huesped.isEmpty()) {
            throw new Exception("No hay habitaciones registradas.");
        }

        String idHuesped = request.getIdentificacionHuespedAcompa();
        // Filtramos todas los huespedes cuya identificación coincida
        List<Huesped> encontrados = huesped.stream()
            .filter(hues -> idHuesped.equals(hues.getIdentificacionHuespedAcompa()))
            .collect(Collectors.toList());

        if (encontrados.isEmpty()) {
            throw new Exception("No se encontró ningun huesped para la identificación: " + idHuesped);
        }

        return encontrados;
    }
}