package Clases_Y_Objetos.EmpleadoEj;

public class Directivo extends Empleado{

    public Directivo(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return ("Empleado " + getNombre()) + " -> Directivo";
    }

}
