public class Billete {
	public static void main(String[] args) {
		/*
			billete sencilo = 0.33 Euros/Kilometro
			billete ida/vuelta = 0.26 Euros/Kilometro
			
			50+ Euros = 5% Descuento
			110+ Euros = 10% Descuento
			tarjeta Interrail = 25% Descuento
			
			Solo se aplica el mayor descuento
			Se mostrará la información por "printf"
			
			¿Qué distancia se va a recorrer? double
			¿Cuál es el valor del ticket? double
		*/
		final double BILLETE_S = 0.33;
		final double BILLETE_IV = 0.26;
		final double DESCUENTO_INTERRAIL = 0.25;
		final double DESCUENTO_DISTANCIA_MEDIA = 0.05;
		final double DESCUENTO_DISTANCIA_LARGA = 0.10;
		double precioVariable = 0;
		double precioFinal = 0;
		
		boolean billeteSencillo = false;
		boolean billeteIdaVuelta = false;
		boolean descuentoTarjeta = false;
		
		System.out.printf("%nBienvenido a la estación de tren \"Luna Nueva\". %nPuede viajar empleando uno de nuestros dos tipos de billete %n1: Billete sencillo (0.33 Euros/Kilometro) %n2: Billete ida/vuelta (0.26 Euros/Kilometro)%n %n");
		
		System.out.printf("¿Qué tipo de billete va a emplear para viajar? (1 | 2): ");
		String entradaTicket = System.console().readLine();
		int ticket = Integer.parseInt(entradaTicket);
		

		
		switch(ticket) {
			case 1: System.out.printf("%nHa elegido \"Billete sencillo\"%n%n"); billeteSencillo = true; break;
			case 2: System.out.printf("%nHa elegido \"Billete ida/vuelta\"%n%n"); billeteIdaVuelta = true; break;
			default: System.out.printf("%nLo sentimos, ha debido equivocarse al introducir el tipo de billete, vuelva a intentarlo.%n"); return;
		}
		
		System.out.printf("¿Cuántos kilometros va a viajar?: ");
		String distanciaTrayecto = System.console().readLine();
		double distancia = Double.parseDouble(distanciaTrayecto);
		
		if(billeteSencillo == true) {
			precioVariable = distancia * BILLETE_S;
		} else if (billeteIdaVuelta == true) {
			precioVariable = distancia * BILLETE_IV;
		}
		
		System.out.printf("%n¿Posee usted una tarjeta Interrail? (1 | 2): ");
		String tarjetaInterrail = System.console().readLine();
		int isTarjetaInterrail = Integer.parseInt(tarjetaInterrail);
		
		switch(isTarjetaInterrail) {
			case 1: System.out.printf("%nExcelente, se le aplicará el 25 por ciento de descuento.%n%n"); descuentoTarjeta = true; break;
			
			case 2: System.out.printf("%nNo se preocupe.%n%n"); break;
			
			default: System.out.printf("%nNo ha introducido una respuesta válida, se asumirá que no posee una Tarjeta Interrail.%n%n"); break;
		}
		
		if(descuentoTarjeta == true) {
			precioFinal = precioVariable - (precioVariable * DESCUENTO_INTERRAIL);
		} else if((precioVariable > 50) && (precioVariable < 110)) {
			System.out.printf("El valor de su billete supera los 50 Euros, se le aplicará un 5 por ciento de descuento.%n%n");
			precioFinal = precioVariable - (precioVariable * DESCUENTO_DISTANCIA_MEDIA);
			
		} else if(precioVariable > 110) {
			System.out.printf("El valor de su billete supera los 110 Euros, se le aplicará un 10 por ciento de descuento.%n%n");
			precioFinal = precioVariable - (precioVariable * DESCUENTO_DISTANCIA_LARGA);
			
		} else {
			precioFinal = precioVariable;
		}
		
		System.out.printf("Su billete va a costarle... %.2f", precioFinal);
		System.out.printf(" Euros. %n");
	}
}