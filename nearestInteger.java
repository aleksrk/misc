package misc;

import java.util.Scanner;

/*
 * Given a number, find the nearest number ending in 99. 
 * If the number ends in 49 or less, round down to the nearest number ending in 00. 
 * If the number ends in 50 or more, round up to the nearest number ending in 99.
 */
public class nearestInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        s = nearInt(s);
        System.out.println(s);
    }

    public static String nearInt(String s) {
        if (s.length() < 3) {
            return "99";
        }
        String lastTwo = s.substring(s.length() - 2);
        int lastTwoInt = Integer.parseInt(lastTwo);
        if (lastTwoInt < 49) {
            s = s.substring(0, s.length() - 2) + "00";
            int temp = Integer.parseInt(s);
            temp -= 1;
            s = Integer.toString(temp);
        } else if (lastTwoInt >= 49) {
            s = s.substring(0, s.length() - 2) + "99";
        }

        return s;
    }
}
