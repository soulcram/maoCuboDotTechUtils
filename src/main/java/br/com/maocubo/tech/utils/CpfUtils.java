package br.com.maocubo.tech.utils;


public class CpfUtils {


    public static String removerFormatacao(String cpfComFormatacao) {
        return cpfComFormatacao.replaceAll("\\D", "");
    }


}
