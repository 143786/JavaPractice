import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        /* while loop =  execute a block of code as
         long as  it 's condition remains true */

        Scanner scanner = new Scanner(System.in);
        String name = "";

        while (name.isBlank()) {
            System.out.println("Enter your name: ");
            name = scanner.nextLine();

        }
        System.out.println("Hello "+name);

    }
}