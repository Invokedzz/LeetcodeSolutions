package LostWithoutAMap;

import java.util.Arrays;

public class LostWithoutAMap {

    public static void main (String[] args) {

        int [] arr = {1, 2, 2, 4};
        int [] response = map(arr);

        System.out.println(Arrays.toString(response));

    }

    private static int[] map (int[] arr) {

        int [] doubled = new int[arr.length];
        for (int i = 0; i < doubled.length; i++) {
            doubled[i] = arr[i] * 2;
        }

        return doubled;

    }

}
