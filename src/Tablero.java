public class Tablero {
    private char[][] tablero;
    private static final int TAMANO = 3;

    public Tablero() {
        tablero = new char[TAMANO][TAMANO];
        inicializarTablero();
    }

    private void inicializarTablero() {
        for (int i = 0; i < TAMANO; i++) {
            for (int j = 0; j < TAMANO; j++) {
                tablero[i][j] = '-';
            }
        }
    }

    public void imprimirTablero() {
        for (int i = 0; i < TAMANO; i++) {
            for (int j = 0; j < TAMANO; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean hacerMovimiento(int fila, int columna, char simbolo) {
        if (fila >= 0 && fila < TAMANO && columna >= 0 && columna < TAMANO && tablero[fila][columna] == '-') {
            tablero[fila][columna] = simbolo;
            return true;
        }
        return false;
    }

    public boolean verificarGanador(char simbolo) {
        // Verificar filas
        for (int i = 0; i < TAMANO; i++) {
            if (tablero[i][0] == simbolo && tablero[i][1] == simbolo && tablero[i][2] == simbolo) {
                return true;
            }
        }

        // Verificar columnas
        for (int i = 0; i < TAMANO; i++) {
            if (tablero[0][i] == simbolo && tablero[1][i] == simbolo && tablero[2][i] == simbolo) {
                return true;
            }
        }

        // Verificar diagonales
        if (tablero[0][0] == simbolo && tablero[1][1] == simbolo && tablero[2][2] == simbolo) {
            return true;
        }

        if (tablero[0][2] == simbolo && tablero[1][1] == simbolo && tablero[2][0] == simbolo) {
            return true;
        }

        return false;
    }

    public boolean estaLleno() {
        for (int i = 0; i < TAMANO; i++) {
            for (int j = 0; j < TAMANO; j++) {
                if (tablero[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }
}
