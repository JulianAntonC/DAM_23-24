public class IfExercises {
	public static void main (String[] args) {
		
		//ifEjercicio1();
		//ifEjercicio3();
		//ifEjercicio4();
		ifEjercicio5();
	}
	
	public static void ifEjercicio1() {
		System.out.println("Introduzca su edad: ");
		
		String ano = System.console().readLine();
		int edad = Integer.parseInt(ano);
		
		if(edad >= 18){
			System.out.println("Es mayor de edad.");
		} else {
			System.out.println("Es menor de edad.");
		}
	}
	
	public static void ifEjercicio3() {
		System.out.println("El enunciado para este ejercicio sería: \"¡Adivina el número!\"");
		
		System.out.print("Introduzca un número entre el 1 y el 100: ");
		
		String numero = System.console().readLine();
		int num = Integer.parseInt(numero);
		
		if((num < 1) || (num > 100)) {
			System.out.println("El número introducido no es uno entre 1 - 100.");
			
			System.out.print("Vuelva a introducir un número, asegurese de que está entre 1 y 100: ");
			numero = System.console().readLine();
			num = Integer.parseInt(numero);
			
			if((num < 1) || (num > 100)){
				System.out.println("El número introducido no es uno entre 1 - 100, no hay más oportunidades.");
				System.out.println("Has perdido.");
				return;
			}
		}
		
		if(num == 24){
			System.out.println("¡Enhorabuena, has acertado!");
		} else {
			System.out.println("Lo siento, ese no es el número en el que estoy pensando...");
		}
	}
	
	public static void ifEjercicio4() {
		System.out.println("Introduce el primer valor: ");
		
		String numeroUno = System.console().readLine();
		int x = Integer.parseInt(numeroUno);
		
		System.out.println("Introduce el segundo valor: ");
		
		String numeroDos = System.console().readLine();
		int y = Integer.parseInt(numeroDos);
		
		if(x == y){
			System.out.println("Son iguales, en la siguiente ejecución, aseguresé de escribir números distintos.");
			return;
		}
		
		if(x > y){
			System.out.println(x + " es mayor.");
			System.out.println(y + " es menor.");
		} else {
			System.out.println(y + " es mayor.");
			System.out.println(x + " es menor.");
		}
	}
	
	public static void ifEjercicio5() {
		System.out.print("Introduce el primer valor: ");
		
		String numeroUno = System.console().readLine();
		int a = Integer.parseInt(numeroUno);
		
		System.out.print("Introduce el segundo valor: ");
		
		String numeroDos = System.console().readLine();
		int b = Integer.parseInt(numeroDos);
		
		System.out.print("Introduce el tercer valor: ");
		
		String numeroTres = System.console().readLine();
		int c = Integer.parseInt(numeroTres);
		
		//Comprobación de que los números no sean iguales a otros. vvv
		
		if(a == b) {
			System.out.println(a + " y " + b +" son iguales, en la siguiente ejecución, aseguresé de escribir números distintos.");
			return;
		} else if(a == c) {
			System.out.println(a + " y " + c +" son iguales, en la siguiente ejecución, aseguresé de escribir números distintos.");
			return;
		} else if(b == c) {
			System.out.println(b + " y " + c +" son iguales, en la siguiente ejecución, aseguresé de escribir números distintos.");
			return;
		}
		
		if(a > b){
			if(b > c){
				System.out.println(a + " es mayor.");
				System.out.println(c + " es menor.");
			} else {
				System.out.println(a + " es mayor.");
				System.out.println(b + " es menor.");
			}
		} else if(b > c) {
			if(a > c){
				System.out.println(b + " es mayor.");
				System.out.println(c + " es menor.");
			} else {
				System.out.println(b + " es mayor.");
				System.out.println(a + " es menor.");
			}
		} else if(c > a) {
			if(b > a){
				System.out.println(c + " es mayor.");
				System.out.println(a + " es menor.");
			} else {
				System.out.println(c + " es mayor.");
				System.out.println(b + " es menor.");
			}
		}
	}
}