public class Rombo {
	public static void main(String[] args) {
		
		
		System.out.print("\n¿Cuál desea que sea la linea central del rombo?: ");
		int lineas = Integer.parseInt(System.console().readLine());
		System.out.print("\n");
		
		lineas *= 2;
		
		// Mitad superior del rombo
		
		for(int asteriscos = 1; asteriscos <= lineas; asteriscos += 2) {
			
			
			for(int espacios = lineas - 1; espacios > asteriscos; espacios--) {
				
				System.out.print(" ");
				espacios--;
				
			}
			

			
			for(int horizontal = 0; horizontal < asteriscos; horizontal++) {
				
				System.out.print("*");
				
			}
			
			System.out.print("\n");
			
		}
			
			// Lo que se encuentra aquí abajo es la mitad inferior.
			
		for(int asteriscos = lineas - 2; asteriscos > 0; asteriscos -= 2) {
			
			
			for(int espacios = lineas - 1; espacios > asteriscos; espacios--) {
				
				System.out.print(" ");
				espacios--;
				
			}
			

			
			for(int horizontal = 0; horizontal < asteriscos - 1; horizontal++) {
			
				System.out.print("*");
				
			}
			System.out.print("\n");
		}
	}
}