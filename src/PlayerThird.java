public class PlayerThird extends PlayerBasic{
    private String[] playlist = {"The best song", "Good song", "Super Song"};


    public String[] getPlaylist() {
        return playlist;
    }

    PlayerThird(int price) {
        super(price);
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }

    public void playSong() {
        System.out.println("Playing: " + playlist[0]);
    }

    public void playAllSongs() {
        for (String i : playlist) {
            System.out.println("Playing: " + i);
        }
    }

    public void shuffle() { }
}
