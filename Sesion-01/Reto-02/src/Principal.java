
//......RETO 02: REGISTRO BASICO DE ENTRADAS......
public class Principal {

        public static void main(String[] args) {

            //Objetos de tipo Entrada
            Entrada entrada1 = new Entrada("Obra de Teatro", 800.00);
            Entrada entrada2 = new Entrada("Concierto BEDU",1000.000);

            //llamando al metrodo mostrarInformacion, que muestra los datos en consola
            entrada1.mostrarInformacion();
            entrada2.mostrarInformacion();
    }
}
