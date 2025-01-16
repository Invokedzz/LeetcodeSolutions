package BitwiseOfAllPairings;

public class BitwiseOfAllPairings {

    /*You are given two 0-indexed arrays, nums1 and nums2, consisting of non-negative integers. There exists another array, nums3, which contains the bitwise XOR of all pairings of integers between nums1 and nums2 (every integer in nums1 is paired with every integer in nums2 exactly once).

     Return the bitwise XOR of all integers in nums3.

     Example 1:

     Input: nums1 = [2,1,3], nums2 = [10,2,5,0]
     Output: 13
     Explanation:
     A possible nums3 array is [8,0,7,2,11,3,4,1,9,1,6,3].
     The bitwise XOR of all these numbers is 13, so we return 13*/

    public static void main ( String[] args ) {

        int [] nums1 = {2, 1, 3};

        int [] nums2 = {10, 2, 5, 0};

        int result = xorAllNums(nums1, nums2);

        int result2 = xorAllNums2(nums1, nums2);

        System.out.println( result );

        System.out.println( result2 );

    }

    public static int xorAllNums(int[] nums1, int[] nums2) {

        // most optimal solution; this problem is so freaking hard
        // it's kinda easy to find the answer, but you need to create a good algorithm;
        // otherwise, your MBs are going to EXPLODE

        // anyway, I'm going to post here several approaches to this problem
        // REMEMBER: most of them are not optimal!

        int ans = 0;

        int len1 = nums1.length;

        int len2 = nums2.length;

        if ( len2 % 2 != 0 ) {

            for ( int num1: nums1 ) {

                ans = ans ^ num1;

            }

        }

        if ( len1 % 2 != 0 ) {

            for ( int num2: nums2 ){

                ans = ans ^ num2;
            }

        }

        return ans;

    }

    private static int xorAllNums2 (int[] nums1, int[]nums2) {

        // X.length == Y.length return 0;
        // odd -> do the operation

        int [] nums3 = new int[nums1.length * nums2.length];

        int receiveValues = 0;

        if ( nums1.length == nums2.length ) return receiveValues;

        for ( int index = 0; index < nums1.length; index++ ) {

            for ( int j = 0; j < nums2.length; j++ ) {

                nums3[index] ^= nums1[index] ^ nums2[j];

                receiveValues = nums3[index];

            }

        }

        return receiveValues;

    }

}
