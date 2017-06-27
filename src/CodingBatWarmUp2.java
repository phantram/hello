/**
 * CodingBat Warm Up 2 Solutions
 * http://codingbat.com/java/Warmup-2
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

        if (str.length() <= 3) {
            String repeat = str;
        } else {

        }   String repeat = str.substring(0 , 3);

        for (int i = 0; i < n; i = i + 1) {
            copies = copies + repeat;
        }
        return copies;
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

    boolean doubleX(String str) {
        for (int i = 0; i < str.length() - 1; i = i + 1) {
            char c = str.charAt(i);
            if (c == 'x') {
                return str.charAt(i + 1) == 'x';
            }
        }
        return false;
    }

    public String stringBits(String str) {
        StringBuilder bit = new StringBuilder();

        for (int i = 0; i < str.length(); i = i + 2) {
            bit.append(str.charAt(i));
        }
        return bit.toString();
    }

    public String stringSplosion(String str) {
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            string.append(str.substring(0 , i));
        }
        string.append(str);
        return string.toString();
    }

    public int last2(String str) {
        int count = 0;
        for(int i = 0; i < str.length() - 2; i = i + 1) {
            if(str.substring(str.length() - 2).equals(str.substring(i , i + 2))) {
               count = count + 1;
            }
        }
        return count;
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

        int a = Math.min(nums.length , 4);

            for (int i = 0; i < a; i = i + 1) {
                if (nums[i] == 9) {
                    c++;
                }
            }

        return c > 0;
    }

    public boolean array123(int[] nums) {
        for(int i = 0; i < nums.length - 2; i = i + 1) {
            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
                return true;
            }
        }
        return false;
    }

    public int stringMatch(String a , String b) {
        int length = Math.min(a.length() , b.length());

        int count = 0;
        for (int i = 0; i < length - 1; i = i + 1) {
            if (a.substring(i , i + 2).equals(b.substring(i , i + 2))) {
                count = count + 1;
            }
        }
        return count;
    }

    public String stringX(String str) {
        if (str.length() >= 2) {
            StringBuilder noX = new StringBuilder();
            noX.append(str.charAt(0));
            for (int i = 1; i < str.length() - 1; i++) {
                if (!(str.charAt(i) == 'x')) {
                    noX.append(str.charAt(i));
                }
            }
            noX.append(str.charAt(str.length() - 1));
            return noX.toString();
        } else {
            return str;
        }
    }

    public static String altPairs(String str) {
        StringBuilder pairs = new StringBuilder();
        for (int i = 0; i < str.length(); i = i + 4) {
            pairs.append(str.charAt(i));
            if (i + 1 < str.length()) {
                pairs.append(str.charAt(i + 1));
            }
        }
        return pairs.toString();
    }

    public String stringYak(String str) {
        StringBuilder yak = new StringBuilder();
        for (int i = 0; i < str.length(); i++){
            if (i + 2 < str.length() && str.charAt(i) == 'y' && str.charAt(i + 2) == 'k') {
                i = i + 2;
            } else {
                yak.append(str.charAt(i));
            }
        }
        return yak.toString();
    }

    public int array667(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 6 && (nums[i + 1] == 6 || nums[i + 1] == 7)) {
                count++;
            }
        }
        return count;
    }

    public boolean noTriples(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            int a = nums[i];
            if (nums[i + 1] == a && nums[i + 2] == a) {
                return false;
            }
        }
        return true;
    }

    public boolean has271(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            int value = nums[i];
            if (nums[i + 1] == (value + 5) && Math.abs(nums[i + 2] - (value - 1)) <= 2) {
                return true;
            }
        }
        return false;
    }

}
