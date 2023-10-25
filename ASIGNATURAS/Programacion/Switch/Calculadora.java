public class Calculadora {
	public static void main(String[] args) {
		
		calculo();
		peticion();
	}
		
	public static void calculo() {
		
		double total = 0;
		
		System.out.print("Introduzca el primer número: ");
		String numero1 = System.console().readLine();
		double num1 = Double.parseDouble(numero1);
		
		System.out.print("Introduzca el segundo número: ");
		String numero2 = System.console().readLine();
		double num2 = Double.parseDouble(numero2);
		
		System.out.print("¿Qué operación desea realizar? (suma, resta, multiplicacion, division): ");
		String operacion = System.console().readLine();
		
		//linea en blanco por estética
		System.out.println("");
		
		switch(operacion) {
			case "suma": total = num1 + num2; break;
			case "resta": total = num1 - num2; break;
			case "multiplicacion": total = num1 * num2; break;
			case "division": total = num1 / num2; break;
			//linea en blanco por estética
			default: System.out.println(""); System.out.println("Asegurese de respetar las minusculas y no colocar tildes."); return;
		}
		
		System.out.println("El resultado es... " + total);
		System.out.println("");
	}
	
	public static void peticion() {
		
		System.out.println("¿Quiere hacer otra operación? (Y/N)");
		String eleccion = System.console().readLine();
		
		switch(eleccion) {
			case "Y": calculo(); break;
			case "N": System.out.println("Muchas gracias por usar la máquina"); break;
			default: System.out.println("No ha respetado las mayusculas, se terminará el programa"); break;
		}
		return;
	}
}