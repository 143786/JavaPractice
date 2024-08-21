public class StringBufferAndStringBuilderInJava {
    public static void main(String[] args) {

        long startingTime = System.currentTimeMillis();
        StringBuffer buffer = new StringBuffer("Hello ");
        System.out.println(buffer.capacity());
        // buffer.append("World");
        // System.out.println(buffer);
        for (int i = 0; i < 10000; i++) {
            buffer.append("World");
        }
        System.out.println("Time Taken by StringBuffer: " + (System.currentTimeMillis() - startingTime));


        StringBuilder builder = new StringBuilder("Hello ");
        System.out.println(builder.capacity());
        // builder.append("World");
        // System.out.println(builder);
        for (int i = 0; i < 10000; i++) {
            buffer.append("World");


            System.out.println("Time Taken by StringBuilder: " + (System.currentTimeMillis() - startingTime));

        }
    }
}
