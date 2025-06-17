package br.com.alura.desafio.conversorDeMoedas.util;

import java.text.NumberFormat;
import java.util.Locale;

public class FormatadorMoeda {

    public static String formatarMoeda(double valor, String codigoMoeda) {
        Locale local;
        switch (codigoMoeda){
            case "USD" -> local = Locale.US;
            case "BRL" -> local = new Locale("pt", "BR");
            case "EUR" -> local = Locale.GERMANY;
            case "GBP" -> local = Locale.UK;
            default -> local = Locale.getDefault();
        }
        NumberFormat formatarMoeda = NumberFormat.getCurrencyInstance(local);
        return formatarMoeda.format(valor);
    }


}

