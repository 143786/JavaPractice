package Java01;

import java.util.Random;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        Random input = new Random();
        int number;

        for (int i=1; i<=10; i++) {
            number = input.nextInt(6);
            System.out.println(number + " ");
        }
    }
}
