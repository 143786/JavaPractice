public class ForLoop {
    public static void main(String[] args) {

        for(int i=1; i<=5; i++) {
            System.out.println("DAY " + i);
            for (int j=1; j<=9; j++ ) {
                System.out.println("    " + (j+8));
            }
        }
    }
}

/*
In ForLoop we can just write the all in just one sentence :
in a loop we have 3 parts :
1- counter that we're initializing it  : int i = 5;
2- conditions : while (i<=4);
3- increment or decrement :  i++ or i--;

so we  can just write all these things in one line :
we can do it but with forLoop not whileLoop :
for(int i = 5; i <= 4; i++;)
 We have 3 semicolons in between because we have 3 statements

    *** inner Loop  :
    loop inside of loop.

   ** when we are adding a string with a number,it will
   concatenate; like this :  System.out.println("    " + j+8);
   to resolve it, we put a bracket :
    System.out.println("    " + (j+8));





**** Computer normally start their counting from zero,
it's because of the binary format (0 1) .
in binary, we have zero to one.
in Number system also we start with zero.
In general, in computers, the number system starts with
zero.
 */