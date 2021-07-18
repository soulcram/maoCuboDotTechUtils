package br.com.m3Tech.utils;

import br.com.m3Tech.exception.UtilsException;

public class CriptografiaUitl {

	private static final String SEQUENCIA = "!#$%&()*+,-./0123456789:<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[]^_abcdefghijklmnopqrstuvwxyz{|}";

	private CriptografiaUitl() {
	}

	public static String encrypt(String s) throws UtilsException {
		String retorno = "";
		
		if(s == null || "".equals(s)) {
			throw new UtilsException("O campo senha n�o pode ser vazio");
		}
		
		for(String item : getNovasPosicoes(s)) {
			int pos = Integer.valueOf(item);
			retorno += SEQUENCIA.substring(pos,pos+1);
		}
		
		return retorno;
	}

	public static String desencrypt(String s) throws UtilsException {
		String retorno = "";
		String[] r = getDesencrytNovasPosicoes(s);
		
		for(int i = 0; i < r.length;i += 4 ) {
			Integer pos = Integer.valueOf(r[i]) - 2;
			retorno += SEQUENCIA.substring(pos, pos + 1);
		}
		
		return retorno;
	}

	private static String[] getNovasPosicoes(String s) throws UtilsException {
		String nova = "";
		for (String item : getPosicoes(s)) {

			int soma = Integer.valueOf(item) + 5;
			nova += (soma > 91 ? soma - 91 : soma) + ";";
			soma = Integer.valueOf(item) - 5;
			nova += (soma < 0 ? soma + 91 : soma) + ";";
			soma = Integer.valueOf(item) + 8;
			nova += (soma > 91 ? soma - 91 : soma) + ";";
			soma = Integer.valueOf(item) - 4;
			nova += (soma < 0 ? soma + 91 : soma) + ";";

		}

		return nova.split(";");
	}
	
	private static String[] getDesencrytNovasPosicoes(String s) throws UtilsException {
		String nova = "";
		int[] d = {-5,5,-8,4};
		int controle = 0;
		for (String item : getPosicoes(s)) {

			int soma = Integer.valueOf(item) + d[controle++];
			if(soma > 91) {
				nova += (soma - 91) + ";";
			}else if(soma < 0) {
				nova += (soma + 91) + ";";
			}else {
				nova += soma + ";";
			}
			
			if(controle > 3) {
				controle = 0;
			}

		}

		return nova.split(";");
	}

	private static String[] getPosicoes(String s) throws UtilsException {
		String posicoes = "";

		for (int i = 0; i < s.length(); i++) {
			for (int y = 0; y < SEQUENCIA.length(); y++) {

				if (s.substring(i, i + 1).equals(SEQUENCIA.substring(y, y + 1))) {
					posicoes += (y + 1) + ";";
					break;
				}

			}
		}

		String[] split = posicoes.split(";");

		if (s.length() != split.length) {
			throw new UtilsException("Senha inv�lida");
		}

		return split;
	}

}
