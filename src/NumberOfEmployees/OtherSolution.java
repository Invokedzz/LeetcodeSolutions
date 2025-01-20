package NumberOfEmployees;

public class OtherSolution {

    public static void main (String[] args) {
        int [] hours = {0,1,2,3,4};
        int target = 2;
        System.out.println(numberOfEmployeesWhoMetTarget(hours, target));
    }

    public static int numberOfEmployeesWhoMetTarget (int[] hours, int target) {
        // this solution is way easier, trust

        int sum = 0;

        for (int hour : hours) {
            if (hour >= target) sum++;
        }

        return sum;

    }

}
