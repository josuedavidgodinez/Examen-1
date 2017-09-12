package tenis;

public class reporter implements reportero {

	@Override
	public String calcularganador(jugador a, jugador b) {
		
		if(a.getPunteo()<=7&&b.getPunteo()<=7) {
		if(a.getPunteo()==7 || b.getPunteo()==7){
			if((a.getPunteo()==(b.getPunteo()+1))||a.getPunteo()==(b.getPunteo()+2)) {
				return a.getNombre();
			}else if(b.getPunteo()==(a.getPunteo()+1)||b.getPunteo()==(a.getPunteo()+2)){
				return b.getNombre();
			}else {
			 return "juego invalido";	
			}
		}else if(Math.abs(a.getPunteo() - b.getPunteo())>=3){
			 return "juego invalido";	
		}else if((a.getPunteo()==b.getPunteo())&&a.getPunteo()<7) {
			return "juego no terminado";
		}
		
		else{
		if(a.getPunteo()==(b.getPunteo()+2)) {
			return a.getNombre();
		}else if(b.getPunteo()==(a.getPunteo()+2)) {
			return b.getNombre();
		}else if(b.getPunteo()>a.getPunteo()) {
			return "juego no terminado";
			
			
		}else if(a.getPunteo()>b.getPunteo()) {
			return "juego no terminado";
			
			
		}
		}}else {
			return "juego invalido";
		}
		return null;
		
		
		
		
	}

	@Override
	public String calcularcampeon(juego[] match,jugador jugador1,jugador jugador2) {
		int contjugador1=0,contjugador2=0;
		for(int x=0;x<=8;x++) {
			
			if(match[x].getNombreganador()==jugador1.getNombre()) {
				contjugador1++;
			}else if(match[x].getNombreganador()==jugador2.getNombre()) {
				contjugador2++;
			}
		}
		
		if(contjugador1>contjugador2) {
			return jugador1.getNombre();
		}else if(contjugador1<contjugador2) {
			return jugador2.getNombre();
		}else {
			return "empate";
		}
	}

	@Override
	public String recordarganador(juego[] match, int x) {
		return "el ganador es del juego no. "+x+" es: "+ match[x-1].getNombreganador();
	}

}
