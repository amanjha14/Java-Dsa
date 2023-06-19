import java.util.Arrays;

public class AverageSalary {
    public static void main(String[] args) {
        int[] arr = {1000,2000,3000};
        double sol = Salary(arr);
        System.out.println(sol);
    }

    static double Salary(int[] salary) {
        Arrays.sort(salary);
        int sum = salary[0] + salary[salary.length - 1];
        double average = (double) sum / 2;
        return average;
    }
}

