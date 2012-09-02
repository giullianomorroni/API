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

	//Converte para metros
	distancia = distancia/1000;

	//Converte a distancia em graus (cada grau equivale a 111.12Km)
	distancia = (distancia / 111.12);
	Double latitudePonto1 = new Double(latitude + distancia);
	Double latitudePonto2 = new Double(latitude - distancia);
	Double longitudePonto1 = new Double(longitude + distancia);
	Double longitudePonto2 = new Double(longitude - distancia);
	System.out.println("Pontos de interesse estão no quadrante ");
	System.out.println("INI: " +latitudePonto1 + " ,  " + longitudePonto1);
	System.out.println("FIM: " + latitudePonto2 + " , " + longitudePonto2);

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

