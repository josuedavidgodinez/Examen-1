package tenis;

public interface reportero {

	/**
	 * 
	 * @param jugador A UN OBJETO
	 * @param JUGADOR B UN OBJETO
	 * @return el ganador del juego
	 */
	public String calcularganador(jugador a, jugador b) ;
	/**
	 * 
	 * @param arreglo de juegos
	 * @param jugador1
	 * @param jugador2
	 * @return el campero de los juegos totales
	 */
	
	public String calcularcampeon(juego[] match,jugador jugador1,jugador jugador2);

	/**
	 * 
	 * @param arreglo de juegos
	 * @param identificador del juego a recordar
	 * @return nombre del ganador del juego x
	 */
	public String recordarganador(juego[] match,int x);
	
}
