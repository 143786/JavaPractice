public class TypeCasting {
    public static void main(String[] args) {

       /* int intValue = 100;

    // Implicit Type Casting from int to long
        long longValue =  intValue;
    // Implicit Type Casting from long to double
        double doubleValue =  longValue;

        System.out.println(intValue);
        System.out.println(longValue);
        System.out.println(doubleValue);
*/

        double doubleValue = 100.56;
        // Explicit Type Casting from double to int:
        int intValue = (int) doubleValue;

        System.out.println(doubleValue);
        System.out.println(intValue);




    }
}
