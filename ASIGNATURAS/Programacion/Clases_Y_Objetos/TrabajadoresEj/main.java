package ASIGNATURAS.Programacion.Clases_Y_Objetos.TrabajadoresEj;
import java.util.Scanner;

public class main {
    static Scanner kb = new Scanner(System.in);
    public static void main(String[] args) {
        
        solicitarTrabajadores();
        kb.close();
        
    }

    public static void solicitarTrabajadores() {
        int trabajadores = 0;
        System.out.println("¿Cuantos trabajadores quiere introducir? Hasta 999");
        trabajadores = kb.nextInt();

        for (int i = trabajadores, y = 1; i >= 0; i--) {
            solicitarDatosTrabajador(y);
            solicitarDatosProyecto(y);
            y++;
            mostrarDatos(x,v);

        }
    }


    public static Trabajador solicitarDatosTrabajador(int i) {
        

        System.out.println("───────────");

        System.out.println("Datos del trabajador " + i + " :");
        String nombre = kb.nextLine();
        String edad = kb.nextLine();
        String sueldo = kb.nextLine();
        Trabajador x = new Trabajador(nombre, edad, sueldo);

        return x;        
    }

    public static Proyecto solicitarDatosProyecto(int i) {

        System.out.println("Datos proyecto trabajador " + i + " :");
        String proyectDesc = kb.nextLine();
        String proyectName = kb.nextLine();
        Proyecto v = new Proyecto(proyectName, proyectDesc);

        System.out.println("───────────\n\n");

        return v;
    }

    public static void mostrarDatos() {

        System.out.println("Datos del trabajador " + i + " :");
        x.mostrarDatosTrabajador();
        System.out.println("Datos proyecto trabajador " + i + " :");
        y.mostrarDatosProyecto();

    }
}   


