package ParsClick02;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        NewClass object = new NewClass();

        System.out.println("Enter your Name: ");
        String name = input.nextLine();
       object.simpleMessage(name);

    }
}
