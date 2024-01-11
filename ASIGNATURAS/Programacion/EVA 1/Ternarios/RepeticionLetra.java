public class RepeticionLetra {
	public static void main (String [] args) {
		
		int letra = 0;
		int loop = 0;
		
		//Solicitud de una oración.
		System.out.println("Introduzca una oración: \n");
		String frase = System.console().readLine();
		
		//Solicitud de la letra a encontrar.
		System.out.println("\nIntroduzca la letra que desea encontrar: \n");
		String letter = System.console().readLine();
		
		
		//Dentro de una oración, hallar una letra en especifico que ha sido introducida previamente por el usuario, esa letra ha de mostrarse en pantalla el numero de veces que aparece en pantalla
		
		//PosicionFrase(posFr)
		for(int posFr = 0; posFr < frase.length(); posFr++) {
			
			if(frase.substring(posFr, posFr + 1).equalsIgnoreCase(letter)) {
				letra++;
			}
			
			loop++;
			
		}
		
		//Test
		System.out.println("\n" + frase);
		System.out.println(letter);
		System.out.println(letra);
		System.out.println(loop);
		
		
		
	}
}