import java.util.concurrent.ThreadPoolExecutor;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, Tabish");

        boolean isAlien = false;
        if (isAlien == false) { // !isAlien
            System.out.println("it is not alien! ");
            System.out.println("And i am scared");
        }

        int topScore = 80;
        if (topScore == 100) {
            System.out.println("You got the high score !");
        }
        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100)) {  // && operator means and it should be correct all 2 conditions
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {  // bitwise || means or
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (isCar == true) {
            System.out.println("This is not supposed to happen");
        }

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;

        if (isDomestic) {
            System.out.println("This car is domestic to our country");
        }

        String s = (isDomestic) ? "This car is domestic" : "This car is not d";
        System.out.println(s);

    }
}


