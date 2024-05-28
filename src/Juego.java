import java.util.Scanner;

public class Juego {
    private Tablero tablero;
    private Jugador jugador1;
    private Jugador jugador2;

    public Juego(Jugador jugador1, Jugador jugador2) {
        tablero = new Tablero();
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
    }

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        boolean turnoJugador1 = true;
        boolean juegoTerminado = false;

        while (!juegoTerminado) {
            tablero.imprimirTablero();
            Jugador jugadorActual = turnoJugador1 ? jugador1 : jugador2;
            System.out.println("Turno de " + jugadorActual.getNombre() + " (" + jugadorActual.getSimbolo() + ")");
            System.out.println("Ingrese fila y columna (0, 1 o 2):");

            int fila = scanner.nextInt();
            int columna = scanner.nextInt();

            if (tablero.hacerMovimiento(fila, columna, jugadorActual.getSimbolo())) {
                if (tablero.verificarGanador(jugadorActual.getSimbolo())) {
                    tablero.imprimirTablero();
                    System.out.println("¡" + jugadorActual.getNombre() + " ha ganado!");
                    juegoTerminado = true;
                } else if (tablero.estaLleno()) {
                    tablero.imprimirTablero();
                    System.out.println("¡El juego ha terminado en empate!");
                    juegoTerminado = true;
                } else {
                    turnoJugador1 = !turnoJugador1;
                }
            } else {
                System.out.println("Movimiento inválido, intente de nuevo.");
            }
        }

        scanner.close();
    }
}
