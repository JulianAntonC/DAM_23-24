import java.util.Scanner; //Importamos "libreria" Scanner.
public class IntSuma {
    public static void main (String[] args) {
		
        Scanner entradaNum = new Scanner(System.in); //Creamos el objeto Scanner
		
        System.out.println("Introduce el primer n�mero: ");
			int al = entradaNum.nextInt();
		
        System.out.println("introduce el segundo n�mero: ");
			int bl = entradaNum.nextInt();
		
        System.out.println("El resultado de la suma entre "+ al + " y " + bl + " es " + (al + bl));
		
		entradaNum.close(); //Cerramos el objeto escanner
    }
}