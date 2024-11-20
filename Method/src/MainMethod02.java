public class MainMethod02 {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = score;


        calculateScore(true, 800, levelCompleted, bonus);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);


            /*
            Method in Java give us a way to write code once and then
            reuse that code anywhere in our program.
            A method declares executable code that can be invoked,
            passing a fixed number of values as arguments.
            --- THE Benefits of the Method :
            A method is a way of reducing code duplication.
            A method can ve executed many times with potentially
            different results, by passing data to the method in the
            form of arguments.

            **** One of the simplest ways to declare a method is like
            this : =>
            public static void methodName() {
            // Method statements form the method body
                    }
             This method has a name, but take no data in, and
             returns no data from the method(which is what the
             special word void means in this declaration). it's
             accessible to the outside because it uses the keyword
             public. Because it is using the keyword static, it can
             be called directly using the class name.
             All the code between the left and right curly braces
             is the method code block, which is also known as the
             method body. method name can be any valid identifier
             java , but I'll be using the lower camel case style
             to name methods.

             We have to start the code for a new method outside
             of another method ending right curly brace,
             */
        }
    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) { /* anything that's
     in between the braces is part of this method that we've called
      calculateScore */

        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);

        }

    }

}

/* Executing a method as a statement :
TO execute a method, we can write a statement in code, which we
say it calling, or invoking, the method.

For a simple method like calculateScore, we just use the name
of method, where we want it to be executed, followed by parentheses,
and a semicolon to complete the statement.
calculateScore();
 */
