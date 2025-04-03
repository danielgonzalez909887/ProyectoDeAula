/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ProAula.Hotel.Business.Reservas.Queries;

import ProAula.Hotel.Domain.Model.Reservas;

/**
 *
 * @author DANIEL
 */
public interface IGetReservaByIdQuery {
    /**
     * Busca una Reserva y la retorna si la encuentra
     * @param request la peticion con el id de la reserva a buscar
     * @return la reserva encontrada
     * @throws Exception si no encunetra la reserva
     */
   public Reservas handler(GetReservaByIdRequestQuery request  ) throws Exception;

}