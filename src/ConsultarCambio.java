import com.google.gson.Gson;

import java.math.BigDecimal;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarCambio {
    //https://v6.exchangerate-api.com/v6/ YOUR-API-KEY /pair/ EUR / GBP / CANTIDAD

    public BigDecimal conversion(String monedaInicial, String monedaFinal, BigDecimal montoAConvertir){

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/01ddbed0b3962a4fb6624035/pair/" + monedaInicial+"/"+monedaFinal+"/"+montoAConvertir);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            ResultadoDeLaConversion resultado = new Gson().fromJson(response.body(), ResultadoDeLaConversion.class);
            return resultado.conversion_result(); // Devolver solo el monto del cambio

        } catch (Exception e) {
            throw new RuntimeException("No se pudo realizar la conversión");
        }

    }

}
