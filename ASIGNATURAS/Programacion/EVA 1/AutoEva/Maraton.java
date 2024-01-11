public class Maraton {
	public static void main(String[] args) {
		
		int velocidad = 0;
		
		System.out.print("Introduzca su edad: ");
		
		int edad = Integer.parseInt(System.console().readLine());
		
		if(edad >= 18){
			
			System.out.print("\n¿Ha participado previamente en alguna maratón? (Responda \"1\" para Sí o \"2\" para No): ");
			int participacion = Integer.parseInt(System.console().readLine());
			
			if(participacion == 1) {
				
				if(edad < 35) {
					
					System.out.print("\n¿La ha terminado en un tiempo menor a 190 minutos (3,16 horas)? (Responda \"1\" para Sí o \"2\" para No): ");
					
				} else {
					
					System.out.print("\n¿La ha terminado en un tiempo menor a 225 minutos (3,75 horas)? (Responda \"1\" para Sí o \"2\" para No): ");
					
				}
				
				velocidad = Integer.parseInt(System.console().readLine());
				
				
			} else {
				
				velocidad = 2;
				
			}
			
			if(velocidad == 1) {
	
				System.out.println("Felicidades, ha sido admitido para la carrera. ¡Esperamos con ilusión el verle participar!");
				
			} else {
			
				System.out.println("\nLo sentimos, usted no ha sido seleccionado.");	
				
			}
			
		} else {
			
			System.out.println("\nLo sentimos, usted no es apto para participar.");
			
		}
	}
}