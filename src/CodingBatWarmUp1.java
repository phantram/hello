/**
 * Created by tram on 6/23/17.
 */
public class CodingBatWarmUp1 {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        return weekday == false || vacation == true;
    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if ((aSmile == true && bSmile == false) || aSmile == false && bSmile == true) {
            return false;
        } else {
            return true;
        }
    }

    public int sumDouble(int a , int b) {
        if (a == b) {
            return ((2 * a) + (2 * b));
        } else {
            return (a + b);
        }
    }

    public int diff21(int n) {
        if (n > 21) {
            return (2 * (n - 21));
        } else {
            return 21 - n;
        }
    }

    public boolean parrotTrouble(boolean talking, int hour) {
        return (talking == true && (hour < 7 || hour > 20));
    }

    public boolean makes10(int a , int b) {
        return a == 10 || b == 10 || a + b == 10;
    }

    public boolean nearHundred(int n) {
        return Math.abs(200 - n) <= 10 || Math.abs(100 - n) <= 10;
    }

    public boolean posNeg(int a , int b , boolean negative) {
        if (negative){
            return a < 0 && b < 0;
        } else {
            return (a < 0 && b > 0) || (a > 0 && b < 0);
        }
    }

    public String notString(String str) {
        if (str.startsWith("not")) {
            return str;
        } else {
            return "not " + str;
        }
    }

}
