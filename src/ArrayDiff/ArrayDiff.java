package ArrayDiff;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayDiff {

    public static void main (String[] args) {

        int [] a = {1, 2, 2, 2, 3};
        int [] b = {2};

        int [] result = arrayDiff(a, b);

        System.out.println(Arrays.toString(result));

    }

    public static int[] arrayDiff (int[] a, int[] b) {

        List <Integer> integerList = new ArrayList<>();
        for (int elementsOfA : a) {
            integerList.add(elementsOfA);
        }

        for (int elementsOfB : b) {

            if (integerList.contains(elementsOfB)) {
                integerList.removeAll(Collections.singleton(elementsOfB));
            }

        }

        int [] result = new int[integerList.size()];
        for (int i = 0; i < integerList.size(); i++) {
            result[i] = integerList.get(i);
        }

        return result;

    }

}
