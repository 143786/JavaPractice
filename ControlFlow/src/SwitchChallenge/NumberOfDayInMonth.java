package SwitchChallenge;

public class NumberOfDayInMonth {
        public static int getDaysInMonth(int month, int year){

            if (year < 1 || year > 9_999) {
                return -1; // invalid year

            }

            if (month < 1 || month > 12) {
                return -1;  // invalid month
            }

            return switch (month) {
                case 1, 3, 5, 7, 8, 10, 12 -> 31; //  return 31 for any following months.
                case 4, 6, 9, 11 -> 30; // return 30 for any following months.
                case 2 -> isLeepYear(year) ? 29 : 28; // if it's Feb, determine if it's a leep year
                //first, then return either 28 or 29.
                default -> -1; // This will never be reached due to the validation above

            };
        }
        // method to check if a year is a leep year :
        public static boolean isLeepYear(int year){

            if(year < 1 && year > 9_999){
                return false; // invalid year
            }

            // leep year logic : A year is leep year if it's divisivle by 4 but not by 100 or
            // it's divisible by 400,
            return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);



        }
    }

