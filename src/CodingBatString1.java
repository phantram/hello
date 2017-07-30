/**
 * String 1: http://codingbat.com/java/String-1
 */
public class CodingBatString1 {

    public String helloName(String name) {
        return "Hello " + name + "!";
    }

    public String makeAbba(String a , String b) {
        return a + b + b + a;
    }

    public String makeTags(String tag , String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    public String makeOutword(String out , String word) {
        String a = out.substring(0 , 2);
        String b = out.substring(2);
        return a + word + b;
    }

    public String extraEnd(String str) {
        String end = str.substring(str.length() - 2);
        return end + end + end;
    }

    public String firstTwo(String str) {
        if (str.length() <= 2) {
            return str;
        } else {
            String first = str.substring(0 , 2);
            return first;
        }
    }

    public String firstHalf(String str) {
        int half = str.length() / 2;
        return str.substring(0 , half);
    }

    public String withoutEnd(String str) {
        return str.substring(1 , str.length() - 1);
    }

    public String comboString(String a , String b) {
        if (a.length() > b.length()) {
            return b + a + b;
        } else {
            return a + b + a;
        }
    }

    public String nonStart(String a , String b) {
        String c = a.substring(1);
        String d = b.substring(1);
        return c + d;
    }

    public String left2(String str) {
        String a = str.substring(0 , 2);
        String b = str.substring(2);
        return b + a;
    }

    public String right2(String str) {
     String a = str.substring(str.length() - 2);
     String b = str.substring(0 , str.length() - 2);
     return a + b;
    }

    public String theEnd(String str , boolean front) {
        if (front) {
            return str.substring(0 , 1);
        } else {
            return str.substring(str.length() - 1);
        }
    }

    public String withoutEnd2(String str) {
        if (str.length() <= 2) {
            return "";
        } else {
            return str.substring(1 , str.length() - 1);
        }
    }

    public String middleTwo(String str) {
        int half = str.length() / 2;

        return str.substring(half - 1 , half + 1);
    }

    public boolean endsLy(String str) {
        return str.endsWith("ly");
    }

    public String nTwice(String str , int n) {
        String first = str.substring(0 , n);
        String last = str.substring(str.length() - n);

        return first + last;
    }
    
}
