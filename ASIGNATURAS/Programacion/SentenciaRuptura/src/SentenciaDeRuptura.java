public class SentenciaDeRuptura {
    public static void main (String[] args) {

        incrementoUno();
        incrementoDos();
        incrementoBucle();

    }

    public static void incrementoUno() {

        for (int i = 10; i <= 20; i++) {

            System.out.println("i = " + i);

            if( i == 15){
                i++;
            }z
        }
    }

    public static void incrementoDos() {

        for (int i = 10; i <= 20; i += 2) {

            System.out.println("i = " + i);

        }

    }

    public static void incrementoBucle() {

        for (int i = 10; i <= 20; i++) {

            System.out.println("i = " + i);

        }
    }
}