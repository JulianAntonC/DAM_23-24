public class Test2 {
	public static void main (String[] args) {
		
		System.out.print("Introduzca su edad: ");
		
		String ano = System.console().readLine();
		int edad = Integer.parseInt(ano);
		
		System.out.print("�Ha participado previamente en alguna marat�n? (Responda \"1\" para Si o \"2\" para No): ");
		String respuestaMay = System.console().readLine();

	}
}

/* 
No aceptado (No ha logrado terminar la maraton en un tiempo inferior al establecido)
No apto (Menor de 18 && No ha participado en una maraton)
Aceptado (Ha logrado terminar la maraton en el tiempo establecido o inferior)
*/