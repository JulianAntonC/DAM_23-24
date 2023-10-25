public class Conversion {
	public static void main (String[] args) {
		
		final double KELVIN = 273.15;
		
		System.out.print("Introduce los grados en Celsius: ");
		String celsius = System.console().readLine();
		
		double c = Double.parseDouble(celsius);
		
		double temperatura = KELVIN + c;
		
		if(c == 0){
			temperatura = KELVIN;
			System.out.printf("La temperatura en Kelvin son... %.3f",temperatura);
			return;
		} else {
			System.out.printf("La temperatura en Kelvin son... %.3f",temperatura);
		}
		
	}
}