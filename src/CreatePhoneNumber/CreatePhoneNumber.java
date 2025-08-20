package CreatePhoneNumber;

public class CreatePhoneNumber {

    public static void main (String[] args) {

        int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String phoneNumber = createPhoneNumber(numbers);
        System.out.println(phoneNumber);

    }

    public static String createPhoneNumber (int[] numbers) {

        String result = "";
        result += "(";

        for (int i = 0; i < numbers.length; i++) {

            switch (i) {
                case 2:
                    result += numbers[i];
                    result += ")";
                    result += " ";
                    break;
                case 6:
                    result += "-";
                    result += numbers[i];
                    break;
                default:
                    result += numbers[i];
                    break;
            }

        }

        return result;

    }

}
