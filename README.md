package fabricaranger;

public class monstruoo implements monstruo{
	private String nombre;
	private String elementprimario;
	private int edad;
	private String color;
	
	
	@Override
	public String agigantarse() {
		return "soy "+ this.nombre + "y me estoy agigantando";
	}

	@Override
	public String caminarlento() {
		return "soy "+ this.nombre + "y estoy caminando lento";
	}

	@Override
	public String golpear() {
		return "soy "+ this.nombre + "y estoy golpeando";
	}


	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getElementprimario() {
		return elementprimario;
	}

	public void setElementprimario(String elementprimario) {
		this.elementprimario = elementprimario;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public monstruo fabricar(String elemento) {
		this.nombre="";
		this.edad=0;
		this.elementprimario=elemento;
		return null;
	}
}
