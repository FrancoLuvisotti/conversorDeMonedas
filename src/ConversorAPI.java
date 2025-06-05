import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConversorAPI {
    private static final String API_KEY = "2cc421d1b5ab6c64089166d2";

    public static double convertir(String from, String to, double amount) {
        try {
            String url = String.format(
                    "https://v6.exchangerate-api.com/v6/%s/pair/%s/%s",
                    API_KEY, from, to
            );

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            // Parsear la respuesta con Gson
            JsonObject json = JsonParser.parseString(response.body()).getAsJsonObject();

            if (json.get("result").getAsString().equals("success")) {
                double rate = json.get("conversion_rate").getAsDouble();
                return rate * amount;
            } else {
                System.out.println("❌ Error en la API: " + json.get("error-type").getAsString());
            }
        } catch (Exception e) {
            System.out.println("❌ Error al conectar con la API: " + e.getMessage());
        }
        return 0.0;
    }
}
