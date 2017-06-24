/**
 * Created by tram on 6/23/17.
 */
public class CodingBatWarmUp1 {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (weekday == true && vacation == false) {
            return false;
        } else {
            return true;
        }
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
            return Math.abs(2 * (n - 21));
        } else {
            return Math.abs(n - 21);
        }
    }

    public boolean parrotTrouble(boolean talking, int hour) {
        if (talking == true && (hour < 7 || hour > 20)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean makes10(int a , int b) {
        return a == 10 || b == 10 || a + b == 10;
    }

    public boolean nearHundred(int n) {
        return Math.abs(200 - n) <= 10 || Math.abs(100 - n) <= 10;
    }

    public boolean posNeg(int a , int b , boolean negative) {
        if (negative == false){
            return (a < 0 && b > 0) || (a > 0 && b < 0);
        } else {
            return a < 0 && b < 0;
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
