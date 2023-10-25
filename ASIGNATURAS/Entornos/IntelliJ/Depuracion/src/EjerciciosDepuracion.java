public class EjerciciosDepuracion {
    public static void main (String[] args) {

        ejercicio1();
        ejercicio2();
        ejercicio3();
        ejercicio4();
        ejercicio5();
    }

    private static void ejercicio1() {
        int numero = 5;
        System.out.println("El número es: " + numero);
    }

    private static void ejercicio2() {
        int numero1 = 10;
        int numero2= 5;
        int suma = numero1 + numero2;
        System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);
    }

    private static void ejercicio3() {
        int[] numeros = {1, 2, 3};
        System.out.println("El tercer número es: " + numeros[2]);
    }

    private static void ejercicio4() {
        int contador = 0;
        while (contador <= 10) {
            System.out.println("Contador: " + contador);
            contador++;
        }
    }

    private static void ejercicio5() {
        String texto1 = "Hola"; String texto2 = "hola";
        int texto = texto1.compareTo(texto2);
        if (texto == 0) {
            System.out.println("las cadenas son iguales.");
        } else {
            System.out.println("las cadenas son diferentes.");
        }
    }
}