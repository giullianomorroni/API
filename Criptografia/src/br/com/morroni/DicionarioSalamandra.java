package br.com.morroni;

import java.util.HashMap;
import java.util.Map;


/**
 * Contem os valores usados para criptografia e descriptografia.
 * 
 * @author giulliano.morroni
 * @see CriptografiaMorroni
 * @see Dicionario
 */
final class DicionarioSalamandra extends Dicionario {

	protected static Map<String, String> valores = new HashMap<String, String>();
	protected static Map<String, String> reversa = new HashMap<String, String>();
	protected static Map<String, String> confusao = new HashMap<String, String>();

	static {
		confusao.put("a@=a", "PEGA_TROXA_00");
		confusao.put("ao=i", "PEGA_TROXA_01");
		confusao.put("a=7c", "PEGA_TROXA_02");
		confusao.put("Ei=5", "PEGA_TROXA_03");
		confusao.put("A-Go", "PEGA_TROXA_04");
		confusao.put("7-5A", "PEGA_TROXA_05");
		confusao.put("a-n9", "PEGA_TROXA_06");
		confusao.put("hkox", "PEGA_TROXA_07");
		confusao.put("gkoo", "PEGA_TROXA_08");
		confusao.put("ek:o", "PEGA_TROXA_09");
		confusao.put("Ek&o", "PEGA_TROXA_10");
		confusao.put("ik52", "PEGA_TROXA_11");
		confusao.put("Rk2V", "PEGA_TROXA_12");
		confusao.put("moN!", "PEGA_TROXA_13");
		confusao.put("T@ox", "PEGA_TROXA_14");
		confusao.put("mk#9", "PEGA_TROXA_15");
		confusao.put("EATo", "PEGA_TROXA_16");
		confusao.put("io52", "PEGA_TROXA_17");
		confusao.put("Rkx!", "PEGA_TROXA_18");
		confusao.put("!on9", "PEGA_TROXA_19");
		confusao.put("Ta2!", "PEGA_TROXA_20");
		confusao.put("!ka9", "PEGA_TROXA_21");
		confusao.put("EaT!", "PEGA_TROXA_22");
		confusao.put("i!52", "PEGA_TROXA_23");
		confusao.put("Rx:V", "PEGA_TROXA_24");
		confusao.put("mom=", "PEGA_TROXA_25");
		confusao.put("!a6x", "PEGA_TROXA_26");
		confusao.put(":Soy", "PEGA_TROXA_27");
		confusao.put("!eob", "PEGA_TROXA_28");
		confusao.put("c=oa", "PEGA_TROXA_29");
		confusao.put("mk2:", "PEGA_TROXA_30");

		// Espaço
		reversa.put("aocb", " ");

		// Alfabeto maísculo
		reversa.put("Axa2", "A");
		reversa.put("x6:f", "B");
		reversa.put("A=xt", "C");
		reversa.put("oxAA", "D");
		reversa.put("xGfV", "E");
		reversa.put("V=zV", "F");
		reversa.put("xAbx", "G");
		reversa.put("2a0A", "H");
		reversa.put("2o=o", "I");
		reversa.put("xV9V", "J");
		reversa.put("2Sy2", "L");
		reversa.put("2oo9", "M");
		reversa.put("2Se9", "N");
		reversa.put("2=UG", "O");
		reversa.put("Q27E", "P");
		reversa.put("F:h5", "Q");
		reversa.put("2F:J", "R");
		reversa.put("xoBJ", "S");
		reversa.put("2@0A", "T");
		reversa.put("27cx", "U");
		reversa.put("2axA", "V");
		reversa.put("2A:2", "X");
		reversa.put("22HJ", "Z");
		reversa.put("2@o5", "W");
		reversa.put("2D@H", "Y");
		reversa.put(":VR6", "K");

		// Alfabeto minúsculo
		reversa.put("xxA2", "a");
		reversa.put("xA:6", "b");
		reversa.put("xxAx", "c");
		reversa.put("o!0T", "d");
		reversa.put("x5AQ", "e");
		reversa.put(":xA0", "f");
		reversa.put("x!a7", "g");
		reversa.put("2x0a", "h");
		reversa.put("xo2o", "i");
		reversa.put("x9za", "j");
		reversa.put("2r2g", "l");
		reversa.put("2nl9", "m");
		reversa.put("2jy9", "n");
		reversa.put("2xol", "o");
		reversa.put("27ht", "p");
		reversa.put("25:e", "q");
		reversa.put("e2e2", "r");
		reversa.put("x@ot", "s");
		reversa.put("2t0y", "t");
		reversa.put("2t7u", "u");
		reversa.put("2sqx", "v");
		reversa.put("2tyo", "x");
		reversa.put("w2w2", "z");
		reversa.put("29rt", "w");
		reversa.put("2rt2", "y");
		reversa.put("2yr6", "k");

		//acentuações
		reversa.put("AxdF", "á");
		reversa.put("AAdV", "à");
		reversa.put("HtY5", "ã");
		reversa.put("V9He", "â");
		reversa.put("doBx", "ä");
		reversa.put("Acdo", "Á");
		reversa.put("fRr5", "À");
		reversa.put("oxfR", "Ã");
		reversa.put("25$g", "Â");
		reversa.put("o#ro", "Ä");
		reversa.put("Tyh9", "é");
		reversa.put("9T$H", "è");
		reversa.put("ABto", "ẽ");
		reversa.put("BHu$", "ê");
		reversa.put("x57d", "ë");
		reversa.put("$2eR", "É");
		reversa.put("GR95", "È");
		reversa.put("HjUj", "Ẽ");
		reversa.put("GoaB", "Ê");
		reversa.put("AtGo", "Ë");
		reversa.put("Vgo$", "í");
		reversa.put("o5Rt", "ì");
		reversa.put("$295", "ĩ");
		reversa.put("$o9G", "î");
		reversa.put("aFu7", "ï");
		reversa.put("A=Vo", "Í");
		reversa.put("Ab=9", "Ì");
		reversa.put("AoAb", "Ĩ");
		reversa.put("aGHo", "Î");
		reversa.put("xA5o", "Ï");
		reversa.put("oA:T", "ó");
		reversa.put("5:x0", "ò");
		reversa.put("aC50", "õ");
		reversa.put("bIpA", "ô");
		reversa.put("Ac:w", "ö");
		reversa.put("Adot", "Ó");
		reversa.put("A2o7", "Ò");
		reversa.put("x=aU", "Õ");
		reversa.put("bR=o", "Ô");
		reversa.put("A=vx", "Ö");
		reversa.put("ax5T", "ú");
		reversa.put("Ar5o", "ù");
		reversa.put("ar5o", "ũ");
		reversa.put("rTx2", "û");
		reversa.put("x2eF", "ü");
		reversa.put("AoyJ", "Ú");
		reversa.put("x0Ao", "Ù");
		reversa.put("aar9", "Ũ");
		reversa.put("aoe9", "Û");
		reversa.put("ALeO", "Ü");

		// Numeros
		reversa.put("!at9", "0");
		reversa.put("x@xa", "1");
		reversa.put("2o#6", "2");
		reversa.put("oef!", "3");
		reversa.put("#vd6", "4");
		reversa.put("o:2e", "5");
		reversa.put("55#5", "6");
		reversa.put("25d&", "7");
		reversa.put("!Aw2", "8");
		reversa.put("o:A2", "9");

		// Caracteres especiais
		reversa.put("6:C2", "(");
		reversa.put("5Vf2", ")");
		reversa.put("o5@H", "[");
		reversa.put("2@JJ", "]");
		reversa.put("57ke", "{");
		reversa.put("50Le", "}");
		reversa.put("67l:", "*");
		reversa.put("69V:", "\\");
		reversa.put("2tYo", "/");
		reversa.put("o7oW", "<");
		reversa.put("o9aT", ">");
		reversa.put("6xb-", ":");
		reversa.put("6=dD", ";");
		reversa.put("5go9", "?");
		reversa.put("os99", "^");
		reversa.put("77-o", "~");
		reversa.put("M52n", "`");
		reversa.put("5Nxm", "!");
		reversa.put("6G6h", "@");
		reversa.put("A=6a", ".");
		reversa.put("7a52", "#");
		reversa.put("6ao5", "$");
		reversa.put("P7!a", "%");
		reversa.put("!69y", "\"");
		reversa.put("59Tu", "&");
		reversa.put("76Qr", ",");
		reversa.put("7Q5r", "-");
		reversa.put("7!oo", "+");
		reversa.put("7VV2", "|");
		reversa.put("v5:o", "'");
		
		//Gera os valores com base na reversa
		for(String key : reversa.keySet()){
			Boolean chaveDuplicada = valores.keySet().contains(reversa.get(key));
			Boolean valorDuplicada = (valores.get(reversa.get(key)) != null);
			if(chaveDuplicada || valorDuplicada)
				throw new IllegalArgumentException("Chave/Valor duplicada(o) " + reversa.get(key) + " " + key);
			valores.put(reversa.get(key), key);
		}

		for(String key : confusao.keySet()){
			Boolean chaveDuplicada = valores.keySet().contains(reversa.get(key));
			Boolean valorDuplicada = (valores.get(reversa.get(key)) != null);
			if(chaveDuplicada || valorDuplicada)
				throw new IllegalArgumentException("Chave/Valor duplicada(o) " + reversa.get(key) + " " + key);
			valores.put(confusao.get(key), key);
		}
	}

	Map<String, String> getValores() {
		return valores;
	}

	Map<String, String> getReversa() {
		return reversa;
	}

	Map<String, String> getConfusao() {
		return confusao;
	}
}
