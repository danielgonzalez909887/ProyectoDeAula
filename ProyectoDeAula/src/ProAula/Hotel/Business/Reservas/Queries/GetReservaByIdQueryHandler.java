/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProAula.Hotel.Business.Reservas.Queries;

import ProAula.Hotel.Domain.Model.Reservas;
import ProAula.Hotel.Infrastructure.Persistence.Database;

/**
 *
 * @author DANIEL
 */
public class GetReservaByIdQueryHandler implements IGetReservaByIdQuery {
    
    @Override
    public Reservas handler(GetReservaByIdRequestQuery request) throws Exception 
    {
        var database = Database.iniciarBd();
        var reservas = database.reservasBd;
        int reservaId = request.getReservaId();
        Reservas reservaEncontrada = null;
        
        for (Reservas reserva : reservas) {
            if(reserva.getId() == reservaId){
                reservaEncontrada = reserva;
                break;
            }
        }
        
        if(reservaEncontrada == null){
             throw new Exception("La Reserva con el ID: "+ reservaId +" no existe");
        }
        
        return reservaEncontrada;
    }
    
}