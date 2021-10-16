package general;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MilitaryTime {
    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        // Write your code here
        char[] timeChars = s.toCharArray();
        int hour = ((timeChars[0]-'0')  * 10 + timeChars[1] - '0');
        int mins = ((timeChars[3] - '0') * 10 + timeChars[4] - '0');
        int secs = ((timeChars[6] - '0') * 10 + timeChars[7] - '0');
        char c = timeChars[8];
        if(c == 'P' && hour != 12){
            hour = hour + 12;
        }
        else if(c == 'A'){
            if(hour == 12){
                hour = hour - 12;
            }
        }
        String hours = String.valueOf(hour);
        String minutes = String.valueOf(mins);
        String seconds = String.valueOf(secs);
        String time = "";
        if(mins < 10){
            minutes = "0"+minutes;
        }
        if(hour < 10){
            hours = "0"+hours;
        }
        if(secs < 10){
            seconds = "0"+seconds;
        }
        time = hours+":"+minutes+":"+seconds;
        return time;

    }

    public static void main(String[] args) {
        String s = "12:45:54PM";
        System.out.println(timeConversion(s));
    }

}
