package br.com.alura.desafio.conversorDeMoedas.servico;
import br.com.alura.desafio.conversorDeMoedas.modelo.RespostaConversaoMoeda;

import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ServicoAPI {
    public static RespostaConversaoMoeda buscarTaxa(String moedaOrigem, String moedaDestino) throws IOException, InterruptedException {
        String chaveAPI = "e7a713369fdf22c9627be300";
        String endereco = "https://v6.exchangerate-api.com/v6/"
                + chaveAPI
                + "/pair/"
                + moedaOrigem
                + "/"
                + moedaDestino;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        Gson gson = new Gson();
        return gson.fromJson(response.body(), RespostaConversaoMoeda.class);

    }
}
