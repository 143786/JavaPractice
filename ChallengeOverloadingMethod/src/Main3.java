public class Main3 {
    public static void main(String[] args) {


        System.out.println("5ft, 8in = " + convertToCentimeters(5, 8) + "cm");
        System.out.println("68in = " + convertToCentimeters(68) + "cm");

        }

        public static double convertToCentimeters(int inches) {
            return inches * 2.54;
        }


        public static double convertToCentimeters(int feet, int inches) {
             // return convertToCentimeters((feet * 12) + inches );
            int feetToInches = feet * 12;
            int totalInches = feetToInches + inches;
            double result = convertToCentimeters(totalInches);
            return result;

            /*
             we could've written that method differently and set up local
            variables to do all the same work, here we do that :

            so in this code, it's a lot easier to understand what's
            happening for someone else reading our code.

            Coding in this way is much clearer, and much more readable.
            Although you'll see a lot of code written, like we wrote
            single return statement there, I want to encourage you to
            practice writing more readable code.
            One questions?   Isn't it taking up more memory to write it
            this way?
            And it is, but all the local variables in this method will be
            eligible to have their memory reclaimed when the method
            completes execution.
            Again, it's a matter of style, and it's more work for you as a
            developer to write our four lines of code versus one.
            But even the future you  less likely to make mistakes and find
            reviewing the code at some later date a bit easier.



             */
        }


    }




/*                  Overloaded Method Challenge Instructions

Create two methods with the same name: convertToCentimeters.
The first method has one parameter of type int, which represents the entire height in inches.
You'll convert inches to centimeters, in this method, and pass back the number of centimeters,
as a double. The second method has two parameters of type int, one to represent height in feet,
and one to represent the remaining height in inches. So if a person is 5 foot, 8 inches,
the values 5 for feet and 8 for inches would be passed to this method. This method will
convert feet and inches to just inches, then call the first method, to get the number of
centimeters, also returning the value as a double.

Both methods should return a real number or decimal value for total height in centimeters.

Call both methods, and print out the results.

The conversion formula from inches to centimeters is 1 inch = 2.54 cm.
Also, remember one foot = 12 inches.
You can use the link below to test your results:
https://www.metric-conversions.org/length/feet-to-centimeters.htm

     */