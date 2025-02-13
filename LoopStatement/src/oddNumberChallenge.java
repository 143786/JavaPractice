public class oddNumberChallenge {
    public static void main(String[] args) {
        System.out.println(isOdd(5));
        System.out.println(sumOdd(1,10));
    }

        // Method to check if a number is odd
        public static boolean isOdd(int number) {
            if (number <= 0) {
                return false;
            }
            return number % 2 != 0;
        }

        // Method to sum odd numbers in a given range
        public static int sumOdd(int start, int end) {
            if (start <= 0 || end <= 0 || end < start) {
                return -1; // Invalid input
            }

            int sum = 0;
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum += i;
                }
            }
            return sum;
        }



    }

