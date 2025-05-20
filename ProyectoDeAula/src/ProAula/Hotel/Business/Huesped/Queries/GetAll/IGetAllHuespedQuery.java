/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ProAula.Hotel.Business.Huesped.Queries.GetAll;

import ProAula.Hotel.Domain.Model.Huesped;
import java.util.List;

/**
 *
 * @author DANIEL
 */
public interface IGetAllHuespedQuery {
    /**
    * Busca y retorna todos los Huespedes
    * @return la lista de todos los Huespedes
    * @throws Exception si ocurre un error al listar todos los Huespedes
    */
   public List<Huesped> handler() throws Exception;
}