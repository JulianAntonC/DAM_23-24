package Clases_Y_Objetos.EmpleadoEj;

public class Tecnico extends Operario{
    public Tecnico(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return ("Empleado " + getNombre()) + " -> Operario -> Tecnico";
    }
}
