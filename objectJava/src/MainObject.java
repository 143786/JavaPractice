 class  Calculator{

    int a;

    public int add(int n1, int n2)
    {
        int r = n1 + n2;
        return r;
    }

}

public class MainObject {
    public static void main(String a [] )
    {

        int num1 = 4;
        int num2 = 5;

        Calculator calc = new Calculator();
        /* with this line, we create the object.
        and once you got the object, you can
        call it here : now we can call add method :
         */
        int result = calc.add(num1, num2);
        System.out.println(result);
    }
}




/*
  object Oriented programming OOP
   - Objet has 2 particularity :
        1) properties
        2) Behaviours or method
  In Java, if we want to create an object, we have to first
  create a class. why we need object and class concepts?
  * Everything has to be done with the help of object.
  In real life, we can't do anything without objects.
  So in java as well. so if you want to do something,you
  have to create an object.

  How will you get an object ? And who creates object?
    * at first, we have to create a class file, which will
    act as a blueprint, for someone who can create object
    for us in Java.?  who creates objects in Java ?
    it's Our JVM. the class file gets compiled to create
    a byte code, now that byte code goes to the JVM, and
    that's where you get the object.






 */