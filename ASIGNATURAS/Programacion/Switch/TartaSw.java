public class TartaSw {
	public static void main(String[] args) {
		
		double total = 0;
		
		System.out.println("");
		System.out.println("¡Sea bienvenid@ a la pastelería \"Luna Nueva\"!");
		System.out.println("¡Tenemos una gran variedad de sabores!");
		System.out.println("Manzana (18 Euros)");
		System.out.println("Fresa (16 Euros)");
		System.out.println("Chocolate (Solicitelo para más información...)");
		System.out.println("");
		System.out.println("¡Puedes añadir nata por el modico precio de 2.50 Euros!");
		System.out.println("");
		System.out.println("Añadir su nombre a la tarta cuesta 2.75 (Se solicitará¡ su nombre en caja)");
		System.out.println("");
		
		System.out.print("Elija un sabor: ");
		String sabor = System.console().readLine();
		
		switch (sabor) {
			
			default: System.out.println("Introduzca un sabor de tarta valido."); return;
			
			case "manzana": double manzana = 18; total += manzana; break;
			
			case "fresa": double fresa = 16; total += fresa; break;
			
			case "chocolate":
				System.out.print("¿Qué tipo de chocolate quiere? (negro 14 o blanco 15): ");
				String choco = System.console().readLine();
				
				switch (choco) {
					
					case "negro": double chocolateN = 14; total += chocolateN; break;
					
					case "blanco": double chocolateB = 15; total += chocolateB; break;
				}
				
		}
		
		System.out.println("¿Quiere añadirle nata? (Y/N): ");
		String nata = System.console().readLine();
		
		switch (nata) {
			case "y": System.out.println("Se añadirá nata a su tarta"); double nataP = 2.50; total += nataP; break;
			
			case "n": System.out.println("No se añadirá nata a su tarta"); break;
			
			default: System.out.println("No se ha introducido un valor válido, por lo que no se añadirá nata a su tarta"); break;
		}
		
		System.out.println("¿Quiere poner su nombre? (Y/N): ");
		String nombre = System.console().readLine();
		
		switch (nombre) {
			case "y": System.out.println("Se añadirá nombre a su tarta"); double nombreP = 2.75; total += nombreP; break;
			case "n": System.out.println("No se añadirá nombre a su tarta"); break;
			
			default: System.out.println("No se ha introducido un valor válido, por lo que no se añadirá nombre a su tarta"); break; 
		}
		
		System.out.println("La tarta le costará " + total + "euros");
	}
}