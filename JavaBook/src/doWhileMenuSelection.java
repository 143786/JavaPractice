public class doWhileMenuSelection {
    public static void main(String[] args)
        // Using a do-while to process a menu selection :
            throws java.io.IOException {
        char choice;

        do {
            System.out.println("Help on:  ");
            System.out.println("  1. if");
            System.out.println("  2. switch");
            System.out.println("  3. while");
            System.out.println("  4. do-while");
            System.out.println("  5. for\n");
            System.out.println("Choose one:");
            choice = (char) System.in.read();
        } while ( choice < '1' || choice > '5') ;

                System.out.println("\n");

                switch (choice) {
                    case '1' :
                        System.out.println("The if:\n");
                        System.out.println("if(condition) statement;");
                        System.out.println("else statement;");
                        break;

                    case '2':
                        System.out.println("The switch:\n");
                        System.out.println("switch (expression) { ");
                        System.out.println("  case constant: ");
                        System.out.println("  statement sequence");
                        System.out.println("  break;");
                        System.out.println("  //...");
                        System.out.println("}");
                        break;

                    case '3':
                        System.out.println("The while:\n");
                        System.out.println("while(condition) statement;");
                        break;

                    case '4':
                        System.out.println("The do-while:\n");
                        System.out.println("do  {");
                        System.out.println("  statement;");
                        System.out.println(" } while (condition) ;");
                        break;

                    case '5':
                        System.out.println("The for: \n");
                        System.out.println("for (init; condition; iteration)");
                        System.out.println("  statement;");
                        break;


                }


    }
}



/*
The do-while loop is especially useful when you process a menu selection, because you will usually want
the body of a menu loop to execute at least once. Consider the following program, which implements a very
simple system for Java's selection and iteration statements:

A few points about this example : Notice that characters are read from the keyboard by calling ( System.in.read )
This is one of Java's console input functions. Although Java's console I/O methods won't be discussed in detail
Until chapter 13, ( System.in.read ) is used here to obtain the user's choice. It reads characters from standard
input (returned as integers which is why the return value was cast to char). By default, standard input is line
buffered, so you must press ENTER before any characters that you type will be sent to your program.

Java's console input can be a bit awkward to work with. Further, most real-world Java programs will use a
graphical user interface (GUI). For these reasons, not much use of console input has been made in this book.
However, it is useful in this context. One other point to consider: Because " System.in.read()"  is being used,
the program must specify the " throws java.io.IOException " clause.  THis line is necessary to handle input errors.
It is part of Java's exception handling features, which are discussed in chapter 10.



 */