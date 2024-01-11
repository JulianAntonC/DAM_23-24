public class VerificadorPrimos {
    public static void main(String[] args) {

        String input = "";
        final String SALIR = "salir";
		
		boolean primo = false;
		
		//Mantiene al usuario dentro mientras escribe numeros y le remueve cuando escribe "salir".
        while(!input.equalsIgnoreCase(SALIR)) {
			
			//Recordatorio del como salir.
			System.out.println("\nBienvenido.\nIntroduzca los n�meros que desee conocer si son primos.\nEn caso querer terminar el programa, escriba \"salir\"");

            input = System.console().readLine();
			
			//Reinicia el valor de primo al inicio de cada iteraci�n
			primo = false;
			
			// A�adido para evitar que el programa pete al intentar introducir "salir" . Petar� si el input es distinto a "salir" y sigue siendo un String.
			if(!input.equalsIgnoreCase(SALIR)) {
				int numKb = Integer.parseInt(input);
				
				//Comprobaci�n inicial para los numeros primos "base"
				if((numKb >= 0) && (numKb != 2) && (numKb != 3) && (numKb != 5)) {
					//La verdadera comprobaci�n de primos. Mientras los primos "base" no influyan, el n�mero ser� primo.
					if(!(numKb % 2 == 0) && !(numKb % 3 == 0) && !(numKb % 5 == 0) && (numKb != 1)) {
						primo = true;
					}
				
				
				} else if(numKb < 0){
					System.out.println("\nPor favor, emplee numeros positivos en \nlugar de negativos para obtener los resultados deseados.");
					
				//Primos "base" (2,3,5)	
				} else {
					primo = true; 
				}
				
				//Lo que ver� el usuario por pantalla.
				if(primo == true) {
					System.out.println("\nEs primo.");
					
				} else {
					System.out.println("\nNo es primo.");
					
				}
			}
        }
    }
}