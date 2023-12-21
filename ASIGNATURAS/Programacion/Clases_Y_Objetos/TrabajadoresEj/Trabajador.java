package ASIGNATURAS.Programacion.Clases_Y_Objetos.TrabajadoresEj;

public class Trabajador {
    String nombre;
    String edad;
    String sueldo;

    public Trabajador(String nombre, String edad, String sueldo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sueldo = sueldo;

    }

    public void mostrarDatosTrabajador() {
            System.out.println("Nombre " + nombre.isEmpty());
            System.out.println("Edad " + edad.isEmpty());
            System.out.println("Sueldo" + sueldo.isEmpty());
            if ((nombre.isEmpty()) || (edad.isEmpty()) || (sueldo.isEmpty())) {
                System.out.println("vacio");
            }
    }
}
