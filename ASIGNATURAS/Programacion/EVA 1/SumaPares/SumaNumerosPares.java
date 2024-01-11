public class SumaNumerosPares {
    public static void main(String[] args) {

        estructuraCondicional();
        estructuraNoCondicional();
		
	}

	public static void estructuraCondicional() {
		
		System.out.print("Introduce un valor inicial: \n");
        int inicio = Integer.parseInt(System.console().readLine());

        System.out.print("Introduce un valor para finalizar: \n");
        int finalizacion = Integer.parseInt(System.console().readLine());

		for(; inicio <= finalizacion; inicio++) {
			if(inicio % 2 == 0) {
				System.out.print("\n" + inicio + "\n");
			}
		}
	}

	public static void estructuraNoCondicional() {

		System.out.print("Introduce un valor inicial: ");
        int inicio = Integer.parseInt(System.console().readLine());

        System.out.print("Introduce un valor para finalizar: ");
        int finalizacion = Integer.parseInt(System.console().readLine());
		
		while(inicio <= finalizacion) {
			for(; inicio <= finalizacion; inicio++) {
				while(inicio % 2 == 0) {
					System.out.print("\n" + inicio + "\n");
					break;
				}
			}
		}
	}
}
