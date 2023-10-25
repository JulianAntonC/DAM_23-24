public class BucleFor {
	public static void main(String[] args) {
		forPlus();
		forTimes();
	}
	
	public static void forPlus() {
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
}