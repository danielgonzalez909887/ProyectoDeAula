/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ProAula.Hotel.Business.Reservas.Command.Create.Huesped;

import ProAula.Hotel.Domain.Model.Huesped;

/**
 *
 * @author DANIEL
 */
public interface ICreateHuespedCommand {
    /**
     * Crea un huesped y la guarda en la base de datos en memoria
     * @param command datos para un nuevo Huesped
     * @return el Huesped creado (con ID autogenerado)
     * @throws Exception si ocurre algún error
     */
    Huesped handler(CreateHuespedCommand command) throws Exception;
}