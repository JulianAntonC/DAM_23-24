import java.util.Scanner;

public class MathDos {
	public static void main (String[] args) {
		
		mathEjercicio1();
		mathEjercicio2();
		mathEjercicio3();
		mathEjercicio4();
		mathEjercicio5();
		mathEjercicio6();
	}
	
	public static void mathEjercicio1() {
		int a = 3;
		int b = -3;
		int max = Math.max(a,b);
		System.out.println("Ejercicio 1: " + max);
		
		int min = Math.min(a,b);
		System.out.println("Ejercicio 1: " + min);
	}
	
	public static void mathEjercicio2() {
		double aleatorio = Math.random();
		System.out.println("Ejercicio 2: " + aleatorio);
	}
	
	public static void mathEjercicio3() {
		double aleatorio = Math.random();
		double resultado = 0*(1.0 - aleatorio) + 10*aleatorio;
		System.out.println("Ejercicio 3: " + resultado);
	}
	public static void mathEjercicio4() {
		double aleatorio = Math.random();
		double resultado = 1*(1.0 - aleatorio) + 10*aleatorio;
		System.out.println("Ejercicio 4: " + resultado);
	}
	
		public static void mathEjercicio5() {
		double aleatorio = Math.random();
		double resultado = 3*(1.0 - aleatorio) + 42*aleatorio;
		System.out.println("Ejercicio 5: " + resultado);
	}
	
		public static void mathEjercicio6() {
		Scanner entradaNum = new Scanner(System.in);
        System.out.println("Introduce el incluido: ");
		int incluido = entradaNum.nextInt();
		System.out.println("Introduce el excluido: ");
		int excluido = entradaNum.nextInt();
		double aleatorio = Math.random();
		double resultado = incluido*(1.0 - aleatorio) + excluido*aleatorio;
		
		System.out.println("Ejercicio 6: " + (int) resultado);
	}
	 
}