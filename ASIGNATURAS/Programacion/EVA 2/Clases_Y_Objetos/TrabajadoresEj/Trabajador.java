package Clases_Y_Objetos.TrabajadoresEj;

public class Trabajador {
    private String nombre;
    private int edad;
    private double sueldo;

    public Trabajador(String nombre, int edad, double sueldo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sueldo = sueldo;

    }

    public void mostrarDatosTrabajador(int numeroTrabajador) {
        System.out.println("Nombre " +nombre);
        System.out.println("Edad " + edad);
        System.out.println("Sueldo " + sueldo);
        System.out.println(" ");
        if ((nombre.isEmpty())) {
            System.out.println("vacio");
        }
    }

    public void setProyecto(Proyecto proyecto) {
    }
}
