//Reto 01: Registro y comparación de facturas
public class Main {
    public static void main(String[] args) {

        // Creamos dos facturas
        Factura f1 = new Factura("FAC001","Juan Pérez", 1450.0);
        Factura f2 = new Factura("FAC001", "Comercial XYZ", 1450.0);

        // Hash codes
        //System.out.println("Hash de f1: " + f1.hashCode());
        //System.out.println("Hash de f2:" + f2.hashCode());

        //mostrar informacion
        System.out.println(f1);

        System.out.println(f2);

        // Comparación con equals()
        System.out.println("¿Son iguales?: " + f1.equals(f2));  // true

    }
}