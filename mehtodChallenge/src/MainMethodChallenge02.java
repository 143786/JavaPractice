public class MainMethodChallenge02 {
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

        int position = 4;
        if (playerScore >= 1000 ) {
            position = 1;
        } else if (playerScore >= 500 ) {
            position = 2;
        } else if (playerScore >= 100 ) {
            position = 3;
        }
            return position;
        }
    }
    