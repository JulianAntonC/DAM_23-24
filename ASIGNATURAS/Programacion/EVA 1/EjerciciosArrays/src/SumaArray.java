public class SumaArray {
    public static void main(String[] args) {
        int[] array = new int[5];
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma += i + 1;
            array[i] += i;
            System.out.println(array[i] + 1);
        }

        System.out.println("\nResultado: " + suma);
    }
}

