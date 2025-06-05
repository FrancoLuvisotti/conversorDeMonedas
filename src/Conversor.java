import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean seguir = true;

        while (seguir) {
            Menu.exibirMenu(); // Muestra el menú
            String opcion = scanner.nextLine();

            String from = "";
            String to = "";

            switch (opcion) {
                case "1": from = "USD"; to = "ARS"; break;
                case "2": from = "ARS"; to = "USD"; break;
                case "3": from = "USD"; to = "BRL"; break;
                case "4": from = "BRL"; to = "USD"; break;
                case "5": from = "USD"; to = "COP"; break;
                case "6": from = "COP"; to = "USD"; break;
                case "7":
                    Historial.mostrar();
                    continue;
                case "8":
                    seguir = false;
                    System.out.println("¡Gracias por usar el conversor!");
                    continue;
                case "9":
                    Historial.borrar();
                    continue;
                default:
                    System.out.println("⚠️ Opción inválida. Intenta de nuevo.");
                    continue;
            }

            System.out.print("Ingrese la cantidad a convertir: ");
            double cantidad = scanner.nextDouble();
            scanner.nextLine(); // limpiar

            double resultado = CurrencyConverterAPI.convertir(from, to, cantidad);
            System.out.printf("💱 %.2f %s son %.2f %s\n\n", cantidad, from, resultado, to);

            // Guardar en el historial
            Historial.agregar(String.format("%.2f %s => %.2f %s", cantidad, from, resultado, to));
        }
        scanner.close();
    }
}
