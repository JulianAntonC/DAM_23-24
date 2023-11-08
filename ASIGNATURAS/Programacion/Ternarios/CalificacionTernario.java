public class CalificacionTernario {
	public static void main (String [] args) {
		
		int nota;
		
		do {
			System.out.println("Introduzca la nota obtenida: (0-100)\n");
			String entrada = System.console().readLine();
			nota = Integer.parseInt(entrada);
			
			String resultado = nota >= 0 && nota <= 100 ?
				nota >= 90 ? "Tiene una A" :
					nota >= 80 && nota <= 89 ? "Tiene una B" :
						nota >= 70 && nota <= 79 ? "Tiene una C" :
							nota >= 60 && nota <= 69 ? "Tiene una D" : "Tiene una F": "Nota no v�lida";
									
			System.out.println("\n" + resultado);
			
		} while ((nota < 0) || (nota > 100));
	}
}