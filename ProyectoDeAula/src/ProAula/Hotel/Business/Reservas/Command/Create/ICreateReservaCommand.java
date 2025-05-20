/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ProAula.Hotel.Business.Reservas.Command.Create;

import ProAula.Hotel.Domain.Model.Reservas;

/**
 *
 * @author DANIEL
 */
public interface ICreateReservaCommand {
    Reservas handler(CreateReservaCommand command) throws Exception;
}