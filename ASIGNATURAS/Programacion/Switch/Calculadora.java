public class Calculadora {
	public static void main(String[] args) {
		
		calculo();
		peticion();
	}
		
	public static void calculo() {
		
		double total = 0;
		
		System.out.print("Introduzca el primer n�mero: ");
		String numero1 = System.console().readLine();
		double num1 = Double.parseDouble(numero1);
		
		System.out.print("Introduzca el segundo n�mero: ");
		String numero2 = System.console().readLine();
		double num2 = Double.parseDouble(numero2);
		
		System.out.print("�Qu� operaci�n desea realizar? (suma, resta, multiplicacion, division): ");
		String operacion = System.console().readLine();
		
		//linea en blanco por est�tica
		System.out.println("");
		
		switch(operacion) {
			case "suma": total = num1 + num2; break;
			case "resta": total = num1 - num2; break;
			case "multiplicacion": total = num1 * num2; break;
			case "division": total = num1 / num2; break;
			//linea en blanco por est�tica
			default: System.out.println(""); System.out.println("Asegurese de respetar las minusculas y no colocar tildes."); return;
		}
		
		System.out.println("El resultado es... " + total);
		System.out.println("");
	}
	
	public static void peticion() {
		
		System.out.println("�Quiere hacer otra operaci�n? (Y/N)");
		String eleccion = System.console().readLine();
		
		switch(eleccion) {
			case "Y": calculo(); break;
			case "N": System.out.println("Muchas gracias por usar la m�quina"); break;
			default: System.out.println("No ha respetado las mayusculas, se terminar� el programa"); break;
		}
		return;
	}
}