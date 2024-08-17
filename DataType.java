import javax.xml.crypto.Data;
import java.util.Date;

public class DataType {
    public static void main(String[] args) {
     // Primitive Data Types:
        byte age = 23;
        long viewCount = 1_233_456_78;
        float price = 22.34F;
        char gender = 'M';
        boolean isValid = true;
        System.out.println(age);
        System.out.println(viewCount);
        System.out.println(price);
        System.out.println(gender);
        System.out.println(isValid);
     // Non-Primitive Data Type:
     String name = "King Tabish";
        System.out.println(name);
        Date now = new Date();
        System.out.println(now);

    }
}
