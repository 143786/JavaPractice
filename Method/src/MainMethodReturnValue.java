public class MainMethodReturnValue {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("The highScore is " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        System.out.println("The next highScore is " +
        calculateScore(gameOver, score, levelCompleted, bonus));
        // In an expression, we could make a call to a method that
        // returns an int value, like I have done here.
        // In other words, a method call that returns a value can be
        // used in expressions, and as an expression alone.
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {


        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;

        }

        return finalScore;

    }

}

/*
                    The return statement
       So, what's a return statement ?
       Java states that a return statement returns control to
       invoker of a method.
       The most common usage of the return statement, is to return
       a value back from a method.

       * The lost common place for a return statement is right before
       the method's closing brace, and that's what we do here.






 */

