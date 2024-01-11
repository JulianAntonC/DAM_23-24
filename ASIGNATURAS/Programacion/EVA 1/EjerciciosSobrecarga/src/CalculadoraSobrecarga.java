public class CalculadoraSobrecarga {
    static double numeroBase = 13;
    static double numeroAditivo = 64;
    public static void main (String[] args) {

        suma();
        resta();
        multiplicacion();
        division();

    }
    public static void suma() {

        System.out.println("La suma de: " + numeroBase + " y " + numeroAditivo + " da un resultado de... " + (numeroBase + numeroAditivo));

    }

    public static void resta() {

        System.out.println("La resta de: " + numeroBase + " y " + numeroAditivo + " da un resultado de... " + (numeroBase - numeroAditivo));

    }

    public static void multiplicacion() {

        System.out.println("La multiplicacion de: " + numeroBase + " y " + numeroAditivo + " da un resultado de... " + (numeroBase * numeroAditivo));

    }

    public static void division() {

        System.out.println("La division de: " + numeroBase + " y " + numeroAditivo + " da un resultado de... " + (numeroBase / numeroAditivo));

    }
}
