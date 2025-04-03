/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;

import ProAula.Hotel.Business.Reservas.Command.CreateReservaCommand;
import ProAula.Hotel.Business.Reservas.Command.CreateReservaCommandHandler;
import ProAula.Hotel.Business.Reservas.Command.DeleteReservaCommand;
import ProAula.Hotel.Business.Reservas.Command.DeleteReservaCommandHandler;
import ProAula.Hotel.Business.Reservas.Command.ICreateReservaCommand;
import ProAula.Hotel.Business.Reservas.Command.IDeleteReservaCommand;
import ProAula.Hotel.Business.Reservas.Command.IUpdateReservaCommand;
import ProAula.Hotel.Business.Reservas.Command.UpdateReservaCommand;
import ProAula.Hotel.Business.Reservas.Command.UpdateReservaCommandHandler;
import ProAula.Hotel.Business.Reservas.Queries.GetAllReservasQueryHandler;
import ProAula.Hotel.Business.Reservas.Queries.GetReservaByIdQueryHandler;
import ProAula.Hotel.Business.Reservas.Queries.GetReservaByIdRequestQuery;
import ProAula.Hotel.Domain.Model.Reservas;
import ProAula.Hotel.Domain.Model.Usuario;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author DANIEL
 */
public class Principal {
    public static void main(String[] args) {
        var reservaId = 1;
        try {
            //Crear una reserva
            List<Usuario> usuariosReserva1 = new ArrayList<>();
            usuariosReserva1.add(new Usuario("Daniel", "Gonzalez", "1234567"));
            usuariosReserva1.add(new Usuario("Juan", "Perez", "123456789"));
            
            Calendar cal1 = Calendar.getInstance();
            
            cal1.set(2025, Calendar.MARCH, 10); //10 de marzo de 2025
            Date fechaReserva1 = cal1.getTime();
            
            cal1.set(2025, Calendar.MARCH, 15); //15 de marzo de 2025
            Date fechaLlegada1 = cal1.getTime();
            
            cal1.set(2025, Calendar.APRIL, 15);  //15 de abril de 2025
            Date fechaSalida1 = cal1.getTime();
            
            //Creamos el comando para la primera reserva
            CreateReservaCommand command1 = new CreateReservaCommand(
                fechaReserva1,      //Fecha de reserva
                fechaLlegada1,      //Fecha de llegada
                fechaSalida1,       //Fecha de salida
                2,                  //Numero de huespedes
                2,                  //Numero de habitaciones
                usuariosReserva1    //Lista de usuarios
            );
            
            //Procesamos la primera reserva usando el handler
            ICreateReservaCommand handler1 = new CreateReservaCommandHandler();
            Reservas nuevaReserva1 = handler1.handler(command1);
            System.out.println("Reserva creada con ID: " + nuevaReserva1.getId());
            
            
            
            //Creamos otra reserva
            List<Usuario> usuariosReserva2 = new ArrayList<>();
            usuariosReserva2.add(new Usuario("Maria", "Lopez", "987654321"));
            usuariosReserva2.add(new Usuario("Carlos", "Martinez", "1230987"));
            
            Calendar cal2 = Calendar.getInstance();
            
            cal2.set(2025, Calendar.APRIL, 5);  //5 de abril de 2025
            Date fechaReserva2 = cal2.getTime();
            
            cal2.set(2025, Calendar.APRIL, 10); //10 de abril de 2025
            Date fechaLlegada2 = cal2.getTime();
            
            cal2.set(2025, Calendar.APRIL, 20); //20 de abril de 2025
            Date fechaSalida2 = cal2.getTime();
            
            //Creamos el comando para la segunda reserva
            CreateReservaCommand command2 = new CreateReservaCommand(
                fechaReserva2,
                fechaLlegada2,
                fechaSalida2,
                3,
                1,
                usuariosReserva2
            );
            
            //Procesamos la segunda reserva usando un nuevo handler
            ICreateReservaCommand handler2 = new CreateReservaCommandHandler();
            Reservas nuevaReserva2 = handler2.handler(command2);
            System.out.println("Reserva creada con ID: " + nuevaReserva2.getId());
            
            
            System.out.println("--------------------------------------------------------------");
            //Listar reservas por ID
            var requestQuery = new GetReservaByIdRequestQuery(reservaId);
            var handlerQuery = new GetReservaByIdQueryHandler();
            var reserva = handlerQuery.handler(requestQuery);
            System.out.println("RESERVA: " + reserva.getId());
            
            //Listar todas las reservas
            var handlerQueryAll = new GetAllReservasQueryHandler();
            var reservas = handlerQueryAll.handler();

            System.out.println("Listar todas las reservas:");
            for (Reservas r : reservas) {
                System.out.println("ID: " + r.getId());
                System.out.println("Fecha reserva: " + r.getFechaReserva());
                System.out.println("Fecha llegada: " + r.getFechaLlegada());
                System.out.println("Fecha salida: " + r.getFechaSalida());
                System.out.println("Numero de huespedes: " + r.getHuespedes());
                System.out.println("Numero de habitaciones: " + r.getHabitaciones());
                
                //Obtenemos la lista de Usuarios de la Reserva
                List<Usuario> usuarios = r.getUsuarios();
                //Verificamos si hay usuarios en la lista
                if (usuarios != null && !usuarios.isEmpty()) {
                    System.out.println("Usuarios de la reserva:");
                    for (Usuario u : usuarios) {
                        System.out.println("  - " + u.getNombres() + " " + u.getApellidos());
                    }
                } else {
                    System.out.println("No hay Usuarios asociados a esta reserva.");
                }
                
            }
            
            
            System.out.println("--------------------------------------------------------------");
            //Editamos una reserva
            int reservaIdAActualizar = 2;
            
            List<Usuario> usuariosReserva3 = new ArrayList<>();
            usuariosReserva3.add(new Usuario("Maria", "Ramirez", "0005555555"));
            usuariosReserva3.add(new Usuario("Carlos", "Martinez", "1230987"));
            usuariosReserva3.add(new Usuario("Pedro", "Villegas", "9998887774"));
            
            Calendar cal3 = Calendar.getInstance();
            cal3.set(2025, Calendar.MARCH, 20);
            Date nuevaFechaReserva = cal3.getTime();
            cal3.set(2025, Calendar.MARCH, 25);
            Date nuevaFechaLlegada = cal3.getTime();
            cal3.set(2025, Calendar.APRIL, 5);
            Date nuevaFechaSalida = cal3.getTime();
            
            //Crear el comando de actualización con los nuevos datos
            UpdateReservaCommand updateCommand = new UpdateReservaCommand(
                reservaIdAActualizar,   //ID de la reserva a actualizar
                nuevaFechaReserva,      //Nueva fecha de reserva
                nuevaFechaLlegada,      //Nueva fecha de llegada
                nuevaFechaSalida,       //Nueva fecha de salida
                3,                      //Nuevo número de huespedes
                3,                      //Nueva cantidad de habitaciones
                usuariosReserva3        //Nueva lista de usuarios
            );
            
            //Procesamos la actualizacion
            IUpdateReservaCommand updateHandler = new UpdateReservaCommandHandler();
            Reservas reservaActualizada = updateHandler.handler(updateCommand);
            System.out.println("Reserva actualizada con ID: " + reservaActualizada.getId());
            
            
            //Listar todas las reservas
            handlerQueryAll = new GetAllReservasQueryHandler();
            reservas = handlerQueryAll.handler();

            System.out.println("Listar todas las reservas:");
            for (Reservas r : reservas) {
                System.out.println("ID: " + r.getId());
                System.out.println("Fecha reserva: " + r.getFechaReserva());
                System.out.println("Fecha llegada: " + r.getFechaLlegada());
                System.out.println("Fecha salida: " + r.getFechaSalida());
                System.out.println("Numero de huespedes: " + r.getHuespedes());
                System.out.println("Numero de habitaciones: " + r.getHabitaciones());
                
                //Obtenemos la lista de Usuarios de la Reserva
                List<Usuario> usuarios = r.getUsuarios();
                //Verificamos si hay usuarios en la lista
                if (usuarios != null && !usuarios.isEmpty()) {
                    System.out.println("Usuarios de la reserva:");
                    for (Usuario u : usuarios) {
                        System.out.println("  - " + u.getNombres() + " " + u.getApellidos());
                    }
                } else {
                    System.out.println("No hay Usuarios asociados a esta reserva.");
                }
                
            }
            
            
            System.out.println("--------------------------------------------------------------");
            //Eliminamos una reserva
            int reservaIdAEliminar = 2;
            DeleteReservaCommand deleteCommand = new DeleteReservaCommand(reservaIdAEliminar);
            
            IDeleteReservaCommand deleteHandler = new DeleteReservaCommandHandler();
            Reservas reservaEliminada = deleteHandler.handler(deleteCommand);
            System.out.println("Reserva eliminada con ID: " + reservaEliminada.getId());
            
            
            
            //Listar todas las reservas
            handlerQueryAll = new GetAllReservasQueryHandler();
            reservas = handlerQueryAll.handler();

            System.out.println("Listar todas las reservas:");
            for (Reservas r : reservas) {
                System.out.println("ID: " + r.getId());
                System.out.println("Fecha reserva: " + r.getFechaReserva());
                System.out.println("Fecha llegada: " + r.getFechaLlegada());
                System.out.println("Fecha salida: " + r.getFechaSalida());
                System.out.println("Numero de huespedes: " + r.getHuespedes());
                System.out.println("Numero de habitaciones: " + r.getHabitaciones());
                
                //Obtenemos la lista de Usuarios de la Reserva
                List<Usuario> usuarios = r.getUsuarios();
                //Verificamos si hay usuarios en la lista
                if (usuarios != null && !usuarios.isEmpty()) {
                    System.out.println("Usuarios de la reserva:");
                    for (Usuario u : usuarios) {
                        System.out.println("  - " + u.getNombres() + " " + u.getApellidos());
                    }
                } else {
                    System.out.println("No hay Usuarios asociados a esta reserva.");
                }
                
            }
            
        } catch (Exception error) {
            System.out.println("Error: " + error.getMessage());
        }
    }
    
}