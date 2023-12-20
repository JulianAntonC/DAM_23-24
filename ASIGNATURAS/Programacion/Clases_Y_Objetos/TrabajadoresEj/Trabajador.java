package ASIGNATURAS.Programacion.Clases_Y_Objetos.TrabajadoresEj;

public class Trabajador {
    String nombre;
    String edad;
    String sueldo;
    String proyectName;
    String proyectDesc;

    public Trabajador(String nombre, String edad, String sueldo, String proyectName, String proyectDesc) {
        this.nombre = nombre;
        this.edad = edad;
        this.sueldo = sueldo;

        this.proyectName = proyectName;
        this.proyectDesc = proyectDesc;
    }

    public void mostrarDatosTrabajador() {
            System.out.println("Nombre " + nombre.isEmpty());
            System.out.println("Edad " + edad.isEmpty());
            System.out.println("Sueldo" + sueldo.isEmpty());
    }

    public void mostrarDatosProyecto() {
            System.out.println("Nombre del proyecto " + proyectName.isEmpty());
            System.out.println("Descripción: " + proyectDesc.isEmpty());
    }
}
