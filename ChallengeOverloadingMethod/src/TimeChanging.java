public class TimeChanging {
    public static void main(String[] args) {

        System.out.println(getDurationString(3945)); // First Test

    }
    public static String getDurationString(int seconds){
        // Two step approach to get hours
        int minutes = seconds / 60;
        int hours = minutes / 60;
        System.out.println("hours = " + hours);


       int remainingMinutes = minutes % 60;
        System.out.println("minutes = " + minutes);
        System.out.println("remainingMinutes = " + remainingMinutes);
        return "";

       }

    public static String getDurationString(int minutes, int seconds) {
        return "";

    }
    }






