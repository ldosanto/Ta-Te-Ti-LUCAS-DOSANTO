public class Main {
    public static void main(String[] args) {
        Jugador jugador1 = new Jugador("Jugador 1", 'X');
        Jugador jugador2 = new Jugador("Jugador 2", 'O');

        Juego juego = new Juego(jugador1, jugador2);
        juego.iniciar();
    }
}