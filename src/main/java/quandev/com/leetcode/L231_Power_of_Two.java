package quandev.com.leetcode;

import java.util.Arrays;

public class L231_Power_of_Two {

    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }

        if (n % 2 != 0) {
            return false;
        }
        n = n / 2;
        return isPowerOfTwo(n);
    }

    public static void main(String[] args) {
        int[] temp = {8, 2, 4, 6, 7, 22, 5};
        Arrays.stream(temp).forEach(i -> System.out.println(isPowerOfTwo(i)));
    }


}
