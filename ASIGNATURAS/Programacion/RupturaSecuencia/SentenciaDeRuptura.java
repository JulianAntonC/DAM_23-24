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
            System.out.println("i = " + i);
        }
    }

    public static void incrementoBucle() {
        for (int i = 10;; i++) {
			
			if( i > 20){
                break;
            }
			
            if( i == 16){
                continue;
            }

            if (i % 2 == 0) {
                System.out.println("i = " + i);
				
            }   
        }
    }
}