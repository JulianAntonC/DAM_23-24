package ASIGNATURAS.Programacion.Clases_Y_Objetos.EstudianteEj;

public class Estudiante {
    String nombre;
    int edad;
    String grado;

    public Estudiante(String nombre, int edad, String grado){
        this.nombre = nombre;
        this.edad = edad;
        this.grado = grado;
    }

    public void mostrar() {
        System.out.println("Nombre " + nombre);
        System.out.println("Edad " + edad);
        System.out.println("Grado" + grado);
    }
}


