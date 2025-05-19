/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ProAula.Hotel.Business.Reservas.Queries.GetAll;

import ProAula.Hotel.Domain.Model.Habitaciones;
import java.util.List;

/**
 *
 * @author DANIEL
 */
public interface IGetAllHabitacionesQuery {
    /**
     * Busca y retorna todas las Habitaciones
     * @return la lista de todas las Habitaciones
     * @throws Exception si no hay habitaciones registradas
     */
    List<Habitaciones> handler() throws Exception;
}