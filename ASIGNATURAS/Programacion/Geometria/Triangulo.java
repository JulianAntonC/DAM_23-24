public class Triangulo {
	public static void main(String[] args) {
		
		System.out.print("\n¿Cuántas lineas desea que tenga el triángulo?: ");
		int lineas = Integer.parseInt(System.console().readLine());
		System.out.print("\n");
		
		for(int asteriscos = 1; asteriscos <= lineas; asteriscos++) {
			

			System.out.print("\n");
			System.out.print("*");
			
			for(int horizontal = 1; horizontal < asteriscos; horizontal++) {
				
				System.out.print("*");
				
			}
		}
	}
}