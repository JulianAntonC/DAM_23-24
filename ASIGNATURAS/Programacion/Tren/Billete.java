public class Billete {
	public static void main(String[] args) {
		
		final double BILLETE_S = 0.33;
		final double BILLETE_IV = 0.26;
		final double DESCUENTO_INTERRAIL = 0.25;
		final double DESCUENTO_DISTANCIA_MEDIA = 0.05;
		final double DESCUENTO_DISTANCIA_LARGA = 0.10;
		
		double precioVariable = 0;
		double precioFinal = 0;
		
		int ticket;
		
		boolean descuentoTarjeta = false;
		
		System.out.printf("%nBienvenido a la estación de tren \"Luna Nueva\". %nPuede viajar empleando uno de nuestros dos tipos de billete %n1: Billete sencillo (0.33 Euros/Kilometro) %n2: Billete ida/vuelta (0.26 Euros/Kilometro)%n%nTenga en cuenta que solo solicitaremos numeros como datos.%n%n");
		

		
		System.out.printf("¿Cuántos kilometros va a viajar?: ");
		
		//String distanciaTrayecto = System.console().readLine();
		double distancia = Double.parseDouble(System.console().readLine());
		
		
		
		do {
			System.out.printf("¿Qué tipo de billete va a emplear para viajar? (1 | 2): ");
			
			ticket = Integer.parseInt(System.console().readLine());
			
			switch(ticket) {
				case 1: 
					System.out.printf("%nHa elegido \"Billete sencillo\"%n"); 
					precioVariable = distancia * BILLETE_S;
					break;
				case 2: 
					System.out.printf("%nHa elegido \"Billete ida/vuelta\"%n");
					precioVariable = distancia * BILLETE_IV;
					break;
				default: 
					System.out.printf("%nLo sentimos, ha debido equivocarse al introducir el tipo de billete, vuelva a intentarlo.%n"); 
					break;
			}
		} while ((ticket != 1) && (ticket != 2));
				
		System.out.printf("%n¿Posee usted una tarjeta Interrail? (1 | 2): ");
		
		//String tarjetaInterrail = System.console().readLine();
		int isTarjetaInterrail = Integer.parseInt(System.console().readLine());
		
		
		switch(isTarjetaInterrail) {
			case 1: 
				System.out.printf("%nExcelente, se le aplicará el 25 por ciento de descuento.%n%n"); 
				descuentoTarjeta = true; 
				break;
			
			case 2: 
				System.out.printf("%nNo se preocupe.%n%n"); 
				break;
			
			default: 
				System.out.printf("%nNo ha introducido una respuesta válida, se asumirá que no posee una Tarjeta Interrail.%n%n"); 
				break;
		}
		
		if(descuentoTarjeta == true) {
			precioFinal = precioVariable - (precioVariable * DESCUENTO_INTERRAIL);
			
		} else if((precioVariable > 50) && (precioVariable <= 110)) {
			System.out.printf("El valor de su billete supera los 50 Euros, se le aplicará un 5 por ciento de descuento.%n%n");
			precioFinal = precioVariable - (precioVariable * DESCUENTO_DISTANCIA_MEDIA);
			
		} else if(precioVariable > 110) {
			System.out.printf("El valor de su billete supera los 110 Euros, se le aplicará un 10 por ciento de descuento.%n%n");
			precioFinal = precioVariable - (precioVariable * DESCUENTO_DISTANCIA_LARGA);
			
		} else {
			precioFinal = precioVariable;
		}
		
		System.out.printf("Su billete va a costarle... %.2f Euros%n", precioFinal);
		//System.out.printf(" Euros. %n");
	}
}