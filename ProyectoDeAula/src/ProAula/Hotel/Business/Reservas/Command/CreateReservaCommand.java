/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProAula.Hotel.Business.Reservas.Command;

import ProAula.Hotel.Domain.Model.Usuario;
import java.util.Date;
import java.util.List;

/**
 *
 * @author DANIEL
 */
public class CreateReservaCommand {
    private Date fechaReserva;
    private Date fechaLlegada;
    private Date fechaSalida;
    private int huespedes;
    private int habitaciones;
    private List<Usuario> usuarios;

    public CreateReservaCommand(Date fechaReserva, Date fechaLlegada, Date fechaSalida, int huespedes, int habitaciones, List<Usuario> usuarios) {
        this.fechaReserva = fechaReserva;
        this.fechaLlegada = fechaLlegada;
        this.fechaSalida = fechaSalida;
        this.huespedes = huespedes;
        this.habitaciones = habitaciones;
        this.usuarios = usuarios;
    }

    public Date getFechaReserva() { return fechaReserva; }
    public Date getFechaLlegada() { return fechaLlegada; }
    public Date getFechaSalida() { return fechaSalida; }
    public int getHuespedes() { return huespedes; }
    public int getHabitaciones() { return habitaciones; }
    public List<Usuario> getUsuarios() { return usuarios; }
}