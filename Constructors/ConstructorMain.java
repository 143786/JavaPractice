package Constructors;

import java.util.Scanner;

public class ConstructorMain {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        NewClass object = new NewClass("Ayline");
        NewClass object2 = new NewClass("Sara");

        object.saying();
        object2.saying();

    }
}
