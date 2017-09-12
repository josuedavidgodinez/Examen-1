package fabricaranger;

public class monstruoo implements monstruo{
	private String nombre;
	private String elementprimario;
	private int edad;
	private String color;
	private monstruoo[] lista;
	private int  index =-1;
	public int contador;
	
	/**
	 * @author Josue
	 * @param elemento del monstruo
	 */
	public monstruoo(String elemento) {
		super();
		this.nombre="";
		this.edad=0;
		this.elementprimario=elemento;
		
	}
	
	/**
	 * @muestra que el monstruo se esta agigantando
	 */
	@Override
	public String agigantarse() {
		return "soy "+ this.nombre + "y me estoy agigantando";
	}

	/**
	 * muestra que el monstruo esta caminando lento
	 */
	@Override
	public String caminarlento() {
		return "soy "+ this.nombre + "y estoy caminando lento";
	}

	/**
	 * muestra que el monstruo esta golpenado
	 */
	@Override
	public String golpear() {
		return "soy "+ this.nombre + "y estoy golpeando";
	}


	
/**
 * 
 * @return nombe del monstruo
 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * establece el nombre delmonstruo
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * 
	 * @return el elemento rpimario del monstruo
	 */
	public String getElementprimario() {
		return elementprimario;
	}

	/**
	 * 
	 * @param elementprimario del monstruo
	 */
	public void setElementprimario(String elementprimario) {
		this.elementprimario = elementprimario;
	}

	/**
	 * 
	 * @return obtiene el color del monstruo
	 */
	public String getColor() {
		return color;
	}

	/**
	 * estaclece color del monstruo
	 * @param color
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * 
	 * @return la edad del monstruo
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * establece la edad del monstruo
	 * @param edad
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * 
	 * @return el monstruo de la lista utilizando la disciplina de pila
	 */
	
	public monstruoo  desapilar() {
		
		if(lista[lista.length-1]!=null) {
			return lista[lista.length-1];
		}else {
			return null;
		}
	}
	/**
	 *  establece el monstruo en la lista utilizando la disciplina de la pila
	 * @param monstruo1
	 */
public void apilar(monstruoo monstruo1) {
		
		if(index<lista.length) {
			lista[lista.length+1]=monstruo1;
		}
	}

/**
 * establece el monstruo en la lista utilizando la disciplina de la cola
 * @param monstruo1
 */
public void encolar(monstruoo monstruo1) {
	if(index<lista.length) {
		lista[index+1]=monstruo1;
	}
	
}
/**
 * extrae un monstruo de la lista siguiento la disciplina de la cola
 * @param monstruo1
 * @return
 */
public monstruoo desencolar(monstruoo monstruo1) {
	if ((index >= 0) && (index < contador)){
        monstruoo elemento = lista[index];
        for (int i = index + 1; i < contador; i++) {
            lista[i - 1] = lista[i];
            lista[i] = null;
        }
        contador--;
        return elemento;
    } else {
       return null;
    }


}
public int getIndex() {
	return index;
}
public void setIndex(int index) {
	this.index = index;
}
	
	
}
