/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ProAula.Hotel.Business.Habitaciones.Command.Update;

import ProAula.Hotel.Domain.Model.Habitaciones;

/**
 *
 * @author DANIEL
 */
public interface IUpdateHabitacionCommand {
    /**
     * Actualiza los datos de una habitación
     * @param command objeto que contiene el ID y los nuevos valores
     * @return la habitación actualizada
     * @throws Exception si no se encuentra la habitación
     */
    Habitaciones handler(UpdateHabitacionCommand command) throws Exception;
}