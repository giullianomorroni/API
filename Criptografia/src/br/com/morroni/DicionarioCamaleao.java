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
final class DicionarioCamaleao extends Dicionario {

	protected static Map<String, String> valores = new HashMap<String, String>();
	protected static Map<String, String> reversa = new HashMap<String, String>();
	protected static Map<String, String> confusao = new HashMap<String, String>();

	static {
		confusao.put("a@=a", "PEGA_TROXA_00");
		confusao.put("a4=i", "PEGA_TROXA_01");
		confusao.put("a=7c", "PEGA_TROXA_02");
		confusao.put("Ei=5", "PEGA_TROXA_03");
		confusao.put("7-5A", "PEGA_TROXA_04");
		confusao.put("A-G4", "PEGA_TROXA_05");
		confusao.put("a-n8", "PEGA_TROXA_06");
		confusao.put("hk4x", "PEGA_TROXA_07");
		confusao.put("gk44", "PEGA_TROXA_08");
		confusao.put("ek:o", "PEGA_TROXA_09");
		confusao.put("RktV", "PEGA_TROXA_10");
		confusao.put("!4np", "PEGA_TROXA_11");
		confusao.put("m4N!", "PEGA_TROXA_12");
		confusao.put("Rkx!", "PEGA_TROXA_13");
		confusao.put("Ek&4", "PEGA_TROXA_14");
		confusao.put("ik5t", "PEGA_TROXA_15");
		confusao.put("T@4x", "PEGA_TROXA_16");
		confusao.put("i45t", "PEGA_TROXA_17");
		confusao.put("mk#8", "PEGA_TROXA_18");
		confusao.put("EAT4", "PEGA_TROXA_19");
		confusao.put("!ka8", "PEGA_TROXA_20");
		confusao.put("i!5t", "PEGA_TROXA_21");
		confusao.put("EaT!", "PEGA_TROXA_22");
		confusao.put("Rx:V", "PEGA_TROXA_23");
		confusao.put("!a!x", "PEGA_TROXA_24");
		confusao.put("m4m=", "PEGA_TROXA_25");
		confusao.put(":S4y", "PEGA_TROXA_26");
		confusao.put("c=4a", "PEGA_TROXA_27");
		confusao.put("!e4b", "PEGA_TROXA_28");
		confusao.put("Ta3!", "PEGA_TROXA_29");
		confusao.put("mk3:", "PEGA_TROXA_30");

		// Espaço
		reversa.put("a4ca", " ");

		// Alfabeto maísculo
		reversa.put("Axat", "W");
		reversa.put("x!:f", "K");
		reversa.put("A=xt", "Y");
		reversa.put("4xAA", "Z");
		reversa.put("xGfV", "X");
		reversa.put("V=zV", "V");
		reversa.put("xAbx", "U");
		reversa.put("ta0A", "T");
		reversa.put("t4=4", "S");
		reversa.put("xVpV", "R");
		reversa.put("tSyt", "Q");
		reversa.put("344p", "P");
		reversa.put("tSe8", "O");
		reversa.put("t=UG", "N");
		reversa.put("Qt7E", "M");
		reversa.put("F:h5", "L");
		reversa.put("tF:J", "J");
		reversa.put("x4BJ", "I");
		reversa.put("3@0A", "H");
		reversa.put("37cx", "G");
		reversa.put("3axA", "F");
		reversa.put("3A:3", "E");
		reversa.put("33HJ", "D");
		reversa.put("t@45", "C");
		reversa.put("3D@H", "B");
		reversa.put(":VR!", "A");

		// Alfabeto minúsculo
		reversa.put("xxAt", "w");
		reversa.put("xA:!", "y");
		reversa.put("xxAx", "k");
		reversa.put("4!0T", "z");
		reversa.put("x5AQ", "x");
		reversa.put(":xA0", "v");
		reversa.put("x!a7", "u");
		reversa.put("tx0a", "t");
		reversa.put("x4t4", "s");
		reversa.put("xpza", "r");
		reversa.put("trtg", "q");
		reversa.put("3nlp", "p");
		reversa.put("tjy8", "o");
		reversa.put("txol", "n");
		reversa.put("t7ht", "m");
		reversa.put("35:e", "l");
		reversa.put("ete3", "j");
		reversa.put("x@4t", "i");
		reversa.put("3t0y", "h");
		reversa.put("3t7u", "g");
		reversa.put("3sqx", "f");
		reversa.put("3ty4", "e");
		reversa.put("w3w3", "d");
		reversa.put("tprt", "c");
		reversa.put("3rtt", "b");
		reversa.put("tyr!", "a");

		//acentuações
		reversa.put("AxdF", "á");
		reversa.put("AAdV", "à");
		reversa.put("HtY5", "ã");
		reversa.put("V8He", "â");
		reversa.put("d4Bx", "ä");
		reversa.put("Acd4", "Á");
		reversa.put("fRr5", "À");
		reversa.put("4xfR", "Ã");
		reversa.put("t5$g", "Â");
		reversa.put("4#r4", "Ä");
		reversa.put("Tyh8", "é");
		reversa.put("8T$H", "è");
		reversa.put("ABt4", "ẽ");
		reversa.put("BHu$", "ê");
		reversa.put("x57d", "ë");
		reversa.put("$3eR", "É");
		reversa.put("GR85", "È");
		reversa.put("HjUj", "Ẽ");
		reversa.put("G4aB", "Ê");
		reversa.put("AtG4", "Ë");
		reversa.put("Vg4$", "í");
		reversa.put("45Rt", "ì");
		reversa.put("$t85", "ĩ");
		reversa.put("$48G", "î");
		reversa.put("aFu7", "ï");
		reversa.put("A=V4", "Í");
		reversa.put("Ab=8", "Ì");
		reversa.put("A4Ab", "Ĩ");
		reversa.put("aGH4", "Î");
		reversa.put("xA54", "Ï");
		reversa.put("4A:T", "ó");
		reversa.put("5:x0", "ò");
		reversa.put("aC50", "õ");
		reversa.put("bIpA", "ô");
		reversa.put("Ac:w", "ö");
		reversa.put("Ad4t", "Ó");
		reversa.put("At47", "Ò");
		reversa.put("x=aU", "Õ");
		reversa.put("bR=4", "Ô");
		reversa.put("A=vx", "Ö");
		reversa.put("ax5T", "ú");
		reversa.put("Ar54", "ù");
		reversa.put("ar54", "ũ");
		reversa.put("rTxt", "û");
		reversa.put("xteF", "ü");
		reversa.put("A4yJ", "Ú");
		reversa.put("x0A4", "Ù");
		reversa.put("aar8", "Ũ");
		reversa.put("a4e8", "Û");
		reversa.put("ALeO", "Ü");

		// Numeros
		reversa.put("!at8", "9");
		reversa.put("x@xa", "8");
		reversa.put("34#!", "7");
		reversa.put("4ef!", "6");
		reversa.put("#vd!", "5");
		reversa.put("4:3e", "4");
		reversa.put("55#5", "3");
		reversa.put("t5d&", "2");
		reversa.put("!Awt", "1");
		reversa.put("4:A3", "0");

		// Caracteres especiais
		reversa.put("!:C3", ")");
		reversa.put("5Vf3", "(");
		reversa.put("45@H", "]");
		reversa.put("3@JJ", "[");
		reversa.put("57ke", "}");
		reversa.put("50Le", "{");
		reversa.put("!7l:", "*");
		reversa.put("!8V:", "\\");
		reversa.put("3tY4", "/");
		reversa.put("474W", "<");
		reversa.put("4paT", ">");
		reversa.put("!xb-", ":");
		reversa.put("!=dD", "?");
		reversa.put("5g48", ";");
		reversa.put("4s88", "^");
		reversa.put("77-4", "~");
		reversa.put("M5tn", "!");
		reversa.put("5Nxm", "`");
		reversa.put("!G!h", "@");
		reversa.put("A=!a", ".");
		reversa.put("7a53", "#");
		reversa.put("!a45", "$");
		reversa.put("P7!a", "%");
		reversa.put("!!py", "\"");
		reversa.put("5pTu", "&");
		reversa.put("7!Qr", "-");
		reversa.put("7Q5r", ",");
		reversa.put("7!44", "|");
		reversa.put("7VVt", "+");
		reversa.put("v5:4", "'");

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
