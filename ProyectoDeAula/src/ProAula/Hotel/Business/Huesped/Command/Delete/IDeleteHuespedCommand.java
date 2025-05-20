/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ProAula.Hotel.Business.Huesped.Command.Delete;

import ProAula.Hotel.Domain.Model.Huesped;

/**
 *
 * @author DANIEL
 */
public interface IDeleteHuespedCommand {
    /**
     * Elimina el huesped especificada por su ID.
     * @param command Objeto que contiene el ID del huesped a eliminar.
     * @return el huesped eliminado.
     * @throws Exception Si no se encuentra el huesped o ocurre algún error.
     */
    Huesped handler(DeleteHuespedCommand command) throws Exception;
}