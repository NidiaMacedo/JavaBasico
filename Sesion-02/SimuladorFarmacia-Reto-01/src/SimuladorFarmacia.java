
import java.util.Scanner;
//Reto 01: Simulador de farmacia con descuento
public class SimuladorFarmacia {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Datos solicitados al usuario
        System.out.println("Nombre de Medicamento:");
        String nombremedicamento = sc.nextLine();

        System.out.println("Precio Unitario: ");
        double precio_unitario = sc.nextDouble();

        System.out.println("Cantidad de Piezas: ");
        int cantidad_piezas = sc.nextInt();

        //Cálculamos el total
        double totalSinDescuento = precio_unitario * cantidad_piezas;

        //Evaluamos si aplica descuento

        var AplicaDescuento = totalSinDescuento > 500;
        double descuento = AplicaDescuento ? totalSinDescuento * 0.15 : 0;

        //Total a pagar

        double TotalConDescuento = totalSinDescuento - descuento;

        System.out.println("\nResumen de compra: ");
        System.out.println("Medicamento:" + nombremedicamento);
        System.out.println("Cantidad:" + cantidad_piezas);
        System.out.println("Precio Unitario:" + precio_unitario);
        System.out.println("Total sin Descuento:" + totalSinDescuento);
        System.out.println("Aplica descuento?: " + AplicaDescuento);
        System.out.println("Descuento:" + descuento);
        System.out.println("Total a Pagar:" + TotalConDescuento);

        sc.close();
    }
}

