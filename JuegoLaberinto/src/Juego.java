public class Juego {
    private Laberinto laberinto;
    private Player player;
    private boolean colision;
    private int[][] matriz;

    public Juego() {
        laberinto = new Laberinto();
        player = new Player();
        colision = false;
        matriz = laberinto.getMaze();
    }

    public boolean colisiona() {

        for (int i = 0; i < laberinto.getMaze().length; i++) {
            for (int j = 0; j < laberinto.getMaze().length; j++) {
                if (laberinto.getMaze()[i][j] == 0) {
                    // continua el camino
                    colision = false;
                } else if (laberinto.getMaze()[i][j] == 1) {
                    // choco con muro
                    colision = true;
                }
            }

        }
        return colision;
    }

    public void gamePlay() {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                while (matriz[i][j] != 2) {

                    if (colisiona() == false) {
                    }
                }
            }
        }
    }

}
