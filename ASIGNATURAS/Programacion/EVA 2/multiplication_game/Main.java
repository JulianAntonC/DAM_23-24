package multiplication_game;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static boolean twoPlayers;
    static boolean multiGame = false;
    public static void main(String[] args) {
        int optionMenu;
        sc.useDelimiter("\n");

        do {
            optionMenu = chooseGame();
            switch (optionMenu) {
                case 1:
                    multiGame = true;
                    twoPlayers = true;
                    play();
                    break;
                case 2:
                    multiGame = true;
                    twoPlayers = false;
                    play();
                    break;
                case 3:
                    multiGame = false;
                    playAhorcado();
                    break;
                default:
                    System.out.println("Hasta pronto!");
                    break;
            }
        } while (optionMenu != 0);

        // Close the Scanner after the loop
        sc.close();
    }

    static private int chooseGame() {
        int optionMenu = 0;

        StringBuilder intro = new StringBuilder();
        intro.append("-----------------------------------------\n")
                .append("Seleccione el juego que desea jugar: \n")
                .append("1. MultiplicationGame (Dos jugadores)\n")
                .append("2. MultiplicationGame (Tres jugadores)\n")
                .append("3. Ahorcado\n")
                .append("Cualquier otro valor para Salir de la aplicación\n")
                .append("-----------------------------------------");

        System.out.println(intro); // Print the menu

        String option = sc.next();

        if (option.equalsIgnoreCase("1") || option.equalsIgnoreCase("2") || option.equalsIgnoreCase("3")) {
            optionMenu = Integer.parseInt(option);
        }
        return optionMenu;
    }

    static public void play() {
        if (multiGame) {
            MultiplicationGame game;
            if (twoPlayers) {
                game = new TwoPlayerGame();
            } else {
                game = new ThreePlayerGame();
            }
            while (true) {
                try {
                    System.out.print("Turno del Jugador " + game.getCurrentPlayer() + ": ");
                    int playerAnswer = sc.nextInt();
                    game.checkAnswer(playerAnswer);
                } catch (Exception e) {
                    System.out.println("Ingresa un número válido.");
                    sc.nextLine();  // Limpiar el buffer del scanner
                }
            }
        } else {
            playAhorcado();
        }
    }

    static public void playAhorcado() {
        Ahorcado ahorcado = new Ahorcado();

        while (ahorcado.getIntentos() > 0 && !ahorcado.haGanado()) {
            System.out.println("Palabra en juego: " + ahorcado.getPalabraEnJuego());
            System.out.print("Intento (" + ahorcado.getIntentos() + " intentos restantes): ");
            char letra = sc.next().charAt(0);
            ahorcado.realizarIntento(letra);
        }

        if (ahorcado.haGanado()) {
            System.out.println("¡Felicidades! Has adivinado la incógnita: " + ahorcado.getIncognitaAdivinar().getTexto());
        } else {
            System.out.println("¡Lo siento! Has agotado todos tus intentos. La incógnita era: " + ahorcado.getIncognitaAdivinar().getTexto());
        }

        // Puedes reiniciar el juego o realizar otras acciones aquí según tus necesidades.
    }
}