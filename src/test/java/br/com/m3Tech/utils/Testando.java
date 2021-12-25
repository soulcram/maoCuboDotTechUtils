package br.com.m3Tech.utils;

public class Testando {

	public static void main(String[] args) {
    	System.out.println(LocalDateUtils.parseDate("12/02/2020"));
    	System.out.println(LocalDateUtils.parseDate("12-02-2020"));
    	System.out.println(LocalDateUtils.parseDate("2020-02-12"));
    	System.out.println(LocalDateUtils.parseDate("20200212"));
    	System.out.println(LocalDateUtils.parseDate("12022020"));
    	System.out.println(LocalDateUtils.parseDate("120220"));

	}

}
