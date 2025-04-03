/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProAula.Hotel.Infrastructure.Persistence;

import ProAula.Hotel.Domain.Model.Reservas;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author DANIEL
 */
public class Database {
    
    public List<Reservas> reservasBd;
    
    private static Database instancia;
    
    //Constructor privado de la clase, impide que se creen instancias desde fuera de la clase
    private Database(){
        //Verifica si la lista reservasBd es nula o esta vacia
        if(reservasBd == null || reservasBd.isEmpty()){
            //Si es asi, inicializa la lista con una nueva instancia de ArrayList para que se pueda utilizar
            reservasBd = new ArrayList<>();
        }
    }
    
    //Metodo estatico para iniciar (o recuperar) la instancia unica de Database
    public static Database iniciarBd(){
        //Si la instancia aun no ha sido creada (es nula), se crea una nueva instancia
        if (instancia == null) {
            instancia = new Database();
        }
        
        //Devuelve la instancia de la base de datos, asegurando que siempre se trabaje con la misma
        return instancia;
    }
    
}
