import java.util.Scanner;

public class Triangulo {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("\n¿Cuántas lineas desea que tenga el triángulo?: ");
		int lineas = sc.nextInt();
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