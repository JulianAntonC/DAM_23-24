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
		}
	}
}