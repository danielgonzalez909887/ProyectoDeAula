/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ProAula.Hotel.Business.Reservas.Command.Update.Huesped;

import ProAula.Hotel.Domain.Model.Huesped;

/**
 *
 * @author DANIEL
 */
public interface IUpdateHuespedCommand {
    /**
     * Actualiza los datos de un huesped
     * @param command objeto que contiene el ID y los nuevos valores
     * @return el huesped actualizado
     * @throws Exception si no se encuentra el huesped
     */
    Huesped handler(UpdateHuespedCommand command) throws Exception;
}