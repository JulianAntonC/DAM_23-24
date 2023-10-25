public class Casting {
    public static void main (String[] args) {
        CastingReal();
        CastingString();
    }

    public static void CastingReal() {
            double real = 10.5d;
            System.out.println((int) real);
    }

    public static void CastingString() {
        String numero = "42";
        int valor = Integer.parseInt(numero);
        System.out.println(valor);
    }
}

