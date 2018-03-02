
    public class Main {
        public static void main(String[] args) {

            PlayerFirst playerFirst = new PlayerFirst(500,"The best song");
            playerFirst.show();
            playerFirst.playSong();

            PlayerSecond playerBasic = new PlayerSecond(520,"The best song");
            playerBasic.show();
            playerBasic.playSong();

            PlayerBasic playerThree = new PlayerThird(540);
            playerThree.show();
            playerThree.playSong();
            playerThree.playAllSongs();

            PlayerThird playerFour = new PlayerFourth(560);
            playerFour.show();
            playerFour.playSong();
            playerFour.playAllSongs();

            PlayerThird playerFive = new PlayerFiveth(580);
            playerFive.show();
            playerFive.playSong();
            playerFive.playAllSongs();

            PlayerThird playerSix = new PlayerSixth(600);
            playerSix.show();
            playerSix.playSong();
            playerSix.playAllSongs();
            playerSix.shuffle();



        }
    }

