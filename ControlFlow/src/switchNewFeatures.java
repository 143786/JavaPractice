import javax.lang.model.element.NestingKind;

public class switchNewFeatures {
    public static void main(String[] args) {
        int switchValue = 5;
            // Traditional Switch statement:
 /*       switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Was a 3, a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);

                break;
            default:
                System.out.println("Was not 1, 2, 3, 4 or 5");
                break;*/

            // Enhanced Switch Statement :
        switch (switchValue) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
                System.out.println("Was a 3, a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
            }
            default -> System.out.println("Was not 1, 2, 3, 4 or 5");
        }

    }


}


            /*  The switch statement has benn enhanced over time, in
            new versions of the JDK. the traditional version continues
            to work as well. **  When we compare these two statements,
            the first thing we notice is, that the colon after each case
            label has been  replaced with the arrow token as shown there.
            the arrow token -> is the dash and grater than sign.
            Arrow toke is a term that applies also to Lambda expressions
            in Java, something we will be looking at much later in the
            course.

            This switch code is easier to read, and for beginners, it
            comes with more controls in place to prevent coding errors.
            You'll see the traditional switch statement in code written
            before java 14, it's important to be familiar with both
            versions.
            which one you use is really dependent on our development
            and production environments.


             */