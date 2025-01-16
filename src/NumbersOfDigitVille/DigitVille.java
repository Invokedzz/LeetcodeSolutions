package NumbersOfDigitVille;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DigitVille {

    /*In the town of Digitville, there was a list of numbers called nums containing integers from 0 to n - 1. Each number was supposed to appear exactly once in the list, however, two mischievous numbers sneaked in an additional time, making the list longer than usual.

      As the town detective, your task is to find these two sneaky numbers. Return an array of size two containing the two numbers (in any order), so peace can return to Digitville.

      Example 1:

        Input: nums = [0,1,1,0]

        Output: [0,1]

        Explanation:

        The numbers 0 and 1 each appear twice in the array.*/

    public static void main ( String[] args ) {

        int [] input = {0, 1, 1, 0};

        int [] numbers = getSneakyNumbers(input);

        System.out.println(Arrays.toString(numbers));

    }

    public static int[] getSneakyNumbers(int[] nums) {

        List< Integer > repeatedElementsList = new ArrayList<>();

        for (int index = 0; index < nums.length; index++) {
            for ( int j = index + 1; j < nums.length; j++) {

                if (nums[index] == nums[j]) {

                    repeatedElementsList.add( nums[index] );

                }

            }
        }

        int [] repeatedElements = new int[repeatedElementsList.size()];

        for (int index = 0; index < repeatedElementsList.size(); index++) {

            repeatedElements[index] = repeatedElementsList.get(index);

        }

        return repeatedElements;

    }

}
