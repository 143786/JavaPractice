public class MainChallenge {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = score;

        if (gameOver) /* it's the same (gameOver== true) making this
         helps make the code more readable, and it can help you prevent
         making an accidental assignment error (meaning if you forgot
         one of the two equal signs, it changes the whole meaning of
          the expression). Coding in this way is a win-win. */ {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);


        }

//        boolean newGameOver = true;
//        int newScore = 10000;
//        int newLevelCompleted = 8;
//        int newBonus = 200;
//
//        int newFinalScore = newScore;
//
//        if (newGameOver) {
//            newFinalScore += (newLevelCompleted * newBonus);
//            System.out.println("Your final score was " + newFinalScore);
//        }

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);

            /* the advantage of this approach is that it is
            quicker, and we didn't create new variables. so
            we used the memory more efficiently. But the
            disadvantages, firstly, we haven't got a permanent
            record of the original variable values, up at the top
            line :         int score = 800;
                           int levelCompleted = 5;
                           int bonus = 100;

            so if we wanted to keep the fact that this first score
            is 800, that level was completed was 5, and its bonus was
            100, we can't do that because  we've now updated the values
            in those variables.
            Secondly, we've used gameOver equals true for both, and if
            we were tracking two players scores, maybe gameOver was only
            true for one of them. in that case, maybe we didn't want
            to actually print this out at all because this player's
            game was not over, and therefor the value of game over would
            actually be false. the other disadvantage is simply that we're
            copying and pasting code. and the disadvantage with copying
            and pasting code is, we're duplicating code. And that means,
            if we need to make a change, then we need to change it in more
            than one place. And if we forgot that our code is duplicated,
            we may forget to change it in one place, luckily, there
            are lots of ways to help reduce or eliminate the need for
            any duplicate code => (Methods). we can remove repeated
            and similar blocks of code by using the concept of
            methods. Methods take the code block to the next level,
            and effectively, allow us to reuse that code in many
            places, with the code written in just a single place.

            Method in Java give us a way to write code once and then
            reuse that code anywhere in our program.
            A method declares executable code that can be invoked,
            passing a fixed number of values as arguments.
            --- THE Benefits of the Method :
            A method is a way of reducing code duplication.
            A method can ve executed many times with potentially
            different results, by passing data to the method in the
            form of arguments.

             */
        }
    }
}
