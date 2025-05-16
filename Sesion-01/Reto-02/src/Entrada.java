
//......RETO 02: REGISTRO BASICO DE ENTRADAS......

//Clase llamada Entrada
public class Entrada {

    //Atributos
    String nombre_Evento;
    double Precio_Entrada;

//Constructor que recibe ambos valores al momento de crear el objeto
    public Entrada(String nombre_Evento, double Precio_Entrada) {
        this.nombre_Evento = nombre_Evento;
        this.Precio_Entrada = Precio_Entrada;
    }
    //Metodo publico que imprime la informacion
        public void mostrarInformacion(){

        System.out.println("Nombre del Evento:"+ nombre_Evento + "/ Precio:"+Precio_Entrada);

    }
}

