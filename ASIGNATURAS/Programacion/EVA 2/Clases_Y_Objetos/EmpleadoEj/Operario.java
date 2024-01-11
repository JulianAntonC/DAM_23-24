package Clases_Y_Objetos.EmpleadoEj;

public class Operario extends Empleado {
    public Operario(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return ("Empleado " + getNombre()) + " -> Operario";
    }

}

