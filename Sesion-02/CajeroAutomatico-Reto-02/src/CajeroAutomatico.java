import java.util.Scanner;

public class CajeroAutomatico {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in); //Crear objeto Scanner
            double saldo = 1000.0; //Saldo inicial
            int opcion; //almacena las opciones del menú

            // Repetir el menú mientras la opción no sea salir
            do {
                //Mostrar menú de opciones
                System.out.println("\n Bienvenido el cajero automático");
                System.out.println("1- Consultar saldo");
                System.out.println("2- Depositar dinero");
                System.out.println("3- Retirar dinero ");
                System.out.println("4- Salir");

                //Leer la opción seleccionada por el usuario
                System.out.print("Selecciona una opcion: ");
                opcion = sc.nextInt(); //Leer la opción elegida por el usuario.

                //Estructura switch para manejar las opciones del menú.
                switch (opcion) {
                    case 1 ->
                        //Consular saldo
                            System.out.println("Tu Saldo actual es: $" + saldo);

                    //Depositar dinero
                    case 2 -> {
                        System.out.print("Ingrese el monto a depositar: ");
                        double deposito = sc.nextDouble();

                        //Monto mayor a 0
                        if (deposito <= 0) {

                            System.out.println("El monto debe ser mayor a 0");
                        } else {
                            saldo += deposito;
                            System.out.println("Has depositado:$" + deposito);
                            System.out.println("El saldo actual es: $" + saldo);
                        }
                    }

                    case 3 -> {
                        //Retirar dinero
                        System.out.print("Ingrese el monto a retirar: ");
                        double retiro = sc.nextDouble();

                        if (retiro <= 0) {
                            System.out.println("El monto a retirar debe ser positivo");
                        } else if (retiro > saldo) {
                            System.out.println("Fondos insuficientes. No puedes retirar esa cantidad");
                        } else {
                            saldo -= retiro;
                            System.out.println("Has retirado: $" + retiro);
                            System.out.println("Saldo actualizado: $" + saldo);
                        }
                    }

                    case 4 -> System.out.println("Gracias por usar el cajero. ¡Hasta pronto!");

                    default -> System.out.println("Opción no válida. Por favor, elige otra opción");
                }

            } while (opcion != 4); // El ciclo continúa hasta que el usuario elige salir

            sc.close(); // Cerrar Scanner
        }
    }

