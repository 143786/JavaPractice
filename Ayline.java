public class Ayline {
    public static void main(String[] args) {
        int age = 20;

        if (age >= 60) {
            System.out.println("You are old!");
        } else if (age >= 50) {
            System.out.println("You are in your 50s!");

        } else {
            if (age >= 30) {
                System.out.println("You are in your 30s!");
            } else {
                System.out.println("You are too young");
            }
        }
    }
}