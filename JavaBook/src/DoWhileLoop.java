public class DoWhileLoop {
    public static void main(String[] args) {
        int n = 10;

      /*  do {
            System.out.println("tick " + n);
            n--;
        } while (n > 0);

      */
      // The loop in the preceding program, while technically correct, can be written more efficiently as follows :

               do {
                    System.out.println("tick  " + n) ;
                   } while (--n > 0);

    }
}



/* do-while :
If the conditional expression controlling a while loop is initially false, then the body of the loop will
not be executed at all. However, sometimes it is desirable to execute the body of a loop at least once, even
if the conditional expression is false to begin with.
In other words, there are times when you would like to test the termination expression at the end of the loop
rather than at the beginning.Furtunately, Java supplies a loop that does just that : the do-while.
The do-while loop always executes its body at least once, because its conditional expression is at the bottom
of the loop. its general form is :

        do {
// body of loop
        } while (condition);

each of iteration of the do-while loop first executes the body of the loop and then evaluates the conditional
expression. If this expression is true, the loop will repeat. Otherwise, the loop terminate.
As with all of Java's loops, condition must be a Boolean expression. Here is an example :

 int n = 10;

        do {
            System.out.println("tick " + n);
            n--;
        } while (n > 0);


        The loop in the preceding program, while technically correct, can be written more efficiently as follows :

        do {
            System.out.println("tick  " + n) ;
            } while (--n > 0);



      In this example, the expression (--n > 0) combines the decrement of n and the test for zero into one
      expression. here is how it works. First, the --n statement executes, decrementing n and returning the
      new value of n. This value is then compared with zero. If it is greater than zero, the loop continues;
      otherwise, it terminates.

      The do-while loop is especially useful when you process a menu selection, because you will usually want
      the body of a menu loop to execute at least once. Consider the following program, which implements a very
      simple system for Java's selection and iteration statements:
 */