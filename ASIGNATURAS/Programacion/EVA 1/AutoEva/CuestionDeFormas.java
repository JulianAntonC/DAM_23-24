import java.util.Scanner; 

public class CuestionDeFormas {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("¿Cuál es tu peso en kg? ");
		double peso = sc.nextDouble();
		
		System.out.print("¿Cuál es tu estatura en metros? ");
		double estatura = sc.nextDouble();
		
		double imc = Math.round(peso / Math.pow(estatura, 2));
		System.out.printf("Tu IMC es: " + imc);
		
		sc.close();
	}
}	