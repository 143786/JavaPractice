import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        // Logical operators = used to connect two or more expressions.
        //
        //   && = (AND) both conditions must be true
        //   || = (OR) either condition must be true
        //    ! = (NOT) reverse boolean value of condition


     /*   int temp = 35;

      //  if(temp >30){
            System.out.println("It is hot outside");
        }
        else if (temp >=20 && temp <= 30) {
            System.out.println("It is warm outside");
        }
        else {
            System.out.println("It is cold Outside");
        }
*/
        /*  Scanner scanner = new Scanner(System.in);
        System.out.println("You are playing a game! Press q or Q to quit");
        String response = scanner.next();

        if (response.equals("q") || response.equals("Q")) {
            System.out.println("You quit the game");
        } else {
            System.out.println("You are still playing the game *pew pew*");
        }
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("You are playing a game! Press q or Q to quit");
        String response = scanner.next();

        if (!response.equals("q") && !response.equals("Q")) {
            System.out.println("You are still playing the game *pew pew*");

        }
        else {
            System.out.println("You quit the game");
        }

    }
}

