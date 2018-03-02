public class PlayerFourth extends PlayerThird {
    @Override
    public String[] getPlaylist() {
        return super.getPlaylist();
    }

    PlayerFourth(int price) {
        super(price);
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }

    public void playSong(){
        System.out.println("Playing: " +
                getPlaylist()[getPlaylist().length-1]);
    }

    @Override
    public void playAllSongs() {
        super.playAllSongs();
    }
}
