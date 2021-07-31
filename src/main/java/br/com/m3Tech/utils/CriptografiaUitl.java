package br.com.m3Tech.utils;

import br.com.m3Tech.exception.UtilsException;

public class CriptografiaUitl {

	private static final String SEQUENCIA = "!#$()*,;-.0123456789<>@ABCDEFGHIJKLMNOPQRSTUVWXYZ[]^_abcdefghijklmnopqrstuvwxyz{|}:";
	
	private static final Integer MAX = SEQUENCIA.length();

	private CriptografiaUitl() {
	}

	public static String encrypt(String s) throws UtilsException {
		
		Integer random = IntegerUtils.random(11, 99);
		
		Integer left = Integer.valueOf(random.toString().substring(0, 1));
		Integer right = Integer.valueOf(random.toString().substring(1, 2));
		
		String retorno = random.toString();
		
		if(StringUtils.isEmpty(s) ) {
			throw new UtilsException("A String não pode ser vazio para criptografar");
		}
		
		String[] novasPosicoes = getNovasPosicoes(s,left,right);
		
		for(String item : novasPosicoes) {
			int pos = Integer.valueOf(item);
			retorno += SEQUENCIA.substring(pos,pos+1);
		}
		
		return retorno;
	}

	public static String desencrypt(String s) throws UtilsException {
		String retorno = "";
		
		if(!StringUtils.isNumeric(s.substring(0, 2))) {
			throw new UtilsException("Criptografia Inválida");
		}
		
		String[] r = getDesencrytNovasPosicoes(s);
		
		for(int i = 0; i < r.length;i += 2 ) {
			Integer pos = Integer.valueOf(r[i]) - 2;
			Integer posMais1 = Integer.valueOf(r[i + 1]) - 2;
			
			if(pos < 0) {
				pos = MAX - 1;
				posMais1 = MAX - 1;
			}
			
			if(!SEQUENCIA.substring(pos, pos + 1).equals(SEQUENCIA.substring(posMais1, posMais1 + 1))) {
				throw new UtilsException("Criptografia Inválida");
			}
			
			retorno += SEQUENCIA.substring(pos, pos + 1);
		}
		
		return retorno;
	}

	private static String[] getNovasPosicoes(String s, Integer left, Integer right) throws UtilsException {
		String nova = "";
		for (String item : getPosicoes(s)) {

			int soma = Integer.valueOf(item) + left;
			nova += (soma > MAX ? soma - MAX : soma) + ":";
			soma = Integer.valueOf(item) - right;
			nova += (soma < 0 ? soma + MAX : soma) + ":";

		}

		return nova.split(":");
	}
	
	private static String[] getDesencrytNovasPosicoes(String s) throws UtilsException {
		String nova = "";

		Integer left = Integer.valueOf(s.substring(0, 1));
		Integer right = Integer.valueOf(s.substring(1, 2));
		
		String hash = s.substring(2, s.length());
		
		int[] d = {-left,right};
		int controle = 0;
		
		String[] posicoes = getPosicoes(hash);
		
		for (String item : posicoes) {

			int soma = Integer.valueOf(item) + d[controle++];
			if(soma > MAX) {
				nova += (soma - MAX) + ":";
			}else if(soma < 0) {
				nova += (soma + MAX) + ":";
			}else {
				nova += soma + ":";
			}
			
			if(controle >= d.length) {
				controle = 0;
			}

		}

		return nova.split(":");
	}

	private static String[] getPosicoes(String s) throws UtilsException {
		String posicoes = "";

		for (int i = 0; i < s.length(); i++) {
			for (int y = 0; y < SEQUENCIA.length(); y++) {
				
				String stringOriginal = s.substring(i, i + 1);
				String stringNaLista = SEQUENCIA.substring(y, y + 1);

				if (stringOriginal.equals(stringNaLista)) {
					posicoes += (y + 1) + ":";
					break;
				}

			}
		}

		String[] split = posicoes.split(":");

		if (s.length() != split.length) {
			throw new UtilsException("Erro ao criptografar");
		}

		return split;
	}

}
