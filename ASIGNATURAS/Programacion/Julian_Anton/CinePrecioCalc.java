public class CinePrecioCalc {
	public static void main (String[] args) {
		

		final double DESCUENTO = 0.1;
		int ticket = 8;
		int personas = 0;
		boolean pareja = false;
		boolean descuentoFid = false;
		String fidelidad = "a";
		
		//Simulacion dias de la semana
		double aleatorio = Math.random();
		double resultado = 1*(1.0 - aleatorio) + 8*aleatorio;
		//De este modo evitamos un error al ubicar un double directamente en el switch
		int dia = (int)resultado;
		
		System.out.println("\nBienvenido al \"Cine de la Luna Nueva\"");
		
		//Simulacion de los distintos dias de la semana sin necesidad de preguntar al usuario. (En un escenario real esto vendría de la fecha local).
		switch(dia) {
			case 1,2,5,6,7: 
				System.out.println("La entrada base hoy cuesta 8 Euros por persona."); 
				break;
			case 3: 
				System.out.println("Dia del espectador! El coste hoy es de 5 Euros por persona."); 
				ticket = 5;
				break;
			case 4:
				System.out.println("Dia de la pareja! El coste a parejas es de 11 Euros en conjunto para dos!"); 
				pareja = true;
				break;
			//default añadido en el improbable caso de que haya un 8.
			default: 
				System.out.println("Vaya! Ha debido de haber un error, vuelva a intentarlo más tarde.");
		}
		
		// En este bloque, debido a que no sabía como emplear "System.exit" o algo más limpio que "return" he optado por un bucle. (Desgraciadamente "obliga a pagar").
		while(personas <= 0) {
			System.out.print("\nDiga para cuantas personas planea comprar entradas (En numero entero)\n: ");
			personas = Integer.parseInt(System.console().readLine());
		
			if(personas <= 0) {
			System.out.println("\nIntroduzca un numero superior a 0!");
			
			}
		}
		
		//Asegurando una respuesta valida en lugar de asumir que no la tiene en caso de escribir mal.
		while(!(fidelidad.equalsIgnoreCase("y")) && !(fidelidad.equalsIgnoreCase("n"))) {
			System.out.print("\nTienen la tarjeta de fidelidad? (Y/N)");
			fidelidad = System.console().readLine();
			
			if(fidelidad.equalsIgnoreCase("Y")) {
				System.out.println("\nFantastico, tienen un descuento del 10%");
				descuentoFid = true;
				
			} else if((fidelidad.equalsIgnoreCase("n"))) {
				System.out.println("\nNo se preocupe! No es obligatorio.");
				
			} else {
				System.out.println("\nRecuerde introducir Y o N!");
			}
		}
		
		//Calculos
		double precio = ticket * personas;
		if((pareja == true) && (personas == 2)) {
			precio = 11;
		}
		
		if(descuentoFid == true) {
			precio = precio - (precio * DESCUENTO);
		}
		
		//Lo que el usuario verá en pantalla
		System.out.println("\nEl precio total a pagar es de " + precio + " Euros.");
	}
}