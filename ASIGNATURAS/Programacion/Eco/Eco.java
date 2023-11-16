public class Eco {
    public static void main(String[] args) {

        String input = "";
        final String SALIR = "salir";
		
		System.out.println("\nBienvenido a la camara de los Ecos.\nPara salir de la camara de los ecos, escriba \"salir\".");

        while(!input.equalsIgnoreCase(SALIR)){

            input = System.console().readLine();

            if (input.equalsIgnoreCase(SALIR)) {
				System.out.println("\nHas salido de la camara de los ecos.");
                break;
            }

            System.out.println(input);

        }
    }
}