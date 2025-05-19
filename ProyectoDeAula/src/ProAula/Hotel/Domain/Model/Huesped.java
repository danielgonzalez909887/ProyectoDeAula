/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProAula.Hotel.Domain.Model;

import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author DANIEL
 */
public class Huesped {
    private int id;
    private String nombres;
    private String apellidos;
    private String identificacion;
    private Date fechaNacimiento;
    private String genero;
    private String email;
    private static AtomicInteger incremento;
    
    /**
     * Constructor por defecto que asigna un id autoincrementable
     */
    public Huesped() {
        if (incremento == null) {
            incremento = new AtomicInteger(1);
        }
        this.id = incremento.getAndIncrement();
    }
    
    public int getId() {
        return id;
    }
    
    public String getNombresHuesped() {
        return nombres;
    }

    public void setNombresHuesped(String nombres) {
        this.nombres = nombres;
    }
    
    public String getApellidosHuesped() {
        return apellidos;
    }

    public void setApellidosHuesped(String apellidos) {
        this.apellidos = apellidos;
    }
    
    public String getIdentificacionHuespedAcompa() {
        return identificacion;
    }

    public void setIdentificacionHuespedAcompa(String identificacion) {
        this.identificacion = identificacion;
    }
    
    public Date getFechaNacimientoHuesped() {
        return fechaNacimiento;
    }

    public void setFechaNacimientoHuesped(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public String getGeneroHuesped() {
        return genero;
    }

    public void setGeneroHuesped(String genero) {
        this.genero = genero;
    }
    
    public String getEmailHuesped() {
        return email;
    }

    public void setEmailHuesped(String email) {
        this.email = email;
    }
    
}
