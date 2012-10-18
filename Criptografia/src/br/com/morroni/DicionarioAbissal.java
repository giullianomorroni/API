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
final class DicionarioAbissal extends Dicionario {

	protected static Map<String, String> valores = new HashMap<String, String>();
	protected static Map<String, String> reversa = new HashMap<String, String>();
	protected static Map<String, String> confusao = new HashMap<String, String>();

	
	static {
		confusao.put("a@=a", "PEGA_TROXA_00");
		confusao.put("a5=i", "PEGA_TROXA_01");
		confusao.put("a=1c", "PEGA_TROXA_02");
		confusao.put("Ei=5", "PEGA_TROXA_03");
		confusao.put("A-G5", "PEGA_TROXA_04");
		confusao.put("1-5A", "PEGA_TROXA_05");
		confusao.put("a-n8", "PEGA_TROXA_06");
		confusao.put("hk51", "PEGA_TROXA_07");
		confusao.put("gk55", "PEGA_TROXA_08");
		confusao.put("ek!o", "PEGA_TROXA_09");
		confusao.put("Ek&5", "PEGA_TROXA_10");
		confusao.put("ik52", "PEGA_TROXA_11");
		confusao.put("Rk2V", "PEGA_TROXA_12");
		confusao.put("m5N!", "PEGA_TROXA_13");
		confusao.put("T@51", "PEGA_TROXA_14");
		confusao.put("mk#8", "PEGA_TROXA_15");
		confusao.put("EAT5", "PEGA_TROXA_16");
		confusao.put("i552", "PEGA_TROXA_17");
		confusao.put("Rk1!", "PEGA_TROXA_18");
		confusao.put("!5n9", "PEGA_TROXA_19");
		confusao.put("Ta3!", "PEGA_TROXA_20");
		confusao.put("!ka8", "PEGA_TROXA_21");
		confusao.put("EaT!", "PEGA_TROXA_22");
		confusao.put("i!52", "PEGA_TROXA_23");
		confusao.put("Rx!V", "PEGA_TROXA_24");
		confusao.put("m5m=", "PEGA_TROXA_25");
		confusao.put("!a61", "PEGA_TROXA_26");
		confusao.put("!S5y", "PEGA_TROXA_27");
		confusao.put("!e5b", "PEGA_TROXA_28");
		confusao.put("c=5a", "PEGA_TROXA_29");
		confusao.put("mk3!", "PEGA_TROXA_30");

		// Espaço
		reversa.put("b8ca", " ");

		// Alfabeto maísculo
		reversa.put("!VR6", "A");
		reversa.put("A1a2", "B");
		reversa.put("16!f", "C");
		reversa.put("A=1t", "D");
		reversa.put("51AA", "E");
		reversa.put("1GfV", "F");
		reversa.put("V=zV", "G");
		reversa.put("1Ab1", "H");
		reversa.put("2a0A", "I");
		reversa.put("25=5", "J");
		reversa.put("1V9V", "L");
		reversa.put("2Sy2", "M");
		reversa.put("3559", "N");
		reversa.put("2Se8", "O");
		reversa.put("2=UG", "P");
		reversa.put("Q21E", "Q");
		reversa.put("F!h5", "R");
		reversa.put("2F!J", "S");
		reversa.put("15BJ", "T");
		reversa.put("3@0A", "U");
		reversa.put("31c1", "V");
		reversa.put("3a1A", "X");
		reversa.put("3A!3", "Z");
		reversa.put("33HJ", "W");
		reversa.put("2@55", "Y");
		reversa.put("3D@H", "K");

		// Alfabeto minúsculo
		reversa.put("2yr6", "a");
		reversa.put("11A2", "b");
		reversa.put("1A!6", "c");
		reversa.put("11A1", "d");
		reversa.put("5!0T", "e");
		reversa.put("15AQ", "f");
		reversa.put("!1A0", "g");
		reversa.put("1!a1", "h");
		reversa.put("210a", "i");
		reversa.put("x525", "j");
		reversa.put("19za", "l");
		reversa.put("2r2g", "m");
		reversa.put("3nl9", "n");
		reversa.put("2jy8", "o");
		reversa.put("21ol", "p");
		reversa.put("21ht", "q");
		reversa.put("35!e", "r");
		reversa.put("e2e3", "s");
		reversa.put("1@5t", "t");
		reversa.put("3t0y", "u");
		reversa.put("3t1u", "v");
		reversa.put("3sq1", "x");
		reversa.put("3ty5", "z");
		reversa.put("w3w3", "w");
		reversa.put("29rt", "y");
		reversa.put("3rt2", "k");

		//acentuações
		reversa.put("A1dF", "á");
		reversa.put("AAdV", "à");
		reversa.put("HtY5", "ã");
		reversa.put("V8He", "â");
		reversa.put("d5B1", "ä");
		reversa.put("Acd5", "Á");
		reversa.put("fRr5", "À");
		reversa.put("51fR", "Ã");
		reversa.put("25$g", "Â");
		reversa.put("5#r5", "Ä");
		reversa.put("Tyh8", "é");
		reversa.put("8T$H", "è");
		reversa.put("ABt5", "ẽ");
		reversa.put("BHu$", "ê");
		reversa.put("151d", "ë");
		reversa.put("$3eR", "É");
		reversa.put("GR85", "È");
		reversa.put("HjUj", "Ẽ");
		reversa.put("G5aB", "Ê");
		reversa.put("AtG5", "Ë");
		reversa.put("Vg5$", "í");
		reversa.put("55Rt", "ì");
		reversa.put("$285", "ĩ");
		reversa.put("$58G", "î");
		reversa.put("aFu1", "ï");
		reversa.put("A=V5", "Í");
		reversa.put("Ab=8", "Ì");
		reversa.put("A5Ab", "Ĩ");
		reversa.put("aGH5", "Î");
		reversa.put("1A55", "Ï");
		reversa.put("5A!T", "ó");
		reversa.put("5!10", "ò");
		reversa.put("aC50", "õ");
		reversa.put("bIpA", "ô");
		reversa.put("Ac!w", "ö");
		reversa.put("Ad5t", "Ó");
		reversa.put("A251", "Ò");
		reversa.put("1=aU", "Õ");
		reversa.put("bR=5", "Ô");
		reversa.put("A=v1", "Ö");
		reversa.put("a15T", "ú");
		reversa.put("Ar55", "ù");
		reversa.put("ar55", "ũ");
		reversa.put("rT12", "û");
		reversa.put("12eF", "ü");
		reversa.put("A5yJ", "Ú");
		reversa.put("10A5", "Ù");
		reversa.put("aar8", "Ũ");
		reversa.put("a5e8", "Û");
		reversa.put("ALeO", "Ü");

		// Numeros
		reversa.put("5!A3", "0");
		reversa.put("!at8", "1");
		reversa.put("1@1a", "2");
		reversa.put("35#6", "3");
		reversa.put("5ef!", "4");
		reversa.put("#vd6", "5");
		reversa.put("5!3e", "6");
		reversa.put("55#5", "7");
		reversa.put("25d&", "8");
		reversa.put("!Aw2", "9");

		// Caracteres especiais
		reversa.put("6!C3", "(");
		reversa.put("5Vf3", ")");
		reversa.put("55@H", "[");
		reversa.put("3@JJ", "]");
		reversa.put("51ke", "{");
		reversa.put("50Le", "}");
		reversa.put("61l!", "*");
		reversa.put("68V!", "\\");
		reversa.put("3tY5", "/");
		reversa.put("515W", "<");
		reversa.put("59aT", ">");
		reversa.put("61b-", ";");
		reversa.put("6=dD", "!");
		reversa.put("5g58", "?");
		reversa.put("5s88", "^");
		reversa.put("11-5", "~");
		reversa.put("M52n", "`");
		//reversa.put("1nf0", "'");
		reversa.put("5N1m", "@");
		reversa.put("6G6h", "!");
		reversa.put("A=6a", ".");
		reversa.put("1a53", "$");
		reversa.put("6a55", "#");
		reversa.put("P1!a", "%");
		reversa.put("!69y", "\"");
		reversa.put("59Tu", ",");
		reversa.put("16Qr", "&");
		reversa.put("1Q5r", "-");
		reversa.put("1!55", "+");
		reversa.put("1VV2", "|");
		reversa.put("v5!5", "'");

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
