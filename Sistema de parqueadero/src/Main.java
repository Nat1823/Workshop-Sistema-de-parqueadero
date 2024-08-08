import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Parqueadero parqueadero = new Parqueadero(5, 10, 100);

        while (true) {
            // Mostrar el menú
            System.out.println("=== Menú del Parqueadero ===");
            System.out.println("1. Estacionar un carro");
            System.out.println("2. Calcular costo por tiempo");
            System.out.println("3. Mostrar estado del parqueadero");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); //

            switch (opcion) {
                case 1:
                    // Estacionar un carro
                    System.out.print("Ingresa la placa del carro: ");
                    String placa = scanner.nextLine();
                    System.out.print("Ingresa la marca del carro: ");
                    String marca = scanner.nextLine();
                    System.out.print("Ingresa el modelo del carro: ");
                    String modelo = scanner.nextLine();

                    Carro carro = new Carro(placa, marca, modelo);

                    System.out.print("Digite la fila para estacionar el carro: ");
                    int fila = scanner.nextInt();
                    System.out.print("Digite la columna para estacionar el carro: ");
                    int columna = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer del scanner

                    boolean estacionado = parqueadero.parquearCarro(carro, fila, columna);
                    System.out.println("Estacionamiento: " + (estacionado ? "Exitoso" : "Fallido"));
                    break;

                case 2:
                    // Calcular costo por tiempo
                    System.out.print("Introduce el número de horas: ");
                    int horas = scanner.nextInt();
                    scanner.nextLine();

                    double costo = parqueadero.cobrarPorTiempo(horas);
                    System.out.println("Costo por " + horas + " horas: " + costo);
                    break;

                case 3:
                    // Mostrar estado del parqueadero
                    parqueadero.mostrarEstadoParqueadero();
                    break;

                case 4:
                    // Salir
                    System.out.println("Chao");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opción no válida. Por favor, elige una opción del menú.");
            }
        }
    }
}
