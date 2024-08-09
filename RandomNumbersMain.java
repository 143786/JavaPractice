import java.util.Random;
public class RandomNumbersMain {
    public static void main(String[] args) {

        Random random = new Random();
        int x = random.nextInt(20);

        System.out.println(x);


    }
}
