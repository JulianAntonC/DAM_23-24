public class MesTernario {
	public static void main (String [] args) {
		
		int dia;
		
		do {
			System.out.printf("%nIntroduzca el día de la semana que quiere conocer. (1-7)\n");
			String entrada = System.console().readLine();
			dia = Integer.parseInt(entrada);
			
			String resultado = dia >= 1 && dia <= 7 ?
				dia == 1 ? "Lunes" :
					dia == 2 ? "Martes" :
						dia == 3 ? "Miercoles" :
							dia == 4 ? "Jueves" :
								dia == 5 ? "Viernes" :
									dia == 6 ? "Sabado" : "Domingo" : "Dia no válido";
									
			System.out.println(resultado);
			
		} while ((dia < 1) || (dia > 7));
	}
}