package br.com.morroni;

import java.util.Map;

/**
 * Classe de criptografia. Aceita o alfabeto inteiro, diferencia
 * maiúscula de minúscula, aceita caracteres especiais e números.
 * 
 * @author Giulliano Morroni
 * @see Dicionario
 * 
 * Alfabeto A-Z 															TOTAL 26 possibilidades. 
 * Números 0-9  															TOTAL 10 possibilidades.
 * Caracteres especiais permitidos: ()[]{}*\/<>:;?^~'`!@.#$%"&=-'|,+ 		TOTAL 32 possibilidades
 */
public final class CriptografiaMorroni {

	protected CriptografiaMorroni() {
		super();
	}

	public static void main(String[] args) {
		System.out.println(criptografar("Giulliano"));
		System.out.println(criptografar("11111"));
		System.out.println(criptografar("123456"));
		System.out.println(criptografar("Morroni"));
	}
	
	/**
	 * Criptografa a palavra recebida, e adiciona alguns valores
	 * que não fazem parte da palavra, com o intuito de confundir 
	 * possíveis tentativas de hackeamento.
	 * 
	 * @param valor
	 * @return
	 */
	public static String criptografar(String valor) {
		String retorno = new String();

		//Existem 3 dicionários com hashs. Aqui é feito o sorteio de qual será usado 
		String sorteio = String.valueOf(Math.random()).substring(3, 4);
		Dicionario dicionario = Dicionario.obter(sorteio);
		Map<String, String> valores = dicionario.getValores();

		String confusaoInicial = confudirInicio(String.valueOf(Math.random()).substring(3, 15), dicionario);

		char[] letras = valor.toCharArray();
		Integer contador = 0;
		for (char c : letras) {
			retorno += valores.get(String.valueOf(c));
			contador++;
			if (contador % 2 == 0) {
				String pegaTroxa = posicaoAleatoriaCaotica();
				String hash = valores.get(pegaTroxa);
				if (hash != null && !hash.equals("null"))
					retorno += hash;
			}
		}

		String confudirFinal = confudirFinal(dicionario);
		return sorteio + confusaoInicial + retorno + confudirFinal;
	}

	/**
	 * Descriptografa a palavra, ignorando os valores usados
	 * para confundir no método de criptografia.
	 * 
	 * @param valor
	 * @return
	 */
	public static String descriptografar(String valor) {
		if (valor == null || valor.trim().length() == 0)
			return valor;

		Dicionario dicionario = Dicionario.obter(valor.substring(0, 1));

		//Ignora o primeiro caracter (posição 0) que serve apenas para identificar o dicionário
		valor =	valor.substring(1, valor.length());
		Map<String, String> valores = dicionario.getReversa();

		char[] letras = valor.toCharArray();
		valor = "";
		for (int i=0; i < letras.length;) {
			if(i+3 >= letras.length)
				break;
			String aux = valores.get(String.valueOf(letras[i] +""+ letras[i+1] +""+ letras[i+2] +""+ letras[i+3]));
			valor += aux == null ? "" : aux;
			i = i+4;
		}
		return valor;
	}


	/**
	 * Gera valores aleatórios que não fazem parte da palavra.
	 * 
	 * @param valor
	 * @return
	 */
	private static String confudirInicio(String valor, Dicionario dicionario) {
		if(valor == null || valor.trim().length() == 0)
			return valor;

		Map<String, String> valores = dicionario.getValores();
		Integer inicio = 4;

		//Tente confudir em 10 tentativas, método caótico. 
		for (int i = 0; i < 10; i++){
			//Precisa estar entre 01 e 30 conforme dicionário PEGA_TROXA.
			String pegaTroxa = posicaoAleatoriaCaotica();
			String hash = valores.get(pegaTroxa);

			if(hash != null && !hash.equals("null")){
				String comeco = valor.substring(0, inicio);
				String resto = valor.substring(inicio);
				valor = comeco + hash + resto;
				inicio += 4;
			}
		}
		return valor;
	}

	private static String confudirFinal(Dicionario dicionario) {
		String valor = new String();
		Map<String, String> valores = dicionario.getValores();
		//Tente confudir em 10 tentativas, método caótico. 
		for (int i = 0; i < 10; i++){
			//Precisa estar entre 01 e 30 conforme dicionário PEGA_TROXA.
			String pegaTroxa = posicaoAleatoriaCaotica();
			String hash = valores.get(pegaTroxa);
			if(hash != null && !hash.equals("null")){
				valor += hash;
			}
		}
		return valor;
	}

	private static String posicaoAleatoriaCaotica() {
		String posicaoPegaTroxa = String.valueOf(Math.random()).substring(3, 5);
		Integer posicao = new Integer(posicaoPegaTroxa);
		String pegaTroxa = "PEGA_TROXA_" + (posicao < 10 ? "0"+posicao : posicao);
		return pegaTroxa;
	}
	

}
