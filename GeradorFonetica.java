package br.com.motorbusca.fonetica;

/**
 * A busca por fonética consiste em: 
 * - converter todas as letras para minisculo
 * - transformar letras duplas em unidades
 * - converter consoantes com o mesmo fonema (ss <> ç, w <> v...)
 * - remover acentuações
 * - remover caracteres especiais
 * - corrigir erro comuns da lingua
 * 
 * Estas regras se aplicam para a lingua portuguesa.
 * 
 * @author giulliano
 */
public class GeradorFonetica {

  public static String criarFonema(String valor) {

		//converter todas as letras para minisculo
		valor = valor.toLowerCase();

		//transformar letras duplas em unidades
		valor = valor.replace("aa", "a");
		valor = valor.replace("ee", "e");
		valor = valor.replace("ii", "i");
		valor = valor.replace("oo", "o");
		valor = valor.replace("uu", "u");
		valor = valor.replace("pp", "p");
		valor = valor.replace("rr", "r");
		valor = valor.replace("tt", "t");
		valor = valor.replace("ll", "l");
		valor = valor.replace("vv", "v");
		valor = valor.replace("bb", "b");
		valor = valor.replace("mm", "m");
		valor = valor.replace("nn", "n");
		valor = valor.replace("zz", "z");
		valor = valor.replace("xx", "x");
		valor = valor.replace("cc", "c");
		valor = valor.replace("kk", "k");
		valor = valor.replace("jj", "j");
		valor = valor.replace("gg", "g");
		valor = valor.replace("ff", "f");
		valor = valor.replace("dd", "d");
		valor = valor.replace("yy", "y");
		valor = valor.replace("ww", "w");

		//remover acentuações
		valor = valor.replace("ã", "a");
		valor = valor.replace("á", "a");
		valor = valor.replace("à", "a");
		valor = valor.replace("â", "a");
		valor = valor.replace("ẽ", "e");
		valor = valor.replace("é", "e");
		valor = valor.replace("è", "e");
		valor = valor.replace("ê", "e");
		valor = valor.replace("ĩ", "i");
		valor = valor.replace("í", "i");
		valor = valor.replace("ì", "i");
		valor = valor.replace("î", "i");
		valor = valor.replace("õ", "o");
		valor = valor.replace("ó", "o");
		valor = valor.replace("ò", "o");
		valor = valor.replace("ô", "o");
		valor = valor.replace("ũ", "u");
		valor = valor.replace("ú", "u");
		valor = valor.replace("ù", "u");
		valor = valor.replace("û", "u");

		//converter consoantes com o mesmo fonema (ss e ç)
		valor = valor.replace("ss", "s");
		valor = valor.replace("ç", "s");
		valor = valor.replace("z", "s");
		valor = valor.replace("x", "s");
		valor = valor.replace("k", "c");
		valor = valor.replace("y", "i");
		valor = valor.replace("w", "v");

		//caracteres especiais
		valor = valor.replace("-", "");
		valor = valor.replace("@", "");
		valor = valor.replace("!", "");
		valor = valor.replace("$", "");
		valor = valor.replace("%", "");
		valor = valor.replace("&", "");
		valor = valor.replace("*", "");
		valor = valor.replace("+", "");
		valor = valor.replace("-", "");
		valor = valor.replace(".", "");
		valor = valor.replace(",", "");
		valor = valor.replace("|", "");
		valor = valor.replace("/", "");
		valor = valor.replace(">", "");
		valor = valor.replace("<", "");
		valor = valor.replace(":", "");
		valor = valor.replace(";", "");
		valor = valor.replace("?", "");
		valor = valor.replace("\\", "");
		valor = valor.replace("{", "");
		valor = valor.replace("}", "");
		valor = valor.replace("[", "");
		valor = valor.replace("]", "");
		valor = valor.replace("(", "");
		valor = valor.replace(")", "");
		valor = valor.replace("=", "");
		valor = valor.replace("'", "");
		valor = valor.replace("\"", "");

		//corrigir erro comuns da lingua
		valor = valor.replace("np", "mp");
		valor = valor.replace("nb", "mb");

		return valor;
	}

}
