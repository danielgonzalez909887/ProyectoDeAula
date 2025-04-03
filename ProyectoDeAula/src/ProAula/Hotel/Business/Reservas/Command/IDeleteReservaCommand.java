/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ProAula.Hotel.Business.Reservas.Command;

import ProAula.Hotel.Domain.Model.Reservas;

/**
 *
 * @author DANIEL
 */
public interface IDeleteReservaCommand {
    /**
     * Elimina la reserva especificada por su ID.
     * @param command Objeto que contiene el ID de la reserva a eliminar.
     * @return La reserva eliminada.
     * @throws Exception Si no se encuentra la reserva o ocurre algún error.
     */
    Reservas handler(DeleteReservaCommand command) throws Exception;
}