/**
 * Created by tram on 6/23/17.
 */
public class CodingBatWarmUp1 {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return aSmile == bSmile;
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
        return (talking && (hour < 7 || hour > 20));
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

    public String missingChar(String str, int n) {
        return str.substring(0 , n) + str.substring(n + 1);
    }

    public String frontBack(String str) {
        if (str.length() <= 1) {
            return str;
        } else {
            return "" + str.charAt(str.length() - 1) + str.substring(1 , str.length() - 1) + str.charAt(0);
        }
    }

    public String front3(String str) {
        if (str.length() < 3) {
            return str + str + str;
        } else {
            return str.substring(0 , 3) + str.substring(0 , 3) + str.substring(0 , 3);
        }
    }

    public boolean or35(int n) {
        return (n % 3 == 0) || (n % 5 == 0);
    }

    public boolean startHi(String str) {
        return str.startsWith("hi");
    }

    public boolean icyHot(int temp1 , int temp2) {
        return (temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0);
    }

    public boolean in1020(int a , int b) {
        return (a >= 10 && a <= 20) || (b >= 10 && b <= 20);
    }

    public boolean hasTeen(int a , int b , int c) {
        return (a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <=19);
    }

    public boolean loneTeen(int a , int b) {
        return ((a >= 13 && a <= 19) || (b >=13 && b <= 19)) && !((a >= 13 && a <= 19) && (b >= 13 && b <= 19));
    }

    public int close10(int a , int b) {
        if (Math.abs(10 - a) > Math.abs(10 - b)) {
            return b;
        } else {
            if (Math.abs(10 - a) == Math.abs(10 - b)) {
                return 0;
            } else {
                return a;
            }
        }
    }

    public boolean in3050(int a , int b) {
        return ((a >= 30 && a <= 40) && (b >= 30 && b <= 40)) || ((a >= 40 && a <= 50) && (b >= 40 && b <= 50));
    }

    public int max1020(int a , int b) {
        if ((a >= 10 && a <= 20) && (b >= 10 && b <= 20) && (a > b)) {
            return a;
        }

        if  ((a >= 10 && a <= 20) && (b >= 10 && b <= 20) && (b > a)) {
            return b;
        }

        if (!(a >= 10 && a <= 20) && !(b >= 10 && b <= 20)) {
            return 0;
        }

        if((a >= 10 && a <= 20) && !(b >= 10 && b <= 20)) {
            return a;
        } else {
            return b;
        }
    }

}
