public class enhancedStatement {
    public static void main(String[] args) {

                int switchValue = 5;

                switch (switchValue) {
                    case 1 -> System.out.println("Value was 1");
                    case 2 -> System.out.println("Value was 2");
                    case 3, 4, 5 -> {
                        System.out.println("Was a 3, a 4, or a 5");
                        System.out.println("Actually it was a " + switchValue);
                    }
                    default -> System.out.println("Was not 1, 2, 3, 4 or 5");
                }

            String month = "XYZ";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter");


            }


    public static String getQuarter(String month) {

        return switch (month) {
            case "January", "February", "March" -> "1st";
            case "April", "May", "June" -> "2nd";
            case "July", "August", "September" -> "3rd";
            case "October", "November", "December" -> "4th";
           // default -> "bad";
            default -> {
                String badResponse = month + " is bad";
                yield badResponse;
            }
        };
    }
    }


    /*
    Here I didn't use a break, but instead I'm using a return statement.
    This works like a break since the code will exit out of both the
    switch statement and the method at this point.
    There's no chance to fall through to any other code in the switch
    statement, or method.
    I also don't need a default label in this instance, since if the month
    isn't found, the code cil just fall through to the last statement on
    line 40.
    If I get the string, bad back from this method, it means the month
    wasn't valid.

    ** remember, we can use method results anywhere an expression is used.
        So let's go up to the main method, and call the get quarter method.
     */
