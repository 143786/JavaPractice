public class DoWhileLoop {
    public static void main(String[] args) {

        int i = 5;

            do
            {
                System.out.println("Hi " + i);
                i++;

            }   while (i<=4);

    }
}


/* if the conditions is false, with Do while we be able
 to execute the block at least once even if your condition
 is false, in this case, the i = 5 so the condition is false,
 because the condition is :  while (i<=4);
 but if we run code, we will get the output once :
 Hi 5

 SO if you want to get the ouput, even once even if your
 conditions is false, so you will be using do while 


 */
