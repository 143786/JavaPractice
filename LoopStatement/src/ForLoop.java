public class ForLoop {
    public static void main(String[] args) {

        for(int count = 1; count <=5; count++) {
            System.out.println(count);
        }

        for (double rate = 2.0; rate <= 9.0; rate++ ) {
            double interestAmount = calculateInterest(10000.0, rate );
            System.out.println("10,000 at " + rate + "% interest = " + interestAmount);

        }

        for (double i = 7.5; i <= 10; i += 0.25) {
            double interestAmount = calculateInterest(100.00, i);
            if (interestAmount > 8.5) {
                break;
            }
            System.out.println("$100 " + i + "% interest = $" + interestAmount);

        }


    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount *(interestRate / 100));

    }
}
