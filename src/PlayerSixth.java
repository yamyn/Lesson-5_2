import java.util.Random;

public class PlayerSixth extends PlayerThird {
    PlayerSixth (int price) {
        super(price);
    }

    @Override
    public void playSong() {
        super.playSong();
    }

    @Override
    public void playAllSongs() {
        super.playAllSongs();
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }


    @Override
    public void shuffle() {
        Random random = new Random();
        for (int i = 0; i < getPlaylist().length ; i++) {
            int x = random.nextInt(getPlaylist().length - 1);
            System.out.println("Playing: " + getPlaylist()[x]);
        }

    }
}
