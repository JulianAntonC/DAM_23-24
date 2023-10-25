import java.util.Scanner;

public class Fichar {
	public static void main (String[] args) {
		
		ejercicio1();
		ejercicio2();
		ejercicio3();
	}
	
	public static void ejercicio1() {
		Scanner entradaNum = new Scanner(System.in);
		
		System.out.println("Introduce las horas trabajadas: ");
		double horas = entradaNum.nextDouble();
		
		System.out.println("Introduce el precio que corresponde a las horas trabajadas: ");
		double cobro = entradaNum.nextDouble();
		
		System.out.println("Tras trabajar " + horas + " horas, cobrarás " + cobro + 
		" por hora realizada, este es el total que tienes a cobrar, " + (horas * cobro) + " Euros.");
		
	}
	
	public static void ejercicio2() {
		Scanner entradaNum = new Scanner(System.in);
		
		System.out.println("Introduce tu peso (En Kg): ");
		double peso = entradaNum.nextDouble();
		
		System.out.println("Introduce tu estatura (En metros): ");
		double estatura = entradaNum.nextDouble();
		
		double imc = peso / estatura * estatura;
		System.out.printf("Este sería su IMC: %.2f",imc);
		
	}
	
	public static void ejercicio3() {
		Scanner entradaNum = new Scanner(System.in);
		
		System.out.println("Introduce el número a dividir: ");
		int numDividido = entradaNum.nextInt();
		
		System.out.println("Introduce el divisor: ");
		int numDivisor = entradaNum.nextInt();
		
		int cociente = numDividido / numDivisor;
		double resto = numDividido % numDivisor;

		System.out.println("La división entre " + numDividido + " y, " + numDivisor + " tiene un cociente de: " + cociente + " y un resto de: " + resto);
		
		entradaNum.close();
	}
}