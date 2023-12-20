<<<<<<< HEAD
import java.util.Scanner;
public class Triangulo {
	static int asterisco = 0;
	static int cicloVertical = 0;
	static int cicloHorizontal = 0;
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("\n¿Cuántas lineas desea que tenga el triángulo?: ");
		int lines = sc.nextInt();
		System.out.print("\n");

		verticalAstericos(lines);
		System.out.println("\n" + cicloVertical);
		System.out.println(cicloHorizontal);

		sc.close();

	}

	public static void verticalAstericos(int lines) {
        if (asterisco <= lines) {
			//Este if en sí mismo es la condicion de parada
        } else {
			verticalAstericos(lines - 1);

			System.out.print("\n");
			System.out.print("*");

			horizontalAsteriscos(asterisco);
		}
    }

	public static void horizontalAsteriscos(int asterisco) {
		if (asterisco <= 1) {
			cicloHorizontal++;
		} else {

			horizontalAsteriscos(asterisco - 1);

			System.out.print("*");
=======
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
>>>>>>> 89b660d918912a1809e876eb0cc3b736e41c3ea1
		}
	}
}