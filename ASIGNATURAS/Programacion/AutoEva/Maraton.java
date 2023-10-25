public class Maraton {
	public static void main(String[] args) {
		
		System.out.print("Introduzca su edad: ");
		
		String ano = System.console().readLine();
		int edad = Integer.parseInt(ano);
		
		if(edad >= 35) {
			System.out.print("¿Ha participado previamente en alguna marat�n? (Responda \"1\" para Si o \"2\" para No): ");
			String respuestaMay = System.console().readLine();
			int mayor = Integer.parseInt(respuestaMay);
			
			if(mayor == 1) {
				System.out.print("¿La ha terminado en un tiempo menor a 225 minutos (3,75 horas)? (Responda \"1\" para Si o \"2\" para No): ");
				String respuestaMay1 = System.console().readLine();
				int mayor1 = Integer.parseInt(respuestaMay1);
				
				if(mayor1 == 1) {
					System.out.println("Felicidades, ha sido admitido para la carrera. �Esperamos con ilusi�n el verle participar!");
					return;
				} else {
					System.out.println("Lo sentimos, usted no ha sido seleccionado.");
					return;
				}
				
			} else {
				System.out.println("Lo sentimos, usted no es apto para participar.");
				return;
				
			}
		} else if((edad < 35) && (edad >= 18)) {
			System.out.print("¿Ha participado previamente en alguna marat�n? (Responda \"1\" para Si o \"2\" para No): ");
			String respuestaMen = System.console().readLine();
			int menor = Integer.parseInt(respuestaMen);
			
			if(menor == 1) {
				System.out.print("¿La ha terminado en un tiempo menor a 190 minutos (3,16 horas)? (Responda \"1\" para Si o \"2\" para No): ");
				String respuestaMen1 = System.console().readLine();
				int menor1 = Integer.parseInt(respuestaMen1);
				
				if(menor1 == 1) {
					System.out.println("Felicidades, ha sido admitido para la carrera. �Esperamos con ilusi�n el verle participar!");
					return;
				} else {
					System.out.println("Lo sentimos, usted no ha sido seleccionado.");
					return;
				}
			}
		} else {
			System.out.println("Lo sentimos, usted no es apto para participar.");
			return;
		}
	}
}