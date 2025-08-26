package RegexPin;

import java.util.List;

public class RegexPin {

    public static void main (String[] args) {

        String pin = "a234";
        boolean isAValidPin = validatePin(pin);

        System.out.println(isAValidPin);

    }

    public static boolean validatePin (String pin) {

        List <Integer> numbers = List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);

        if (pin.length() == 4 || pin.length() == 6) {

            for (int i = 0; i < pin.length(); i++) {
                if (!numbers.contains(pin.charAt(i) - '0')) {
                    return false;
                }
            }

            return true;

        }

        return false;

    }

}
