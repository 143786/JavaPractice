public class StringSwitch {
    public static void main(String[] args) {

        String str = "two";

        switch (str) {
            case "one":
                System.out.println("one");
                break;
            case "two":
                System.out.println("two");
                break;
            case "three":
                System.out.println("three");
                break;
            default:
                System.out.println("no match");
                break;
        }

    }
}

/*
We can also use a string to control a switch statement.

Being able to use strings in a switch statement streamlines many situations. for example,
using a string-based switch is an improvement over using the equivalent sequence of if/else
statements. However, switching on strings can be more expensive than switching on integers.
Therefore, it is best to switch on strings only in cases in which the controlling data is
already in string form. In other words, don't use strings in a switch unnecessarily.
 */