public class Player {
    private String name;
    private int playerId;

    public int getPlayerId() {
        return playerId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Player() {
        name = "player 1";
        playerId = 5;
    }

}
