public class SumaNumerosPares {
    public static void main(String[] args) {

        estructuraCondicional();
        estructuraNoCondicional();

        public static void estructuraCondicional () {

            System.out.print("Introduce un valor inicial: ")
            int inicio = Integer.parseInt(System.console().readLine());

            System.out.print("Introduce un valor para finalizar: ")
            int finalizacion = Integer.parseInt(System.console().readLine());

            for (int i = inicio; i <= finalizacion; i++) {

                if (i % 2 == 0) {

                    System.out.println("i = " + i);

                }
            }
        }

        public static void estructuraNoCondicional () {

            System.out.print("Introduce un valor inicial: ")
            int inicio = Integer.parseInt(System.console().readLine());

            System.out.print("Introduce un valor para finalizar: ")
            int finalizacion = Integer.parseInt(System.console().readLine());

            for (int i = 0; i != -1; i++) {

                if ()

            }
        }
    }
}