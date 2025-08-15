package ChangeSign;

public class ChangeSign {

    public static void main (String[] args) {

        int [] arr = {1, -3, -4, 0, 5};

        System.out.println(signChange(arr));

    }

    public static int signChange (int[] arr) {

        int count = 0;

        if (arr.length == 0 || arr.length == 1) {
            return 0;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] >= 0 && arr[i + 1] < 0) {
                count++;
            } else if (arr[i] < 0 && arr[i + 1] >= 0) {
                count++;
            }
        }

        return count;

    }

}
