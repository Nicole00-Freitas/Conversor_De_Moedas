package br.com.alura.desafio.conversorDeMoedas.modelo;

public record RespostaConversaoMoeda(String base_code, String target_code, double conversion_rate) {

    @Override
    public String toString() {
        return "Conversão de " + base_code + " para " + target_code + " | Taxa: " + conversion_rate;
    }
}
