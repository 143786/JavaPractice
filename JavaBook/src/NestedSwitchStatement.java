public class NestedSwitchStatement {
    public static void main(String[] args) {


    }
}


/*
Nested switch Statements :
We can use a switch as part of the statement sequence of an outer switch. This is called a nested switch.
Since a switch statement defines its own block, no conflicts arise between the case constants in the inner
switch and those in the outer switch. For example, the following fragment is perfectly valid :

  switch (count) {
            case 1:
                switch (target) { // nested switch
                    case 0:
                        System.out.println("target is zero");
                        break;
                    case 1: // no conflicts with outer switch
                        System.out.println("target is one");
                        break;
                }
                break;


        }
 */