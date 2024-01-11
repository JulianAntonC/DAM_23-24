public class EjerciciosParse {
	public static void main (String[] args) {
		
		stringToInt();
		intToString();
		charToString();
		stringToBoolean();
		stringToDouble();
	}
	
	public static void stringToInt() {
		String texto = "2";
		int valor = Integer.parseInt(texto);
		System.out.println(texto);
		System.out.println(valor);
	}
	
	public static void intToString() {
		int ano = 1985;
		String fecha = Integer.toString(ano);
		System.out.println(ano);
		System.out.println(fecha);
	}
	
	public static void charToString() {
		char letra = 'p';
		String cadena = String.valueOf(letra);
		System.out.println(letra);
		System.out.println(cadena);
	}
	
	public static void stringToBoolean() {
		String verdadero = "true";
		boolean v = Boolean.parseBoolean(verdadero);
		System.out.println(verdadero);
		System.out.println(v);
	}
		
	public static void stringToDouble() {
		String texto = "2.5";
		double real = Double.parseDouble(texto);
		System.out.println(texto);
		System.out.println(real);
	}
}