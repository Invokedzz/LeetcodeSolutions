package NeighboringBitwiseXOR;

public class NeighboringBitwise {

    public static void main ( String[] args ) {

        int [] derived = new int []{1,0};

        System.out.println(doesValidArrayExist(derived));

    }

    public static boolean doesValidArrayExist(int[] derived) {

        int[] original = new int[derived.length];

        original[0] = 0;

        for (int index = 1; index < derived.length; index++) {
            original[index] = derived[index-1] ^ original[index-1];
        }

        if ((derived[derived.length - 1] ^ original[derived.length - 1]) == original[0]) return true;

        return false;

    }

}
