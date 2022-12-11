import java.rmi.server.RemoteStub;

public class Juego {
    private Laberinto laberinto;
    private Player player;

    public Juego() {
        laberinto = new Laberinto();
        player = new Player();
    }

    public boolean colisiona() {

        for (int i = 0; i < laberinto.maze.length; i++) {
            for (int j = 0; j < laberinto.maze.length; j++) {
                if (laberinto.maze[i][j] == 0) {
                    // continuar
                } else if (laberinto.maze[i][j] == 1) {
                    // muro
                }
            }

        }
        return true;
    }

}
