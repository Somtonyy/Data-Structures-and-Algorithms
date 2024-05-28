public class TimeCoversion {
    public static String timeConversion(String s) {
        // Write your code 
            String hoursString = s.substring(0, 2);
            int hours = Integer.parseInt(hoursString);
            String result = s.substring(0,s.length() - 2);
            if ( s.charAt(s.length() - 2) == 'P') {
                if (hours >= 1 && hours <= 11) {
                    hours = hours + 12;
                    return (12 + Integer.parseInt(s.substring(0,2))) + result.substring(2);
                }
            }
            else if (s.charAt(s.length() - 2) == 'A') {
                if (hours == 12) {
                    return 00 + result.substring(2);
                }
            }
        return result;
        }
}
