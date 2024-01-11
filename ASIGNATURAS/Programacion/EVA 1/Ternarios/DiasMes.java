public class DiasMes {
	public static void main (String [] args) {
	
		System.out.print("\nIntroduzca el año que desea conocer: ");
		int fechaAnual = Integer.parseInt(System.console().readLine());
		
		System.out.print("\nIntroduzca el mes que desea conocer: ");
		int fechaMes = Integer.parseInt(System.console().readLine());
		
		switch(fechaMes) {
			
			case 1,3,5,7,8,10,12:
			
				System.out.println("Tiene 31 días.");
				break;
			
			case 4,6,9,11:
			
				System.out.println("Tiene 30 días.");
				break;
			
			case 2:
			
				if((fechaAnual % 4 == 0) && (fechaAnual % 100 != 0) || (fechaAnual % 400 == 0)) { 
					System.out.println("Tiene 29 días.");
				
				} else {
					System.out.println("Tiene 28 días.");
					
				}
				
				break;
				
			default: System.out.println("No se ha introducido un mes válido.");
		}
		
	}
}