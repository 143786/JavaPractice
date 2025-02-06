public class SwitchStatement {

    public static void main(String[] args) {
      /*  int value = 1;
        if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        }  else {
            System.out.println("Was not 1 or 2");
        */

        int switchValue = 4;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                 break;
            case 2:
                  System.out.println("Value was 2");
                  break;
            case 3: case 4: case 5:
                System.out.println("Was a 3, a 4 or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Value was not 1, 2, 3, 4, or 5");

        }



    }
}

/*
        The if statement is a little bit more flexible, in that each
        time I do a test here, I don't have to use the same test
        criteria. So, I could put if value is equal to 1 or else if is
        equal to 4.
        In other words, I can test a different variable all together.
        For the witch statement, I'm testing only the switchValue here.
        And I'm testing different values for that switch value.
        ****
        So, a switch is good to use if we're actually testing the same
        variable, and we want to test different values for that variable.
        Now, we can see that there would be situations where if you had
        20 values to test for, this could get a little bit tedious.
        But there's a shortcut, so we look that :
        case 3: case 4: case 5:
        System.out.println(" was 3, 4 or 5");
        System.out.println("Actually it was a " + switchValue);
        break;

        ***  The important thing is here, is that I'm grouping my
        case tests together in the one line effectively, which makes
        it a lot easier to group values that will ha ve the same
        behavior. So, another important thing to know about the switch
        statement is that it can only be used with a limited number of
        variable data types.
        ** Valid switch Value Types :
        byte, short, int, char
        Byte, Short, Integer, Character
        String
        enum
        ** Important : Cannot use long, float, double or boolean or
        their wrapper.
        The result were be an error in our code if we try to use them.
        ** The concept of Fall through in switch statement:
        Once a switch case label matches the switch variable, no more
        cases are checked.
        Any code after the case label where there was a match found,
        will be executed, until a break statement, or the end of the
        switch statement occurs.
        without a break statement, execution will continue to fall
        through any case labels declared below the matching one, and
        execute each case's code.





 */

