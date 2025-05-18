//Reto 01: Reserva de vuelos
public class Main {
    public static void main(String[] args) {

        //Crear un pasajero
        Pasajero pasajero = new Pasajero("Dulce Garcia", "P123456");

        //Crear un vuelo
        Vuelo vuelo = new Vuelo("UX124", "Japón", "12:30");

        //Reservar asientp
        boolean reservado = vuelo.reservarAsiento(pasajero);
        if (reservado){
            System.out.println("Reserva realizada con éxito. \n");
        } else {
            System.out.println("No se realizo la reserva. \n");
        }

        //Mostrar itinerario
        System.out.println(vuelo.obtenerItinerario());

        //Cancelar reserva
        System.out.println("Cancelando reserva... \n");
        vuelo.cancelarReserva();

        //Mostrar itinerario actualizado
        System.out.println(vuelo.obtenerItinerario());

        //Realizar una nuevaa reservacion
        vuelo.reservarAsiento("Bernardo Vazquez", "P456789");
        System.out.println(vuelo.obtenerItinerario());
    }
}

