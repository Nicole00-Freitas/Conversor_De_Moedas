package br.com.alura.desafio.conversorDeMoedas.calculo;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

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

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            System.out.println("JSON recebido da API: ");
            System.out.println(response.body());

            Gson gson = new Gson();


            return valor;
        } catch (IOException | InterruptedException e) {
            System.out.println("Erro ao tentar converter moeda: " + e.getMessage());
            return 0.0;
        }
    }

}
