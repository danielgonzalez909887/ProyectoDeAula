/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProAula.Hotel.Business.Habitaciones.Command.Delete;

/**
 *
 * @author DANIEL
 */
public class DeleteHabitacionCommand {
    private final int habitacionId;

    public DeleteHabitacionCommand(int habitacionId) {
        this.habitacionId = habitacionId;
    }

    public int getHabitacionId() {
        return habitacionId;
    }
}