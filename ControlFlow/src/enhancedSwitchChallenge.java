public class enhancedSwitchChallenge {

    public static void main(String[] args) {

    printWeekDay(8);


    }

    public static void printDayOfWeek(int day){
       String dayOfWeek = switch (day) {
           case 0 -> "Sunday";
           case 1 -> ("Monday");
           case 2 -> ("Tuesday");
           case 3 -> ("Wednesday");
           case 4 -> ("Thursday");
           case 5 -> ("Friday");
           case 6 -> ("Saturday");
           default -> "Invalid Day";
       };

        System.out.println(day + " stands for " + dayOfWeek);


        }

        public static void printWeekDay(int day) {

            String dayOfWeek = "invalid Day";
            if (day == 0) {
                dayOfWeek = "Sunday";
            } else if (day == 1) {
                dayOfWeek = "Monday";
            } else if (day == 2) {
                dayOfWeek = "Tues";
            } else if (day == 3){
                dayOfWeek = "Wednesday";
           } else if (day == 4) {
                dayOfWeek = ("Thursday");
            } else if (day == 5) {
                dayOfWeek = "Friday";
            } else if (day == 6) {
                dayOfWeek = "Saturday";
            } else {
                dayOfWeek = "Invalid day";
            }


            System.out.println(day + " stand for " + dayOfWeek  );




        }
        }

        /*
        Instead of Switch statement we can use if-else statements like we
        did here , the code is doing the same, so the result is the same.

        So for every challenge, and for almost any piece of code that we
        write, there is more than one way to solve it.
         */


