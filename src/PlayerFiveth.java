public class PlayerFiveth extends PlayerThird {
    @Override
    public String[] getPlaylist() {
        return super.getPlaylist();
    }

    PlayerFiveth(int price) {
        super(price);
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }

    @Override
    public void playSong() {
        super.playSong();
    }

    @Override
    public void playAllSongs() {
        for (int i = getPlaylist().length - 1; i >= 0; i--) {
            System.out.println("Playing: " + getPlaylist()[i]);
        }
    }
}
