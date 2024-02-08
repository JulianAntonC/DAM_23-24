package multiplication_game;
import java.util.Arrays;
import java.util.Random;
public class Ahorcado {
    private Incognita[] incognitas;
    private Incognita incognitaAdivinar;
    private String palabraEnJuego;
    private int intentos;

    // Constructor
    public Ahorcado() {
        cargarIncognitas();
        nuevaPartida();
    }

    // Método para cargar las incógnitas iniciales
    private void cargarIncognitas() {
        String[] peliculas = {"Buscando a Nemo", "Lorax", "Fast and Furious", "Ready or not", "Wolverine"};
        String[] libros = {"Harry Potter", "Pedrito Gafitas", "Nacidos de la bruma", "Lord of the rings", "Juego de Tronos"};
        String[] gruposMusicales = {"My Chemical Romance", "Imagine Dragons", "Fallout Boys", "ACDC", "KISS"};

        incognitas = new Incognita[6];

        for (int i = 0; i < 2; i++) {
            incognitas[i] = new Incognita("Pelicula", peliculas[i]);
        }

        for (int i = 2; i < 4; i++) {
            incognitas[i] = new Incognita("Libro", libros[i - 2]);
        }

        for (int i = 4; i < 6; i++) {
            incognitas[i] = new Incognita("Grupo Musical", gruposMusicales[i - 4]);
        }
    }

    // Método para iniciar una nueva partida
    public void nuevaPartida() {
        Random random = new Random();
        incognitaAdivinar = incognitas[random.nextInt(6)];
        palabraEnJuego = generarPalabraEnJuego(incognitaAdivinar.getTexto());
        intentos = 12;
    }

    // Método para generar la palabra en juego (ocultar letras)
    private String generarPalabraEnJuego(String palabra) {
        char[] oculta = new char[palabra.length()];
        Arrays.fill(oculta, '_');
        return new String(oculta);
    }

    // Método para mostrar información útil al usuario cuando quedan 6 intentos
    public void informarTipoIncognita() {
        if (intentos == 6) {
            System.out.println("Pista: Estás buscando una incógnita del tipo " + incognitaAdivinar.getTipo());
        }
    }

    // Otros métodos y lógica del juego pueden ser implementados según sea necesario

    // Getter para obtener la incógnita a adivinar
    public Incognita getIncognitaAdivinar() {
        return incognitaAdivinar;
    }

    // Getter para obtener la palabra en juego
    public String getPalabraEnJuego() {
        return palabraEnJuego;
    }

    // Getter para obtener el número de intentos restantes
    public int getIntentos() {
        return intentos;
    }
}


