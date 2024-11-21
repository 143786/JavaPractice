public class MainMethod03 {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        calculateScore(gameOver, score, levelCompleted, bonus);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        calculateScore(gameOver, score, levelCompleted, bonus);
    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {


        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);

        }

    }

}

/* Method Structure with parameters and return type :
        Method return type is a declared data type for the data
        that will be returned from the method:
      Public static dataType methodName(p1type p1, p2type p2, more...) {
            Method statements
            return value;

 So, similar to declaring a variable with a type, we can declare
 a method to have a type.
 This declared type is placed just before the method name.

 */

