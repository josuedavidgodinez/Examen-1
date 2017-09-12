package tenis;
/**
 * clase juego
 * @author Josue
 *
 */
public class juego {
	private String nombreganador;
	private int identificadorjuego;

	/**@author Josue
	 * 
	 * @returnnombre dlel ganador del juego
	 */
	public String getNombreganador() {
		return nombreganador;
	}

	/**@author Josue
	 * 
	 * @returnnombreestablece al ganador del juego
	 */

	public void setNombreganador(String nombreganador) {
		this.nombreganador = nombreganador;
	}

	/**@author Josue
	 * 
	 * @returnnombre obtiene el identificador del juego
	 */

	public int getIdentificadorjuego() {
		return identificadorjuego;
	}

	/**@author Josue
	 * 
	 * @returnnombre establece el identificador del juego
	 */
	public void setIdentificadorjuego(int identificadorjuego) {
		this.identificadorjuego = identificadorjuego;
	}
	

}
