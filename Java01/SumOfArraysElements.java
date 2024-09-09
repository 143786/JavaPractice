package Java01;

import javax.swing.*;

public class SumOfArraysElements {
    public static void main(String[] args) {
        int ayline [] = {21, 43, 43, 76, 87, 45};
        int sum = 0;

        for (int i = 0; i < ayline.length; i++) {
            sum += ayline[i];
        }
         System.out.println("Sum of all number is: " + sum);
        // JOptionPane.showMessageDialog(null, "TOTAL is: " +sum);



    }
}
