public class EjerciciosConversiones{
    public static void main (String[] args){

        ejercicio1();
        ejercicio2();
        ejercicio3();
        ejercicio4();
        ejercicio5();
        ejercicio6();
        ejercicio7();
        ejercicio8();
        ejercicio9();

    }

    public static void ejercicio1(){
        System.out.println("EJERCICIO 1:");

        char digito = 8550; // valor en base 10 del caràcter ’Ⅶ’ 
        System.out.println("8550 es digito? " + Character.isDigit(digito)); // visualitza false, ‘Ⅶ’ no és un dígit 
        
        digito = '7'; 
        System.out.println("7 es digito? " + Character.isDigit(digito));
    }

    public static void ejercicio2(){
        System.out.println("EJERCICIO 2:");

        char letra = 'j'; 
        System.out.println("j es letra? " + Character.isLetter(letra)); 
        System.out.println("j es digito o letra? " + Character.isLetterOrDigit(letra));    
    }

    public static void ejercicio3(){
        System.out.println("EJERCICIO 3:");

        double a = 3.5d;
        double b = 4.0d;
        System.out.println("Max:" + Double.max(a, b)); 
        System.out.println("Min:" + Double.min(a, b)); 
    }

    public static void ejercicio4(){
        System.out.println("EJERCICIO 4:");
        System.out.println("Max integer:" + Integer.MAX_VALUE);
    }

    public static void ejercicio5(){
        System.out.println("EJERCICIO 5:");
        String a = "uno";
        String b = "Uno";
        System.out.println("uno y Uno son iguales?" + a.equals(b)); //En este caso no son iguales
        System.out.println("uno y Uno son iguales?" + a.equalsIgnoreCase(b)); //En este caso sí son iguales
    }

    public static void ejercicio6(){
        System.out.println("EJERCICIO 6: uno y uno son iguales?");
        String a = "uno";
        String b = "uno";
        System.out.println(a == b); 

        String c = new String("uno");
        String d = new String("uno");
        System.out.println(c == d); //El operador == compara la referencia a la direccion de memoria, en lugar del objeto en sí.
    }
    
    public static void ejercicio7(){
        System.out.println("EJERCICIO 7:");
        String texto = "hola";
        System.out.println("Posicion 1 en el texto hola: " + texto.charAt(1));
    }

    public static void ejercicio8(){
        System.out.println("EJERCICIO 8:");
        String texto = "caracola";
        System.out.println("Longitud del texto caracola: " + texto.length());
    }

    public static void ejercicio9(){
        String str = "eloquent";
		int longitud = str.length();
		String strReducido = str.substring(1,longitud-1);
		System.out.println(strReducido);
    }
}