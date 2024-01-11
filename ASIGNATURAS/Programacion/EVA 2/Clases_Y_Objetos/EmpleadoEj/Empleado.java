package Clases_Y_Objetos.EmpleadoEj;

public class Empleado {
    private String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return ("Empleado " + nombre);
    }

    public void setNombre(String nombre) {
    }
    public String getNombre() {
        return(nombre);
    }
}
