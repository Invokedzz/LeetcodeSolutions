package CustomerWealth;

public class CustomerWealth {

    public static void main (String[] args) {

        int[][] accounts = {{1, 2, 3}, {3, 2, 1}};

        System.out.println(maximumWealth(accounts));

    }

    public static int maximumWealth(int[][] accounts) {

        int maxSum = 0;

        for (int[] account : accounts) {

            int currentSum = 0;

            for (int i : account) {

                currentSum += i;

            }

            if (currentSum > maxSum) maxSum = currentSum;

        }

        return maxSum;

    }

}
