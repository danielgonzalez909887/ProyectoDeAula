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
public interface ICreateHabitacionCommand {
    /**
     * Crea una habitación y la guarda en la base de datos en memoria
     * @param command datos para la nueva habitación
     * @return la habitación creada (con ID autogenerado)
     * @throws Exception si ocurre algún error
     */
    Habitaciones handler(CreateHabitacionCommand command) throws Exception;
}