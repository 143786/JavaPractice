package parsClick03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first name ");
        String temp = input.nextLine();

        NewClass object = new NewClass();

        object.setName(temp);
        object.saying();
    }


}
