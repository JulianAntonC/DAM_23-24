public class BucleFor {
	public static void main(String[] args) {
		forPlus();
		forTimes();
		threeSeries();
	}
	
	public static void forPlus() {
		System.out.println("");
		
		int y = 0;
		while(y <= 10) {
			System.out.println(y);
			y++;
		}
		
		System.out.println("");
		
		for(int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
		
		System.out.println("");
	}
	
	public static void forTimes() {
		for(int i = 0; i <= 10; i++) {
			int multiplicacion = i * 1;
			System.out.println(multiplicacion);
		}
		
		System.out.println("");
		
	}
	
	public static void threeSeries() {
		System.out.println("");
		
		System.out.println("Introduzca el numero de veces que quiere que se sumen 3 (entero, las decimales se perderan): ");
		String suma = System.console().readLine();
		int y = Integer.parseInt(suma);
		
		int i = 1;
		int b = 1;
		int c = 0;
		
		while(i <= y) {
			
			
			System.out.print(b);
			c += b;
			b += 3;
			i++;
			
			if(i <= y) {
				System.out.print(" + ");
			} else if(i > y) {
				System.out.print(" = ");
			}
		}
		System.out.print(c);
	}
}