package br.com.alura.desafio.conversorDeMoedas.principal;
import br.com.alura.desafio.conversorDeMoedas.calculo.ConversorDeMoedas;
import br.com.alura.desafio.conversorDeMoedas.util.FormatadorMoeda;
import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        String moedaOrigem;
        String moedaDestino;
        int opcaoEscolhida;
        double valorASerConvertido;

        Scanner leitura = new Scanner(System.in);
        System.out.println("========CONVERSOR DE MOEDAS===========");
        System.out.println("Digite o número de uma das opções:");
        System.out.println("1- Dólar -> Real");
        System.out.println("2- Real -> Dólar");
        System.out.println("3- Dólar -> Euro");
        System.out.println("4- Euro -> Dólar");
        System.out.println("5- Dólar-> Libra");
        System.out.println("6- Libra -> Dólar");
        System.out.println("======================================");
        opcaoEscolhida = leitura.nextInt();

        if (opcaoEscolhida < 1 || opcaoEscolhida > 6){
            System.out.println("Opção inválida, escolha entre 1 a 6. O programa será encerrado.");
            return;
        }

        System.out.println("Digite o valor que deve ser convertido:");
        valorASerConvertido = leitura.nextDouble();

        System.out.println("Você escolheu a opção: " + opcaoEscolhida);
        System.out.println("Valor informado: " + valorASerConvertido);

        switch (opcaoEscolhida) {
            case 1:
                moedaOrigem = "USD";
                moedaDestino = "BRL";
                break;

            case 2:
                moedaOrigem = "BRL";
                moedaDestino = "USD";
                break;

            case 3:
                moedaOrigem = "USD";
                moedaDestino = "EUR";
                break;

            case 4:
                moedaOrigem = "EUR";
                moedaDestino = "USD";
                break;

            case 5:
                moedaOrigem = "USD";
                moedaDestino = "GBP";
                break;

            case 6:
                moedaOrigem = "GBP";
                moedaDestino = "USD";
                break;

            default:
                System.out.println("Opção inválida.");
                return;
        }

        ConversorDeMoedas conversor = new ConversorDeMoedas();
        double valorConvertido = conversor.converter(moedaOrigem, moedaDestino, valorASerConvertido);

        String valorOrigemFormatado = FormatadorMoeda.formatarMoeda(valorASerConvertido, moedaOrigem);
        String valorDestinoFormatado = FormatadorMoeda.formatarMoeda(valorConvertido, moedaDestino);

        System.out.println("\n Conversão realizada com sucesso!");
       // System.out.printf(" Conversão concluída: "  %s %s, "equivalem a " %s %s,
       //         valorOrigemFormatado,
        //        moedaOrigem,
        //        valorDestinoFormatado,
        //        moedaDestino);

    }
}
