import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;
import com.google.gson.Gson;


public class CepQuery {

    public static String cep = "";
    private static final String linkApi = "https://viacep.com.br/";
    private static final String typeOutput = "/json/";

    public Address cepSearch() {
        Scanner inserir = new Scanner(System.in);
        System.out.print("Insira um cep: ");
        cep = inserir.nextLine().replace(".", "")
                .replace("-", "")
                .replace(" ", "");
        URI address = URI.create(linkApi + cep + typeOutput);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(address)
                .build();
        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Address.class);
        } catch (Exception e) {
            throw new RuntimeException("Não consegui obter o endereço a partir desse CEP.");
        }




    }
}
