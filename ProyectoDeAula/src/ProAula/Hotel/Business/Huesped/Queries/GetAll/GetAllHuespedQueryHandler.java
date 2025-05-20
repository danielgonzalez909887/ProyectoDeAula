/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProAula.Hotel.Business.Huesped.Queries.GetAll;

import ProAula.Hotel.Domain.Model.Huesped;
import ProAula.Hotel.Infrastructure.Persistence.Database;
import java.util.List;

/**
 *
 * @author DANIEL
 */
public class GetAllHuespedQueryHandler implements IGetAllHuespedQuery {
    
    @Override
    public List<Huesped> handler() throws Exception {
        var database = Database.iniciarBd();
        var huesped = database.huespedBd;
        
        if (huesped == null || huesped.isEmpty()) {
            throw new Exception("No hay huespedes registrados.");
        }
        
        return huesped;
    }
}
