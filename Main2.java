import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Tabish();


    }

    public static void Tabish() {
        Scanner ayline = new Scanner(System.in);

        double fNum, sNum, answer;

        System.out.println("Please enter the first number: ");
        fNum = ayline.nextDouble();
        System.out.println("Please enter the second number");

        sNum = ayline.nextDouble();

        answer = fNum + sNum;

        System.out.println(answer);
    }
}
