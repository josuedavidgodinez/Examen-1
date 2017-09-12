package chudnovsky;

import java.util.*;

public class main {

	public static void main(String[] args) {
		chudnovsky chu = new chudnovsky();
	Scanner leer=new Scanner(System.in);
	
	System.out.println("Ingrese cuantos digitos de pi desea averiguar");
		int digitos=Integer.parseInt(leer.nextLine());

	
		System.out.println(chu.calcularpi(digitos));
		
		
	}

}
