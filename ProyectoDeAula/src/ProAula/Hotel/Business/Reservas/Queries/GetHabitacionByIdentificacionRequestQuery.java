/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProAula.Hotel.Business.Reservas.Queries;

/**
 *
 * @author DANIEL
 */
public class GetHabitacionByIdentificacionRequestQuery {
    private final String identificacionHuesped;

    public GetHabitacionByIdentificacionRequestQuery(String identificacionHuesped) throws Exception {
        if (identificacionHuesped == null || identificacionHuesped.isBlank()) {
            throw new Exception("La identificacion del huesped es obligatoria.");
        }
        this.identificacionHuesped = identificacionHuesped;
    }

    public String getIdentificacionHuesped() {
        return identificacionHuesped;
    }
}