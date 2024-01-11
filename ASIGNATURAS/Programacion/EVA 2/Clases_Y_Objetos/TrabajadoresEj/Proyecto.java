package Clases_Y_Objetos.TrabajadoresEj;

public class Proyecto {
    String proyectName;
    String proyectDesc;

    public Proyecto(String proyectName, String proyectDesc) {

        this.proyectName = proyectName;
        this.proyectDesc = proyectDesc; 
    }

    public void mostrarDatosProyecto() {
        System.out.println("Nombre del proyecto " + proyectName.isEmpty());
        System.out.println("Descripción: " + proyectDesc.isEmpty());
        if ((proyectName.isEmpty()) || (proyectDesc.isEmpty())) {
            System.out.println("vacio");
        }
    }

    public String getNombre() {
        return(proyectName);
    }
}
