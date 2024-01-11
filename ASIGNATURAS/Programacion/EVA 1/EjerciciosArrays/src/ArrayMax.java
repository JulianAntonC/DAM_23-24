public class ArrayMax {
    public static void main(String[] args) {
        int[] array = new int[]{23, 52, 43, 31, 48};
        int max = array[0];
        for (int i = 0; i < array.length; i++) {

            System.out.println((array[i]));

            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println(max);
    }
}
