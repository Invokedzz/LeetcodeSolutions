package Multiples;

public class Multiples {

    public static void main (String[] args) {

        int number = 10;

        System.out.println(solution(number));

    }

    public static int solution (int number) {

        int total = 0;

        for (int i = 0; i < number; i++) {

            if (i % 3 == 0 || i % 5 == 0) {
                total += i;
            }

        }

        return total;

    }

}
