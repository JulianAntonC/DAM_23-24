public class inversionArray {
    public static void main(String[] args) {
        int[] array = new int[]{23, 52, 43, 31, 48};

        for (int i = 0; i < array.length; i++) {
            System.out.println((array[i]));
        }

        System.out.println("\n");

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}

