import java.util.Scanner;

public class UltimoRepaso {
	public static void main (String[] args) {
		
		ejercicio1();
		ejercicio2();
		ejercicio3();
		ejercicio4();
	}
	
	public static void ejercicio1() {
		int x = 144;
		int y = 999;
		
		System.out.println("Suma: " + (x + y));
		System.out.println("Resta: " + (x - y));
		System.out.println("Divisi�n: " + (x / y));
		System.out.println("Multiplicaci�n: " + (x * y));
		System.out.println("Ahora, demos la vuelta a los valores.");
		System.out.println("Suma: " + (y + x));
		System.out.println("Resta: " + (y - x));
		System.out.println("Divisi�n: " + (y / x));
		System.out.println("Multiplicaci�n: " + (y * x));
	}
	
	public static void ejercicio2() {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introduzca el precio: ");
		double precio = s.nextDouble();
		
		System.out.println("Introduzca el IVA (Sin escribir el % al final): ");
		double iva = s.nextDouble();
		double ivaReal	= precio * iva / 100;
		
		System.out.println("Tras realizar los calculos pertinentes, el precio a pagar es: " + (precio + ivaReal));
	}
	
	public static void ejercicio3() {
		System.out.println("Introduzca el primer n�mero: ");
		String num1 = System.console().readLine();
		
		System.out.println("Introduzca el segundo n�mero: ");
		String num2 = System.console().readLine();
		
		int numero1 = Integer.parseInt(num1);
		int numero2 = Integer.parseInt(num2);
		
		int max = Math.max(numero1,numero2);
		
		System.out.println("De los n�meros introducidos, " + max + " es el mayor.");
	}
	
	public static void ejercicio4() {
		System.out.println("Introduzca el radio del cono (cm): ");
		String radio = System.console().readLine();
		
		System.out.println("Introduzca la altura del con (cm): ");
		String altura = System.console().readLine();
		
		double r = Double.parseDouble(radio);
		double h = Double.parseDouble(altura);
		final double PI = 3,1415926535897932384626433832795;
		double valor = (PI * (r * r) * h) / 3;
		
		
		System.out.println("El volumen del cono son..." + valor + " centimetros c�bicos.");
	}
}