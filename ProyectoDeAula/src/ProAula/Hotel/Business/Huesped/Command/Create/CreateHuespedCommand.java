/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProAula.Hotel.Business.Huesped.Command.Create;

import java.util.Date;

/**
 *
 * @author DANIEL
 */
public class CreateHuespedCommand {
    private final String nombres;
    private final String apellidos;
    private final String identificacion;
    private final Date fechaNacimiento;
    private final String genero;
    private final String email;

    public CreateHuespedCommand(String nombres, String apellidos, String identificacion, Date fechaNacimiento, String genero, String email) {
        this.nombres     = nombres;
        this.apellidos     = apellidos;
        this.identificacion = identificacion;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.email = email;
    }
    
    public String getNombresHuesped() {
        return nombres;
    }
    
    public String getApellidosHuesped() {
        return apellidos;
    }
    
    public String getIdentificacionHuespedAcompa() {
        return identificacion;
    }
    
    public Date getFechaNacimientoHuesped() {
        return fechaNacimiento;
    }
    
    public String getGeneroHuesped() {
        return genero;
    }
    
    public String getEmailHuesped() {
        return email;
    }
    
}