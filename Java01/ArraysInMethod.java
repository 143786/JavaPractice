package Java01;

public class ArraysInMethod {
    public static void main(String[] args) {

        int ayline[] = {3,4,5,6,7}; // variable
        change(ayline); // Call the method

        for (int y : ayline){
            System.out.println(y);
        }

    }
    public static void change( int x []){
        for (int counter = 0; counter < x.length; counter++ ){
            x[counter] +=5;
        }

    }
}
