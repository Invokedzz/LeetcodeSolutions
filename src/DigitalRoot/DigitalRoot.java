package DigitalRoot;

public class DigitalRoot {

    public static void main (String[] args) {

        int value = 132189;
        int result = digital_root(value);

        System.out.println(result);

    }

    public static int digital_root (int n) {

        String convertValueToStr = String.valueOf(n);
        int total = 0;
        for (int i = 0; i < convertValueToStr.length(); i++) {
            int digit = convertValueToStr.charAt(i) - '0';
            total += digit;
        }

        boolean swap = true;

        if (total >= 10) {

            while (swap) {

                String convertTempToStr = String.valueOf(total);
                total = 0;

                for (int i = 0; i < convertTempToStr.length(); i++) {

                    int digit = convertTempToStr.charAt(i) - '0';
                    total += digit;

                }

                if (total < 10) {
                    swap = false;
                }

            }

        }

        return total;

    }

}
