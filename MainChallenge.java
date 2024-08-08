public class MainChallenge {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted *bonus);
            System.out.println("Your final score was " + finalScore);
        }

        boolean gameOver1 = true;
        double score1 = 10.000;
        double levelCompleted1 = 8;
        double bonus1 = 200;

        double finalScore1 = score1;
        if (gameOver1){
            finalScore1 += (levelCompleted1 *bonus1);
            System.out.println("Yeah the game is over !");
        }

        
    }
}
