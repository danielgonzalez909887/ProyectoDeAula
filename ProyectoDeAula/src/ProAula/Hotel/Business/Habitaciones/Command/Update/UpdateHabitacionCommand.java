/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProAula.Hotel.Business.Habitaciones.Command.Update;

/**
 *
 * @author DANIEL
 */
public class UpdateHabitacionCommand {
    private final int habitacionId;
    private final int numeroHabitacion;
    private final String estadoHabitacion;
    private final String identificacionHuesped;

    public UpdateHabitacionCommand(int habitacionId, int numeroHabitacion, String estadoHabitacion, String identificacionHuesped) {
        this.habitacionId = habitacionId;
        this.numeroHabitacion = numeroHabitacion;
        this.estadoHabitacion = estadoHabitacion;
        this.identificacionHuesped = identificacionHuesped;
    }

    public int getHabitacionId() {
        return habitacionId;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public String getEstadoHabitacion() {
        return estadoHabitacion;
    }

    public String getIdentificacionHuesped() {
        return identificacionHuesped;
    }
}