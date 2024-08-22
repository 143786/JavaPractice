import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("admin - Gets Full Access");
        System.out.println("subadmin - Gets access to create/delete courses ");
        System.out.println("testprep - Gets access to create/delete tests");
        System.out.println("user - Gets access to consume content");
        System.out.println("Enter Your Choice :  ");
        String user = scanner.nextLine();

        switch (user) {
            case "admin":
                System.out.println("Gets Full Access");
                break;
            case "subadmin":
                System.out.println("Gets access to create/delete courses");
                break;
            case "testprep":
                System.out.println("Gets  access to create/delete tests ");
                break;
            case "user":
                System.out.println("Gets access to consume content.");
                break;
            default:
                System.out.println("Your are a Trial user ");

        }

    }
}
