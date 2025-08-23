package PersistentBugger;

public class PersistentBugger {

    public static void main (String[] args) {

        long n = 39;
        int res = persistence(n);

        System.out.println(res);

    }

    private static int persistence (long n) {

        String convertNum = String.valueOf(n);
        int count = 0;

        if (convertNum.length() == 1) {
            return count;
        }

        int result = 1;

        for (int i = 0; i < convertNum.length(); i++) {
            result *= convertNum.charAt(i) - '0';
        }

        count++;

        while (result >= 10) {

            String convertResult = String.valueOf(result);
            result = 1;

            for (int i = 0; i < convertResult.length(); i++) {
                result *= convertResult.charAt(i) - '0';
            }

            count++;

            if (result < 10) {

                return count;

            }

        }

        return count;

    }

}
