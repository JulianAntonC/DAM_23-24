import java.util.Scanner;

public class Comparacion {
	public static void main (String[] args) {
		
		Scanner lecturaTeclado = new Scanner(System.in);
		System.out.println("Introduce un número entero: ");
		int a = lecturaTeclado.nextInt();
		System.out.println("Su primer valor es: " + a);
		System.out.println("Introduce un número entero distinto al anterior: ");
		int b = lecturaTeclado.nextInt();
		System.out.println("Su segundo valor es: " + b);
		System.out.println("Introduzca un número entero distinto a los anteriores: ");
		int c = lecturaTeclado.nextInt();
		System.out.println("Sus valores elegidos son: " + a + " " + b + " " + c);
		
		/*
		if (a > b); {
			System.out.println(a + " es el mayor.");
			if (b > c); {
				System.out.println(c + " es el menor.");
			} else {
				System.out.println(b + " es el menor.");
			}
			
		} else if (b > a);{
			System.out.println(b + " es el mayor.");
			if (a > c); {
				System.out.println(c + " es el menor.");
			} else {
				System.out.println(a + " es el menor.");
			}
		} else {
			System.out.println(c + " es el mayor.");
			if (a > b); {
				System.out.println(b + " es el menor.");
			} else {
				System.out.println(a + " es el menor.");
			}
		}
		*/
	}
}