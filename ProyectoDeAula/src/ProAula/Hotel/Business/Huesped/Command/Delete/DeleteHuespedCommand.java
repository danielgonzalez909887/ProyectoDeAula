/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProAula.Hotel.Business.Huesped.Command.Delete;

/**
 *
 * @author DANIEL
 */
public class DeleteHuespedCommand {
    private int huespedId;

    public DeleteHuespedCommand(int huespedId) {
        this.huespedId = huespedId;
    }

    public int getHuespedId() {
        return huespedId;
    }
}