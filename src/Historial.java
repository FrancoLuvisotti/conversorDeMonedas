import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Historial {
    private static final String ARCHIVO = "historial.txt";
    private static final List<String> historial = new ArrayList<>();

    public static void agregar(String entrada) {
        String fechaHora = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date());
        String registro = String.format("[%s] %s", fechaHora, entrada);
        historial.add(registro);

        try (FileWriter writer = new FileWriter(ARCHIVO, true)) {
            writer.write(registro + "\n");
        } catch (IOException e) {
            System.out.println("❌ Error al guardar en el archivo: " + e.getMessage());
        }
    }

    public static void mostrar() {
        System.out.println("📜 Historial de conversiones:");
        File file = new File(ARCHIVO);

        if (!file.exists()) {
            System.out.println("📭 No hay conversiones registradas.");
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String linea;
            boolean vacio = true;
            while ((linea = reader.readLine()) != null) {
                System.out.println("- " + linea);
                vacio = false;
            }

            if (vacio) {
                System.out.println("📭 No hay conversiones registradas.");
            }
        } catch (IOException e) {
            System.out.println("❌ Error al leer el historial: " + e.getMessage());
        }
    }

    public static void borrar() {
        try (FileWriter writer = new FileWriter(ARCHIVO, false)) {
            writer.write(""); // Sobrescribe con nada
            historial.clear();
            System.out.println("🗑️ Historial eliminado correctamente.");
        } catch (IOException e) {
            System.out.println("❌ Error al borrar historial: " + e.getMessage());
        }
    }
}
