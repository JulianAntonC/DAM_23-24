package multiplication_game;

import java.util.Random;
/*
 *El juego genera un problema de multiplicación aleatorio usando números entre 1 y 50,
 *Los jugadores, por turnos, intentan dar la respuesta al problema.
 *El juego termina cuando se da una respuesta incorrecta.
 *El ganador es el jugador que no dio una respuesta incorrecta.
 */

class MultiplicationGame {
    final private int NUM_PLAYERS;
    private int currentPlayer;
    private int answer;
    private int roundCount = 1;

    public MultiplicationGame(int numPlayers) {
        this.NUM_PLAYERS = numPlayers;
        this.currentPlayer = 1;
        generateProblem();
    }

    private void generateProblem() {
        Random random = new Random();
        int num1 = random.nextInt(50) + 1;
        int num2 = random.nextInt(50) + 1;
        answer = num1 * num2;
        generateRound();
        System.out.println("Problema: " + num1 + " * " + num2);
    }

    private void generateRound() {
        System.out.println("---- " + roundCount + " ----");
    }

    public void checkAnswer(int playerAnswer) {
        if (playerAnswer == answer) {
            System.out.println("Respuesta correcta. ¡Sigue así, Jugador " + currentPlayer + "!");
            roundCount++;
            switchPlayer();
            generateProblem();
        } else {
            System.out.println("Respuesta incorrecta. ¡El Jugador " + currentPlayer + " ha perdido!");
            endGame();
        }
    }

    private void switchPlayer() {
        currentPlayer = (currentPlayer % NUM_PLAYERS) + 1;
    }

    private void endGame() {

        if (roundCount <= 1) {
            System.out.println("¡No hay ganadores!");
        } else {
            switchPlayer();
            if ((NUM_PLAYERS == 3) && (currentPlayer != 3)) {
                currentPlayer += 1;
            } else {
                currentPlayer -= 2;
            }

            System.out.println("¡El Jugador " + (currentPlayer) + " es el ganador!");
        }
        System.exit(0);
    }

    public int getCurrentPlayer() {
        return currentPlayer;
    }

    public void setCurrentPlayer(int currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    public int getNUM_PLAYERS() {
        return NUM_PLAYERS;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    public int getRoundCount() {
        return roundCount;
    }

    public void setRoundCount(int roundCount) {
        this.roundCount = roundCount;
    }
}

