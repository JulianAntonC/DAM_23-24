public class RomboCasero {
	public static void main(String[] args) {	
		System.out.print("\n¿Cuántas lineas desea que tenga el triángulo?: ");
		int lineas = Integer.parseInt(System.console().readLine());
		System.out.print("\n");
		
		for(int superior = 1; superior <= lineas; superior++) {
			
			for(int espacios = lineas; espacios > superior; espacios--) {
				System.out.print(" ");
				espacios--;
			}

			for(int horizontal = 0; horizontal < superior; horizontal++) {
				System.out.print("*");
			}
			
			System.out.print("\n");
			
		}
		
		for(int inferior = 1; inferior <= lineas; inferior++) {
			

			for(int espacios = lineas; espacios > inferior; espacios++) {
				System.out.print(" ");
				espacios++;
			}

			for(int horizontal = 0; horizontal < inferior; horizontal--) {
				System.out.print("*");
			}
			
			System.out.print("\n");
		}
	}
}