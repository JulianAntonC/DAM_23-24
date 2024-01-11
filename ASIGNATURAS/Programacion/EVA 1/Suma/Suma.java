public class Suma {
    public static void main (String[] args) {
        int x = 4;
		x++;
		System.out.println(x);
        int y = x++ + x++;
		System.out.println(x);
		System.out.println(y);
		y += x + ++x;
		System.out.println(x);
        System.out.println(y);
    }
}