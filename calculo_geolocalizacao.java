/**
 * Este método cálcula um quadrante com dois pontos de latitude e dois pontos
 * de longitude. Com isso é possível fechar um quadrado de pontos interessantes (POI).
 * 
 * @param latitude
 * @param longitude
 * @param distancia (1 = 1KM, 1000 = 1000km)
 * @return Map<Integer, Double> (1=lat_1, 2=lat_2, 3=long_1, 4=long_2)
 */
public static Map<Integer, Double> calcularQuadrante(Double latitude, Double longitude, Double distancia){
	Map<Integer, Double> quadrante = new HashMap<Integer, Double>();
	 
	//O correto seria 111.00 que é a média da conversão de uma unidade DD para km...mas esse valor funciona com mais precisão
	Double kilometroEmGrau = 152.58;

	/*
	 * Regra de três (com exemplo de 20 Km)
	 * 152.58   100%
	 * ------ = ---
	 *   20      x
	 */
	Double x = (distanciaKm * 100) / kilometroEmGrau;
	x = x/100;

	Double latitudePonto1 = new Double(latitude + x);
	Double longitudePonto1 = new Double(longitude + x);

	Double latitudePonto2 = new Double(latitude - x);
	Double longitudePonto2 = new Double(longitude - x);

	//Como estamos trabalhando com valores negativos e positivos a ordem interessa
	if(latitudePonto1 < 0){
		quadrante.put(1, latitudePonto2);
		quadrante.put(2, latitudePonto1);
	} else {
		quadrante.put(1, latitudePonto1);
		quadrante.put(2, latitudePonto2);
	}

	if(longitudePonto2 < 0){
		quadrante.put(3, longitudePonto2);
		quadrante.put(4, longitudePonto1);
	} else {
		quadrante.put(3, longitudePonto1);
		quadrante.put(4, longitudePonto2);
	}

	return quadrante;
}

