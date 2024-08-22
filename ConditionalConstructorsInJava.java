public class ConditionalConstructorsInJava {
    public static void main(String[] args) {

     boolean isAuthenticated = true;
     if (isAuthenticated)
        System.out.println("LoggedIn");

        // if (!isAuthenticated)
        else
        System.out.println("Not Logged In.");



    }
}
