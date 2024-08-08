public class MainChallenge {

    public static void main(String[] args) {

calculateScore(true, 800, 5, 100);
calculateScore(true, 10000, 8, 200);
    }



    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        // this is a method (calculateScore)

        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted *bonus);
            System.out.println("Your final score was " + finalScore);
        }

    }
}
