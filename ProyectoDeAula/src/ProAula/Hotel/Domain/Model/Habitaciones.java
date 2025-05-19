/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProAula.Hotel.Domain.Model;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author DANIEL
 */
public class Habitaciones {
    private int id;
    private int numeroHabitacion;
    private String estadoHabitacion;
    private String identificacionHuesped;
    private static AtomicInteger incremento;

    /**
     * Constructor por defecto que asigna un id autoincrementable
     */
    public Habitaciones() {
        if (incremento == null) {
            incremento = new AtomicInteger(1);
        }
        this.id = incremento.getAndIncrement();
    }

    public int getId() {
        return id;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public String getEstadoHabitacion() {
        return estadoHabitacion;
    }

    public void setEstadoHabitacion(String estadoHabitacion) {
        this.estadoHabitacion = estadoHabitacion;
    }

    public String getIdentificacionHuesped() {
        return identificacionHuesped;
    }

    public void setIdentificacionHuesped(String identificacionHuesped) {
        this.identificacionHuesped = identificacionHuesped;
    }
}