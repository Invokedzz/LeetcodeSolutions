package BitCounting;

public class BitCounting {

    public static void main (String[] args) {

        int val = 10;
        int result = countBits(val);

        System.out.println(result);

    }

    public static int countBits (int n) {

        String binary = Integer.toBinaryString(n);
        int count = 0;

        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) - '0' == 1) {
                count++;
            }
        }

        return count;

    }

}
