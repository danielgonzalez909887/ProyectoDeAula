/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ProAula.Hotel.Business.Reservas.Command;

import ProAula.Hotel.Domain.Model.Habitaciones;

/**
 *
 * @author DANIEL
 */
public interface IDeleteHabitacionCommand {
    /**
     * Elimina la habitación especificada por su ID
     * @param command objeto que contiene el ID de la habitación a eliminar
     * @return la habitación eliminada
     * @throws Exception si no se encuentra la habitación
     */
    Habitaciones handler(DeleteHabitacionCommand command) throws Exception;
}