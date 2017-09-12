package tenis;
/**
 * clase jugador
 * @author Josue
 *
 */
public class jugador {

	private String nombre;
	private int punteo;

	/**@author Josue
	 * 
	 * obtiene el nombre del jugador
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	/**@author Josue
	 * 
	 * @returnnombre establece el nombre del jugador
 */
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

/**
 * 
 * @return obtiene el punteo del jugador
 */
	public int getPunteo() {
		return punteo;
	}
	/**
	 * establece el punteo del jugador
	 * @param punteo
	 */

	public void setPunteo(int punteo) {
		this.punteo = punteo;
	}
}
