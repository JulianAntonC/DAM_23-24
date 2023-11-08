public class SentenciaDeRuptura {
    public static void main (String[] args) {

        incrementoUno();
        incrementoDos();
        incrementoBucle();

    }

    public static void incrementoUno() {

        for (int i = 10; i <= 20; i++) {

            if (i == 16) {
                continue;
            }

            if(i % 2 == 0){

                System.out.println("i = " + i);

                }
            }
        }

    public static void incrementoDos() {

        for (int i = 10; i <= 20; i += 2) {

            if(i == 16){
                continue;

            }

            if(i % 2 == 0){
                System.out.println("i = " + i);

            }
        }
    }

    public static void incrementoBucle() {

        for (int i = 10; i != -1; i++) {


            if( i == 16){
                continue;
            }

            if (i % 2 == 0) {

                System.out.println("i = " + i);

            }

            if( i == 20){
                break;
            }
        }
    }
}