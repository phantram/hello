/**
 * Created by tram on 6/26/17.
 */
public class CodingBatWarmUp2 {

    public static String stringTimes(String str , int n) {
        String times = "";

        for (int i = 0; i < n; i = i + 1) {
            times = times + str;
        }
        return times;
    }

    public String frontTimes(String str , int n) {
        String copies = "";

        if (str.length() >= 3) {
            for (int i = 0; i < n; i = i + 1) {
                copies = copies + str.substring(0 , 3);
            }
            return copies;
        } else {
            for (int i = 0; i < n; i = i + 1) {
                copies = copies + str;
            }
            return copies;
        }
    }

    public static int countXX(String str) {
        int c = 0;
        for (int i = 0; i < str.length() - 1; i = i + 1) {
            if (str.substring(i , i + 2).equals("xx")) {
                c = c + 1;
            }
        }
        return c;
    }



    public String stringBits(String str) {
        StringBuilder bit = new StringBuilder();

        for (int i = 0; i < str.length(); i = i + 2) {
            bit.append(str.charAt(i));
        }
        return bit.toString();
    }

    public String stringSplosion(String str) {
        return "";
    }

    public int last2(String str) {
        return 0;
    }

    public int arrayCount9(int[] nums) {
        int c9 = 0;
        for (int i = 0; i < nums.length; i = i + 1) {
            if (nums[i] == 9) {
                c9 = c9 + 1;
            }
        }
        return c9;
    }

    public boolean arrayFront9(int[] nums) {
        int c = 0;
        if (nums.length >= 4) {
            for (int i = 0; i < 4; i = i + 1) {
                if (nums[i] == 9) {
                    c = c + 1;
                }
            }
        } else {
            for (int i = 0; i < nums.length; i = i + 1) {
                if (nums[i] == 9) {
                    c = c + 1;
                }
            }
        }

        return c > 0;
    }

}
