package br.com.maocubo.tech.exception.utils;


public class CpfUtils {


    public static String removerFormatacao(String cpfComFormatacao) {
        return cpfComFormatacao.replaceAll("\\D", "");
    }


}
