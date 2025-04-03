/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ProAula.Hotel.Business.Reservas.Queries;

import ProAula.Hotel.Domain.Model.Reservas;
import java.util.List;

/**
 *
 * @author DANIEL
 */
public interface IGetAllReservasQuery {
    /**
    * Busca y retorna todas las Reservas
    * @return la lista de todas las Reservas
    * @throws Exception si ocurre un error al listar todas las Reservas
    */
   public List<Reservas> handler() throws Exception;
   
}