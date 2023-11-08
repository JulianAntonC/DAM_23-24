public class Eco {
    public static void main(String[] args) {

        String input = "";
        final String SALIR = "salir";

        while(!input.equalsIgnoreCase(SALIR)){

            input = System.console().readLine();

            if (input.equalsIgnoreCase(SALIR)) {
                break;
            }

            System.out.println(input);

        }
    }
}