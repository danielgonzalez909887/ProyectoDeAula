/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ProAula.Hotel.Business.Huesped.Queries.GetById;

import ProAula.Hotel.Domain.Model.Huesped;
import java.util.List;

/**
 *
 * @author DANIEL
 */
public interface IGetHuespedByIdentificacionQuery {
    /**
     * Busca una Habitación utilizando la identificación del huésped
     * @param request con la identificación del huésped
     * @return lista de habitaciones correspondientes
     * @throws Exception si no hay habitaciones o no se encuentra ninguna
     */
    List<Huesped> handler(GetHuespedByIdentificacionRequestQuery request) throws Exception;
}