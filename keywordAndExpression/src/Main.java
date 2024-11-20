public class Main {
    public static void main(String[] args) {
        double kilometers = (100 * 1.609344); /* here we create
        an expression to convert miles into kilometers. the
         expression component can include variables, values and
         operators but NOT type like double here, By including
          the datatype and ending with a semicolon, we have
           now created a valid Java statement.
           ** Expression => kilometers = (100 * 1.609344)
           ** Statement  => double kilometers = (100 * 1.609344); */

        int highScore = 50;
        if (highScore > 25 ) {
            highScore = 1000 + highScore;   // add bonus points
        }

        int health = 100;

        if ((health < 25) && (highScore > 1000)) {
            highScore = highScore - 1000;
        }


    } 
}
