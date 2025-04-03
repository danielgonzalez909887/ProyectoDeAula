/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProAula.Hotel.Business.Reservas.Queries;

import ProAula.Hotel.Domain.Model.Reservas;
import ProAula.Hotel.Infrastructure.Persistence.Database;
import java.util.List;

/**
 *
 * @author DANIEL
 */
public class GetAllReservasQueryHandler implements IGetAllReservasQuery {
    
    @Override
    public List<Reservas> handler() throws Exception {
        var database = Database.iniciarBd();
        var reservas = database.reservasBd;
        
        if (reservas == null || reservas.isEmpty()) {
            throw new Exception("No hay reservas registradas.");
        }
        
        return reservas;
    }
}