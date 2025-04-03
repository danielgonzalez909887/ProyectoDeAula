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
public interface IUpdateReservaCommand {
    /**
     * Actualiza una reserva con los nuevos datos suministrados.
     * @param command objeto que contiene el ID de la reserva a actualizar y los nuevos datos.
     * @return la reserva actualizada.
     * @throws Exception si no se encuentra la reserva.
     */
    Reservas handler(UpdateReservaCommand command) throws Exception;
}