/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProAula.Hotel.Business.Reservas.Queries;

/**
 *
 * @author DANIEL
 */
public class GetReservaByIdRequestQuery {
    private int reservaId;
    
    public GetReservaByIdRequestQuery(int reservaId) throws Exception {
        if(reservaId <= 0){
            throw new Exception("EL ID de la reserva debe ser mayor que 0");
        }
        this.reservaId = reservaId;
    }

    public int getReservaId() {
        return reservaId;
    }
    
}