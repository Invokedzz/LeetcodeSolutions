package SumOfNumbers;

public class SumOfNumbers {

    public static void main (String[] args) {

        int a = -1, b = 2;

        int result = getSum(b, a);

        System.out.println(result);

    }

    public static int getSum (int a, int b) {

        if (a == b) {
            return a;
        }

        int [] arr = {b, a};
        int total = 0;
        sort(arr, 0, arr.length-1);

        for (int i = arr[0]; i <= arr[1]; i++) {
            total += i;
        }

        return total;

    }

    public static int partition (int [] arr, int low, int high) {

        int pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {

            if (arr[j] <= pivot) {

                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }

        }

        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i + 1;

    }

    public static void sort (int [] arr, int low, int high) {

        if (low < high) {

            int p = partition(arr, low, high);

            sort(arr, low, p - 1);
            sort(arr, p + 1, high);

        }

    }

}
