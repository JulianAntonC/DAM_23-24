public class Tarta {
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
		System.out.println("Añadir su nombre a la tarta cuesta 2.75 (Se solicitará su nombre en caja)");
		System.out.println("");
		System.out.print("Elija un sabor: ");
		String sabor = System.console().readLine();
		
		if((!sabor.equalsIgnoreCase("chocolate")) && (!sabor.equalsIgnoreCase("manzana")) && (!sabor.equalsIgnoreCase("fresa"))) {
			System.out.println("Elija un sabor disponible");
			return;
			
		}
	
		if(sabor.equalsIgnoreCase("chocolate")) {
			System.out.print("¿Qué tipo de chocolate quiere? (negro 14 o blanco 15): ");
			String choco = System.console().readLine();
			
			if(choco.equalsIgnoreCase("negro")) {
				double chocolateN = 14;
				total += chocolateN;
				
			} else if(choco.equalsIgnoreCase("blanco")) {
				double chocolateB = 15;
				total += chocolateB;
			}
			
		} else if(sabor.equalsIgnoreCase("manzana")) {
			double manzana = 18;
			total += manzana;
			
		} else if(sabor.equalsIgnoreCase("fresa")) {
			double fresa = 16;			
			total += fresa;
			
		}
		
		System.out.println("¿Quiere añadirle nata? (Y/N): ");
		String nata = System.console().readLine();
		
		if(nata.equalsIgnoreCase("Y")) {
			double nataP = 2.50;
			total += nataP;
			
		}
		
		System.out.println("¿Quiere poner su nombre? (Y/N): ");
		String nombre = System.console().readLine();
		
		if(nombre.equalsIgnoreCase("Y")) {
			
			double nombreP = 2.75;		
			total += nombreP;
		}
		
		System.out.println(total + " Euros");
	}
}