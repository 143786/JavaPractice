public class MainMethodReturnValueFinal {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("The highScore is " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        System.out.println("The next highScore is " +
        calculateScore(gameOver, score, levelCompleted, bonus));

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {


        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;

        }

        return finalScore;

    }

}

/*
        A method can be a statement or an expression in some
        instances.

        Any method can be executed as a statement.
        A method that returns a value can be used as an expression,
        or as part of any expression.

        SOme programming languages will call a method that return
        a value, a function, and a method that doesn't return a
        value, a procedure.

        ** You'll often hear function and method used interchangeably
        in Java.
        ** Method with void return type = called procedure.

        So there are quite a few declarations that need to occur as
        we create a method.
        THis consist of :
            *- Declaring Modifiers : These are keywords in Java with
            special meanings, we've seen " public " and " static " as
            examples, but there are others.

           *- Declaring the return type:
                - void is a java keyword meaning no data is returned
                   from a method.
                -  Alternatively, the return type can be any primitive
                   data type or class.
                -  If a return type is defined, the code block must use
                   at least one return statements, returning value, of
                   the declared type or comparable type.

             *- Declaring the Method :
                - Declaring the method name, lower camel case is recommended
                  for method names.
               -  Declaring the method parameters in parentheses () .
                  A method is not required to have parameters, so a set of
                  empty () parentheses would be declared in that case.

                - Declaring the method block with opening and closing {}
                  curly braces. this is also called the method body.

               *- Declaring the parameters:
                  Parameters are declared as a list of comma-separated
                  specifiers, each of which has a parameter type and a
                  parameter name ( or identifier ).
                  - Parameter order is important when calling the method.
                  The calling code mut pass arguments to the method, with
                  the same or comparable type, and in the same order, as
                  the declaration.

                  - THe calling code must pass the same number of arguments,
                    as the number of parameters declared.

                *- Declaring the Return Type :
                        When declaring a return type:
                    - void is a valid return type, and means no data is returned.
                      any other return type requires a return statement, in the
                      method code block.

                   *- THe Return Statement for methods that have a return type
                      if a method declares a return type, meaning it's not void,
                      then a return type is required at any exit point from the
                      method block.
                      Consider the method block shown here :
                            public static boolean isTooYoung(int age) {
                                if(age < 21 ) {
                                    return true;
                                    }
                                }

                       so in the case of using a return statement in nested code
                       blocks in a method, all possible code segments must result
                       in a value being returned.
                       The following code demonstrates one way to do this :
                                public static boolean isTooYoung(int age) {
                                    if(age < 21 ) {
                                    return true,
                                    }
                                    return false;
                                    }


                        This code is valid because if age is greater than or equals
                        to 21 the code will return false, in that instance.
                        One common practice is to declare a default return

                        One common practice is to declare a default return value
                        at the start of a method, and only have a single return
                        from a method, returning that variable , as shown in this
                        example method:
                                public static boolean isTooYoung(int age ) {
                                    boolean result = false;
                                    if (age < 21 ) {
                                        result = true;
                                        }
                                        return result;
                                        }


                       *- THe Return Statement for methods that have void as a return type

                            This return statement can return with no value from
                            method, which is declared with a void return type.
                            In this case, the return statement is optional, but it may
                            be used to terminate execution of the method at some earlier
                            point than the end of the method block, as shown here :

                                public static void methodDosesSomething(int age) {
                                    if (age > 21) {
                                    return;
                                    }
                                    // Do more stuff here
                                    }

                           *-  THe Method Signature
                               A method is uniquely  defined in a class by its name,
                               and the number and type of parameters that are declared
                               for it. THis called the method signature.

                               You can have multiple methods with the same method name,
                               as long as the method signature ( meaning the parameters
                               declared) are different.

                               THis will become important later in this section, when we
                               cover overloaded methods.

                             *- Default values for parameters :
                                in many languages, method can be defined with default values,
                                and you can omit passing values for these when calling the method.

                                But Java doesn't support default values for parameters.
                                It's important to state again, in Java, the number of arguments
                                you pass, and their type must match the parameters in the
                                method declaration exactly.

                              *- Revisiting the main method
                                 Now, that we're armed with knowledge about methods, we can
                                 revisit the main method, and examine it again.

                                 The main method is special in Java, because java's virtual
                                 machine (JVM) looks for the method, with this particular signature,
                                 and uses it as the entry point for execution of code.
                                 This method has two modifiers ( public and static ).

                                        public static void main (String[] args ) {
                                                // code in here
                                                }
                                  This method has void as the return type, so now we know
                                  this method doesn't return any data.

                                  The name of this method is main, all in lowercase. Again
                                  this is important.

                                  You can actually name a method main with a capital M, or
                                  all capital letter even, if you want to, and the Java
                                  compiler will let you do that.




























 */

