package Clases_Y_Objetos.EmpleadoEj;

public class Oficial extends Operario{
    public Oficial(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return ("Empleado " + getNombre()) + " -> Operario -> Oficial";
    }
}
