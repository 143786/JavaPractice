package Java01;

public class DoWhile {
    public static void main(String[] args) {

        // A = P(1+R)^ N
        // A = Amount
        // P = principal
        // R = Rate
        // N = Number of day

        double amount;
        double principal = 100;
        double rate = 0.1;

        for(int day=1; day<+20; day++){
            amount = principal * Math.pow(1+rate, day);
            System.out.println(day + " " + amount);
        }

    }
}
