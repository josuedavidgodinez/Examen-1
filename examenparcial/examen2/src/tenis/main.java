package tenis;

import java.util.*;

public class main {

	public static void main(String[] args) {
	 Scanner leer = new Scanner(System.in);
		jugador jugador1=new jugador();
		jugador jugador2=new jugador();
		reporter noticiero=new reporter();
		
		juego[] juegos=new juego[9];
		
		for(int x=0;x<9;x++) {
			juego match = new juego();
			
			match.setIdentificadorjuego(0);
			match.setNombreganador("");
			
			juegos[x]=match;
			
		}
		
		System.out.println("Ingrese el nombre del jugador A");
		jugador1.setNombre(leer.next());
		System.out.println("Ingrese el nombre del jugador B");
		jugador2.setNombre(leer.next());
		
		System.out.println("BIENVENIDO que accion desea realizar:");
		int x=0;
		
		int opc=0;
		do {
			System.out.println("1.Calcular Ganador");
			System.out.println("2.Calcular Campeon");
			System.out.println("3.Recordar ganador de cierto juego");
			System.out.println("4.Salir");
			opc=leer.nextInt();
			switch(opc) {
			
			
			case 1:
				if(x<9) {
				juego match= new juego();
				System.out.println("ingrese punteo del jugador  :"+jugador1.getNombre());
				jugador1.setPunteo(Integer.parseInt(leer.next()));
				
				System.out.println("ingrese punteo del jugador  :"+jugador2.getNombre());
				jugador2.setPunteo(Integer.parseInt(leer.next()));
				
				match.setNombreganador(noticiero.calcularganador(jugador1, jugador2));
				match.setIdentificadorjuego(x+1);
				
				System.out.println("El ganador es:"+ (noticiero.calcularganador(jugador1, jugador2)));
				juegos[x]=match;
				
				x++;
				
				
				}else {
					
					System.out.println("no se pueden ingresar mas juegos");
				}
				break;
				
				
			case 2:
				System.out.println(noticiero.calcularcampeon(juegos, jugador1, jugador2));
				break;
				
			case 3:
				
				
				System.out.println("Ingrese el numero del juego que desea averiguar el ganador");
				int numjuego=leer.nextInt();
				
				if(numjuego<x+1) {
				
				System.out.println(noticiero.recordarganador(juegos, numjuego));
				
				}else {
					System.out.println("ese juego no se a realizado");
				}
				break;
				default:
					System.out.println("ingrese una opcion valida");
					break;
			}
		
		
		
			
		}while(opc!=4);
		
		
		
		
		
		
		System.out.println(noticiero.calcularganador(jugador1, jugador2));

	}

}
