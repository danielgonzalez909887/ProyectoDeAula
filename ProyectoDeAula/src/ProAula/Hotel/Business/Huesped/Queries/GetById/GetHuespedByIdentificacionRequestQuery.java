/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProAula.Hotel.Business.Huesped.Queries.GetById;

/**
 *
 * @author DANIEL
 */
public class GetHuespedByIdentificacionRequestQuery {
    private final String identificacion;

    public GetHuespedByIdentificacionRequestQuery(String identificacion) throws Exception {
        if (identificacion == null || identificacion.isBlank()) {
            throw new Exception("La identificacion del huesped es obligatoria.");
        }
        this.identificacion = identificacion;
    }

    public String getIdentificacionHuespedAcompa() {
        return identificacion;
    }
}