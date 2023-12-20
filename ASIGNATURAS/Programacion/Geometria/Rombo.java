public class Rombo {
	public static void main(String[] args) {
		
		
		System.out.print("\n¿Cuál desea que sea la linea central del rombo?: ");
		int line = Integer.parseInt(System.console().readLine());
		System.out.print("\n");
		
		line *= 2;
		
		// Mitad superior del rombo
		for(int top = 1; top <= line; top += 2) {
			
			//Espacios
			for(int spac = line - 1; spac > top; spac--) {
				System.out.print(" ");
				spac--;
			}
			
			//Tamaño Horizontal
			for(int hori = 0; hori < top; hori++) {
				System.out.print("*");
			}
			
			System.out.print("\n");
		}
		
		// Lo que se encuentra aquí abajo es la mitad inferior.
		for(int bot = line - 2; bot > 0; bot -= 2) {

			for(int spac = line - 1; spac > bot; spac--) {
				System.out.print(" ");
				spac--;
			}

			for(int hori = 0; hori < bot - 1; hori++) {
				System.out.print("*");
			}
			
			System.out.print("\n");
		}
	}
}