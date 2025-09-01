package PlayingWithDigits;

public class PlayingWithDigits {

    public static void main (String[] args) {

        int n = 46288, p = 3;

        System.out.println(digPow(n, p));

    }

    public static long digPow (int n, int p) {

        String convertInt = String.valueOf(n);
        long total = 0;

        for (int i = 0; i < convertInt.length(); i++) {

            long digit = (long) Math.pow(Double.parseDouble(String.valueOf(convertInt.charAt(i))), p);
            System.out.println(digit);
            total += digit;
            p++;

        }

        long k;

        if (total % n == 0) {

            k = total / n;
            return k;

        }

        k = -1;
        return k;

    }

}
