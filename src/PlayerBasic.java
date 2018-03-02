
public class PlayerBasic {

    private String song;
    private int price;
    private String [] playlist;


        PlayerBasic(int price) {
            this.price = price;
        }


        PlayerBasic(int price, String song) {
            this.price = price;
            this.song = song;

        }

        public String getSong() {
            return song;
        }

        public int getPrice() {
            return price;
        }

        public void playSong() {
            System.out.println("Playing: " + getSong());
        }

        public void show() {
            System.out.println("\nPlayer price: " + getPrice());
        }

        public void playAllSongs(){}

}
