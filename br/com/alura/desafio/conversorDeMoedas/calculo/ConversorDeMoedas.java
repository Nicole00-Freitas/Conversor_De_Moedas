package br.com.alura.desafio.conversorDeMoedas.calculo;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConversorDeMoedas {
    public double converter (String moedaOrigem, String moedaDestino, double valor) throws IOException, InterruptedException {
       String endereco = "";

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        return valor;
    }


}
