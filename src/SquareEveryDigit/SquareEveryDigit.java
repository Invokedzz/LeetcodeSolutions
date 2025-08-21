package SquareEveryDigit;

public class SquareEveryDigit {

    public static void main (String[] args) {

        int value = 9119;
        int result = squareDigits(value);

        System.out.println(result);

    }

    public static int squareDigits (int n) {

        String convertIntToStr = String.valueOf(n);
        String total = "";

        for (int i = 0; i < convertIntToStr.length(); i++) {
            int num = convertIntToStr.charAt(i) - '0';
            int mult = num * num;
            total += mult;
        }

        return Integer.parseInt(total);

    }

}
