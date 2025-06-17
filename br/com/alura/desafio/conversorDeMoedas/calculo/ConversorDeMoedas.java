package br.com.alura.desafio.conversorDeMoedas.calculo;

import br.com.alura.desafio.conversorDeMoedas.modelo.RespostaConversaoMoeda;
import br.com.alura.desafio.conversorDeMoedas.servico.ServicoAPI;
import java.io.IOException;


public class ConversorDeMoedas {
    public double converter (String moedaOrigem, String moedaDestino, double valor)  {

        try {
            RespostaConversaoMoeda resposta = ServicoAPI.buscarTaxa(moedaOrigem, moedaDestino);
                System.out.println("Detalhes técnicos: " + resposta);
                return valor * resposta.conversion_rate();

        } catch (IOException | InterruptedException e) {
            System.out.println("Erro ao tentar converter moeda: " + e.getMessage());
            return 0.0;
        }

    }
}
