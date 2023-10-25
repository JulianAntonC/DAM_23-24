public class EjercicioCuatro {
	public static void main (String[] args) {
		double a = 3;
		double b = -3;
		a = a + 1;
		System.out.println(a);
		a = a + 2 * b;
		System.out.println(a);
		a = a - 2 * b - 2;
		System.out.println(a);
		double c = a / b - 3;
		System.out.println(c);
		
		c = a % b - 3;
		System.out.println(c);
	}
}