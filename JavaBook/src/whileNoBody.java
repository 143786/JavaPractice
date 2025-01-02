public class whileNoBody {
    public static void main(String[] args) {

        int i, j;

        i = 400;
        j = 800;

        // find midpoint between i and j
        while(++i < --j); // No-body in this loop
        System.out.println("Midpoint is  " + i);
    }
}

/*
The body of the while (or any other of java's loops) can be empty. This is become a null statement(one that
consists only of a semicolon) is syntactically valid in Java. For example, consider the following program :

Here is how this while loop works:
The value of i is incremented, and the value of j is decremented. These values are then compared with one
another. If the new value of i is still less than the new value of j, then the loop repeats. If i will be equal to
or greater than j, the loop stops. Upon exit from the loop, i will hold a value that is midway between the original
values of i and j.
This procedure only works when i is less than j to begin with. As you can see, there is no need for a loop body ; all
the action occurs within the conditional expression, itself.

 **** In professionally written java code, short loop are
frequently coded without bodies when the controlling expression can handle all  the details itself.
 */