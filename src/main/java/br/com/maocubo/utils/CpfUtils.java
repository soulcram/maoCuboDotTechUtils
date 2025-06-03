package br.com.maocubo.utils;


public class CpfUtils {


    public static String removerFormatacao(String cpfComFormatacao) {
        return cpfComFormatacao.replaceAll("\\D", "");
    }


}
