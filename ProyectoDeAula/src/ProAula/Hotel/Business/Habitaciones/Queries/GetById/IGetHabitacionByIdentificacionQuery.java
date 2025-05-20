/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ProAula.Hotel.Business.Habitaciones.Queries.GetById;

import ProAula.Hotel.Domain.Model.Habitaciones;
import java.util.List;

/**
 *
 * @author DANIEL
 */
public interface IGetHabitacionByIdentificacionQuery {
    /**
     * Busca una Habitación utilizando la identificación del huésped
     * @param request con la identificación del huésped
     * @return lista de habitaciones correspondientes
     * @throws Exception si no hay habitaciones o no se encuentra ninguna
     */
    List<Habitaciones> handler(GetHabitacionByIdentificacionRequestQuery request) throws Exception;
}