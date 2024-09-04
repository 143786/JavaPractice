public class overloadingMethod {
    public static void main(String[] args) {
        int newScore = calculateScore("Tabish", 500);
        System.out.println("New score is " + newScore);

        calculateScore(75);
        calculateScore("Ayline ",  100);
    }
    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + "scored " + score + "points");
        return score * 1000;

    }

    public static int calculateScore( int score){
        System.out.println("unnamed player scored " + score + "points");
        return score * 1000;

    }

    public static int calculateScore(){
        System.out.println("No player name, no player score");
        return 0;

    }
}
