import java.util.Timer;

public class Main {
    public static void main(String[] args) {

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Ayline", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Tabish", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Nil", highScorePosition);

        highScorePosition = calculateHighScorePosition(25);
        displayHighScorePosition("Sean", highScorePosition);


    }

    public static void displayHighScorePosition(String playerName, int HighScorePosition) {
        System.out.println(playerName + " managed to get into position " + HighScorePosition +
                " on the high score list");

    }


    public static int calculateHighScorePosition (int playerScore) {

        if (playerScore >= 1000 ) {
            return 1;
        } else if (playerScore >= 500 && playerScore < 1000 ) {
            return 2;
        } else if (playerScore >= 100 && playerScore < 500) {
            return 3;
            
        } else {
            return 4;
        }
    }


}