public class ArrayBroCode {
    public static void main(String[] args) {

        /* array = used to store multiple values
        in a single variable */

  /* String[] cars = {"Camaro", "Corvette", "Tesla"};
   cars[0] = "Mustang";

        System.out.println(cars[2]); */

        String[] cars = new String[6];

        cars[0] = "Camaro";
        cars[1] = "Corvette";
        cars[2] = "Tesla";
        cars[3] = "BMW";
        cars[4] = "Audi";
        cars[5] = "Mercedez-Benz";

        for (int i=0; i<cars.length; i++) {
            System.out.println(cars[i]);
            
        }
    }
}
