public class Main {
    public static void main(String[] args) {

           /*
         if (firstCondition){
             code in block will execute only if firstCondition
             is true.
             block can contain 1 or more statements
        } else if (secondCondition) {
            code in block will execute if firstCondition is false
            and secondCondition is true.
            THERE IS NO LIMIT TO THE NUMBER OF CONDITIONS THAT
            CAN BE TESTED
            } else {
                code in block will execute if
                all conditions above are false

                THE ELSE BLOCK MUST BE LAST BUT IS OPTIONAL
            */
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if (score < 5000 && score > 1000) {
            System.out.println("Your score was less then 5000 but greater than 1000");
        } else if (score < 1000) {
            System.out.println("Your score was less than 1000");
        } else {
            System.out.println("Got here");


        }

    }
}

