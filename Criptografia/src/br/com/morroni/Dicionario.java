package br.com.morroni;

import java.util.Map;


/**
 * Define qual será o dicionário usados para criptografia e descriptografia.
 * 
 * @author giulliano.morroni
 * @see CriptografiaMorroni
 * @see DicionarioAbissal
 * @see DicionarioCamaleao
 * @see DicionarioSalamandra
 */
abstract class Dicionario {
	
	protected Dicionario(){
		super();
	}

	public static Dicionario obter(String inicio) {
		switch (inicio) {
		case "1": System.out.println("Abissal"); return new DicionarioAbissal();
		case "2": System.out.println("Camaleao"); return new DicionarioCamaleao();
		case "3": System.out.println("Salamandra"); return new DicionarioSalamandra();
		case "4": System.out.println("Abissal"); return new DicionarioAbissal();
		case "5": System.out.println("Salamandra"); return new DicionarioSalamandra();
		case "6": System.out.println("Abissal"); return new DicionarioAbissal();
		case "7": System.out.println("Salamandra"); return new DicionarioSalamandra();
		case "8": System.out.println("Abissal"); return new DicionarioAbissal();
		case "9": System.out.println("Camaleao"); return new DicionarioCamaleao();
		case "0": System.out.println("Camaleao"); return new DicionarioCamaleao();
		default: System.out.println("Abissal"); return new DicionarioAbissal();
		}
	}

	abstract Map<String, String> getValores();
	abstract Map<String, String> getReversa();
	abstract Map<String, String> getConfusao();

}
