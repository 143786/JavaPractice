package Java01;

public class abrivationForLoop {
    public static void main(String[] args) {
        int a[] ={3,4,5,6,7};
        int total = 0;

        for (int i : a) {
            total += i;
        }
        System.out.println(total);
    }
}