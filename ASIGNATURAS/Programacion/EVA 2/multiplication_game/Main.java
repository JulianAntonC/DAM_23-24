package multiplication_game;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static boolean twoPlayers;

    public static void main(String[] args) {
        int optionMenu;
        sc.useDelimiter("\n");

        do {
            optionMenu = chooseGame();
            switch (optionMenu) {
                case 1:
                    twoPlayers = Boolean.TRUE;
                    play();
                    break;
                case 2:
                    twoPlayers = Boolean.FALSE;
                    play();
                    break;
                default:
                    System.out.println("Hasta pronto!");
            }
        } while (optionMenu != 0);
    }

    static private int chooseGame() {
        int optionMenu = 0;

        StringBuilder intro = new StringBuilder();
        intro.append("-----------------------------------------\n").append("Seleccione el juego que desea jugar: \n").append("1. MultiplicationGame (Dos jugadores)\n");
        intro.append("2. MultiplicationGame (Tres jugadores)\n").append("Cualquier otro valor para Salir de la aplicación\n").append("-----------------------------------------");
        Scanner sc = new Scanner(System.in);

        String option = sc.next();

        if (option.equalsIgnoreCase("1") || option.equalsIgnoreCase("2")) {
            optionMenu = Integer.parseInt(option);
        }
        return optionMenu;
    }

    static public void play() {
        if (twoPlayers == Boolean.TRUE) {
            TwoPlayerGame game = new TwoPlayerGame();
        } else {
            ThreePlayerGame game = new ThreePlayerGame();
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

            sc.close();
        }
    }
}