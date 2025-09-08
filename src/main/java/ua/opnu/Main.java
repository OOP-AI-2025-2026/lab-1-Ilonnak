package ua.opnu;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    // ======== Logical operations ========

    /**
     * Given two temperatures, return true if one is less than 0 and the other is greater than 100.
     */
    public boolean icyHot(int temp1, int temp2) {
        return (temp1 < 0 && temp2 > 100) || (temp2 < 0 && temp1 > 100);
    }

    /**
     * Given 2 int values, return true if either of them is in the range 10..20 inclusive.
     */
    public boolean in1020(int a, int b) {
        return (a >= 10 && a <= 20) || (b >= 10 && b <= 20);
    }

    /**
     * "Teen" = 13..19 inclusive. Return true if any of a, b, c is teen.
     */
    public boolean hasTeen(int a, int b, int c) {
        return isTeen(a) || isTeen(b) || isTeen(c);
    }

    private boolean isTeen(int x) {
        return x >= 13 && x <= 19;
    }

    // ======== Boolean expressions ========

    /**
     * We sleep in if it is not a weekday or we're on vacation.
     */
    public boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

    /**
     * Trouble if both smiling or neither smiling.
     */
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return (aSmile && bSmile) || (!aSmile && !bSmile);
    }

    /**
     * If negative==true -> true only if both negative.
     * Else -> true if one negative and one positive.
     */
    public boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            return a < 0 && b < 0;
        } else {
            return (a < 0 && b > 0) || (a > 0 && b < 0);
        }
    }

    // ======== Loops and Arrays ========

    /**
     * Count number of 9's in the array.
     */
    public int arrayCount9(int[] nums) {
        int count = 0;
        for (int n : nums) {
            if (n == 9) count++;
        }
        return count;
    }

    /**
     * Check first up to 4 elements for a 9.
     */
    public boolean arrayFront9(int[] nums) {
        int limit = Math.min(4, nums.length);
        for (int i = 0; i < limit; i++) {
            if (nums[i] == 9) return true;
        }
        return false;
    }

    /**
     * Return true if 1,2,3 appears consecutively somewhere.
     */
    public boolean array123(int[] nums) {
        for (int i = 0; i <= nums.length - 3; i++) {
            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
                return true;
            }
        }
        return false;
    }

    // ======== Strings ========

    /**
     * Return "Hello <name>!".
     */
    public String helloName(String name) {
        return "Hello " + name + "!";
    }

    /**
     * Swap the last two chars if present.
     */
    public String lastTwo(String str) {
        int n = str.length();
        if (n < 2) return str;
        return str.substring(0, n - 2) + str.charAt(n - 1) + str.charAt(n - 2);
    }

    /**
     * Return the middle two chars of an even-length string (length >= 2).
     */
    public String middleTwo(String str) {
        int n = str.length();
        int mid = n / 2;
        return str.substring(mid - 1, mid + 1);
    }
}
