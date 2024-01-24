import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de personas que desea añadir a la agenda: ");
        int numPersonas = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea después de leer un entero

        ArrayList<Persona> agenda = new ArrayList<>();

        for (int i = 0; i < numPersonas; i++) {
            System.out.println("\nIngresando datos para la persona " + (i + 1) + ":");

            // Pedir y validar nombre y apellidos
            String nombreApellidos;
            do {
                System.out.print("Nombre y apellidos: ");
                nombreApellidos = scanner.nextLine();
            } while (!validarNombreApellidos(nombreApellidos));

            // Pedir y validar correo electrónico
            String correo;
            do {
                System.out.print("Correo electrónico: ");
                correo = scanner.nextLine();
            } while (!validarCorreo(correo));

            // Pedir y validar dirección IP
            String direccionIP;
            do {
                System.out.print("Dirección IP: ");
                direccionIP = scanner.nextLine();
            } while (!validarDireccionIP(direccionIP));

            // Pedir y validar número de teléfono
            String telefono;
            do {
                System.out.print("Teléfono: ");
                telefono = scanner.nextLine();
            } while (!validarTelefono(telefono));

            // Agregar los datos a la agenda
            Persona persona = new Persona(nombreApellidos, correo, direccionIP, telefono);
            agenda.add(persona);

            // Preguntar al usuario si desea terminar de ingresar contactos
            System.out.print("¿Desea terminar de ingresar contactos? (Sí/No): ");
            String terminar = scanner.nextLine().toLowerCase();
            if (terminar.equals("si")) {
                break;
            }
        }

        // Imprimir la agenda por pantalla
        System.out.println("\nAgenda:");
        for (int i = 0; i < agenda.size(); i++) {
            System.out.println("\nPersona " + (i + 1) + ":");
            System.out.println(agenda.get(i));
        }
    }

    private static boolean validarNombreApellidos(String nombreApellidos) {
        // Expresión regular para validar nombre y apellidos
        String patron = "^[A-Za-z\\- ]+, [A-Za-z\\- ]+$";
        return nombreApellidos.matches(patron);
    }

    private static boolean validarCorreo(String correo) {
        // Expresión regular para validar correo electrónico
        String patron = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        return correo.matches(patron);
    }

    private static boolean validarDireccionIP(String direccionIP) {
        // Expresión regular para validar dirección IP (IPv4)
        String patron = "^(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\."
                + "(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\."
                + "(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\."
                + "(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)$";
        return direccionIP.matches(patron);
    }

    private static boolean validarTelefono(String telefono) {
        // Expresión regular para validar número de teléfono (España)
        String patron = "^\\+(34) \\d{9}$";
        return telefono.matches(patron);
    }
}

class Persona {
    private String nombreApellidos;
    private String correo;
    private String direccionIP;
    private String telefono;

    public Persona(String nombreApellidos, String correo, String direccionIP, String telefono) {
        this.nombreApellidos = nombreApellidos;
        this.correo = correo;
        this.direccionIP = direccionIP;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Nombre y apellidos: " + nombreApellidos + "\n" +
                "Correo electrónico: " + correo + "\n" +
                "Dirección IP: " + direccionIP + "\n" +
                "Teléfono: " + telefono;
    }
}