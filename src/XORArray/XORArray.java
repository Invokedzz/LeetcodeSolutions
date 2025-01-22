package XORArray;

import java.util.Arrays;

public class XORArray {

    public static void main (String[] args) {

        int n = 5;

        int start = 0;

        System.out.println(xorOperation(n, start));

    }

    public static int xorOperation(int n, int start) {

        int [] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = start + 2 * i;
        }

        int total = 0;

        for (int j = 0; j < nums.length; j++) {
            total ^= nums[j];
        }

        return total;

    }

}
