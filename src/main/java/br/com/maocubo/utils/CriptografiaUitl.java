package br.com.maocubo.utils;

import br.com.maocubo.exception.UtilsException;

public class CriptografiaUitl {

	private static final String SEQUENCIA = "!#$()*,;-.03k5Z7x8<@ABCDFTGHIJK}LMNdOPQRSU6VW2Y[]^_abcefgh1ijlmno>pq4rEstu9vwXyz{|:";
		
	private static final Integer MAX = SEQUENCIA.length();

	private CriptografiaUitl() {
	}

	public static String encrypt(String s) throws UtilsException {
						
		Integer left = IntegerUtils.random(1, 9);
		Integer right = IntegerUtils.random(1, 9);
		
		String retorno = left.toString()+right.toString();
		
		if(StringUtils.isEmpty(s) ) {
			throw new UtilsException("A String não pode ser vazio para criptografar");
		}
		
		String novasPosicoes = getNovasPosicoes(s,left,-right);
		//cwukfzdx
		return retorno += novasPosicoes;
	}

	public static String desencrypt(String s) throws UtilsException {
		String retorno = "";
		
		if(!StringUtils.isNumeric(s.substring(0, 2))) {
			throw new UtilsException("Criptografia Inválida");
		}
		
		String r = getDesencrytNovasPosicoes(s);
		
		for(int i = 0; i < r.length();i += 2 ) {
			String pos = r.substring(i, i + 1);
			String posMais1 = r.substring(i + 1, i + 2);
			
			if(!pos.equals(posMais1)) {
				throw new UtilsException("Criptografia Inválida");
			}
			
			retorno += pos;
		}
		
		return retorno;
	}

	private static String getNovasPosicoes(String s, Integer left, Integer right) throws UtilsException {
		String nova = "";
		
		String[] posicoes = getPosicoes(s);
		
		for (String item : posicoes) {
			
			nova += getCharSequence(Integer.valueOf(item),left);
			nova += getCharSequence(Integer.valueOf(item),right);

		}

		return nova;
	}
	
	private static String getDesencrytNovasPosicoes(String s) throws UtilsException {
		String nova = "";

		Integer left = Integer.valueOf(s.substring(0, 1));
		Integer right = Integer.valueOf(s.substring(1, 2));
		
		String hash = s.substring(2, s.length());
		
		int[] d = {-left,right};
		int controle = 0;
		
		String[] posicoes = getPosicoes(hash);
		
		for (String item : posicoes) {
			
			nova += getCharSequence(Integer.valueOf(item),d[controle++]);
			
			if(controle >= d.length) {
				controle = 0;
			}

		}

		return nova;
	}
	
	private static String getCharSequence(int posIni, int quant) {
		
		int iterator = quant > 0 ? 1 : -1;
		
		if(quant < 0) {
			quant *= -1;
		}
		
		int repetidor = 1;
		
		for(int i = posIni;; ) {
			
			i += iterator;
			
			 if(i > MAX - 1) {
				 i = 0;
			 }else if(i < 0) {
				 i = MAX - 1;
			 }
			 
			 if(repetidor++ == quant) {
					return SEQUENCIA.substring(i, i + 1);
				}
		}
		
	}

	private static String[] getPosicoes(String s) throws UtilsException {
		String posicoes = "";

		for (int i = 0; i < s.length(); i++) {
			for (int y = 0; y < SEQUENCIA.length(); y++) {
				
				String stringOriginal = s.substring(i, i + 1);
				String stringNaLista = SEQUENCIA.substring(y, y + 1);

				if (stringOriginal.equals(stringNaLista)) {
					posicoes += y  + ":";
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
