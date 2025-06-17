package br.com.alura.desafio.conversorDeMoedas.calculo;

import br.com.alura.desafio.conversorDeMoedas.modelo.RespostaConversaoMoeda;
import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import static java.net.http.HttpClient.newHttpClient;

public class ConversorDeMoedas {
    public double converter (String moedaOrigem, String moedaDestino, double valor)  {

        try {
            String chaveAPI = "e7a713369fdf22c9627be300";
            String endereco = "https://v6.exchangerate-api.com/v6/"
                    + chaveAPI
                    + "/pair/"
                    + moedaOrigem
                    + "/"
                    + moedaDestino;

            HttpClient client = newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            Gson gson = new Gson();
            RespostaConversaoMoeda resposta = gson.fromJson(response.body(), RespostaConversaoMoeda.class);

            System.out.println(" Detalhes técnicos: " + resposta);
            return valor * resposta.conversion_rate();


        } catch (IOException | InterruptedException e) {
            System.out.println("Erro ao tentar converter moeda: " + e.getMessage());
            return 0.0;
        }
    }
}
