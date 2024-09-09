package Java01;

public class multidimensionalArrays {
    public static void main(String[] args) {

      int firstArray[][] = {{8,9,10,11},{12,13,14,15}};
      int secondArray[][]= {{30,31,32,33}, {44},{4,5,6}}; // Multidimentional

        System.out.println("This is the first array");
        dispplay(firstArray);

        System.out.println("This is the second array");
        dispplay(secondArray);

    }

    public static void dispplay(int x [][]) {
        for (int row=0; row<x.length; row++) {


            for (int column=0; column<x[row].length;column++){
                System.out.println(x[row][column] + "\t");
            }
            System.out.println();
        }
    }
}
