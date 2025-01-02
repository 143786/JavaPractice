public class whileLoop {
    public static void main(String[] args) {

        int n = 10;

        while (n > 0) {
            System.out.println("tick " + n);
            n--;
        }
    }
}

 /*
1) while :
The while loop is Java's most fundamental loop statement. It repeats a statement or block while its controlling
expression is true.
Here is its general for:

        while(condition) {
// body loop
        }

The condition can be any Boolean expression. The body of the loop will be executed as long as the
conditional expression is true. When condition become false, control passes to the next line of code
immediately following the loop.The curly braces are unnecessary if only a single statement is being
repeated.

Here is a while loop that counts down from 10, printing exactly ten lines of "tick" :

  int n = 10;

        while (n > 0) {
            System.out.println("tick " + n);
            n--;
        }

      since the while loop evaluates its conditional expression at the top of the loop, the body of the loop
      will not execute even once if the condition is false to begin with. For example, in the following fragment,
      the call to println() is never executed:

      int a = 10, b = 20;

      while(a > b )
                  System.out.println("This will not be displayed" );

    The body of the while (or any other of java's loops) can be empty. This is become w null statement(one that
    consists only of a semicolon) is syntactically valid in Java. For example, consider the following program :

    // The target of a loop can be empty
    class NoBody {

        public static void main(String[] args) {

        int i, j;

        i = 100;
        j = 200;

              // find midpoint between i and j
              while(++1 < --j); // no body in this loop
              System.out.println("Midpoint is  " + i);
           }
           }

    This program finds the midpoint between i and j, it generates this ouptu :
    Midpoint is 150

  */