package br.com.alura.desafio.conversorDeMoedas.principal;
import br.com.alura.desafio.conversorDeMoedas.calculo.ConversorDeMoedas;
import br.com.alura.desafio.conversorDeMoedas.util.FormatadorMoeda;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        String moedaOrigem;
        String moedaDestino;
        int opcaoEscolhida;
        double valorASerConvertido;

        while (true) {
            try {
                Scanner leitura = new Scanner(System.in);
                System.out.println("========CONVERSOR DE MOEDAS===========");
                System.out.println("Digite o número de uma das opções:");
                System.out.println("1- Dólar -> Real");
                System.out.println("2- Real -> Dólar");
                System.out.println("3- Dólar -> Euro");
                System.out.println("4- Euro -> Dólar");
                System.out.println("5- Dólar-> Libra");
                System.out.println("6- Libra -> Dólar");
                System.out.println("0- Sair");
                System.out.println("======================================");

                opcaoEscolhida = leitura.nextInt();

                if (opcaoEscolhida == 0) {
                    System.out.println("Programa encerrado pelo usuário.");
                    break;
                }

                if (opcaoEscolhida < 1 || opcaoEscolhida > 6){
                    System.out.println("Opção inválida, escolha entre 1 a 6.\n");
                    continue;
                }

                System.out.println("Digite o valor que deve ser convertido:");
                valorASerConvertido = leitura.nextDouble();

                if (valorASerConvertido <= 0) {
                    System.out.println("Valor inválido. Digite um valor positivo.\n");
                    continue;
                }

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
                System.out.printf(" %s %s equivalem a %s %s\n",
                        valorOrigemFormatado,
                        moedaOrigem,
                        valorDestinoFormatado,
                        moedaDestino);
                System.out.println("👋🏼 Programa encerrado após a conversão");
                break;

            }catch (Exception e){
                System.out.println("Entrada inválida! Use apenas números. \n");
            }

        }
    }
}

