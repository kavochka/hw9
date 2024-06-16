import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("task 1");
        int[] allSalaries = {10000, 50000, 30000, 40000, 70000};
        int sum = 0;
        for (int i = 0; i < allSalaries.length; i++) {
            sum += allSalaries[i];
        }
        System.out.printf("Сумма трат за месяц составила %s рублей", sum);

        System.out.println("task 2");
        int minSalary = allSalaries[0] / 4;
        int maxSalary = allSalaries[0] / 4;
        for (int i = 0; i < allSalaries.length; i++) {
            if (allSalaries[i] / 4 > maxSalary) {
                maxSalary = allSalaries[i] / 4;
            }
            if (allSalaries[i] / 4 < minSalary) {
                minSalary = allSalaries[i] / 4;
            }
        }
        System.out.printf("Минимальная сумма трат за неделю составила %s рублей. Максимальная сумма трат за неделю составила %s рублей%n", minSalary, maxSalary);

        System.out.println("task 3");
        int sum2 = 0;
        for (int i = 0; i < allSalaries.length; i++) {
            sum2 += allSalaries[i];
        }
        double k = (double) sum2 / allSalaries.length;
        System.out.printf("Средняя сумма трат за месяц составила %s рублей%n", k);

        System.out.println("task 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char temp;
        for (int i = 0; i < reverseFullName.length / 2; i++) {
            temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - 1 - i];
            reverseFullName[reverseFullName.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(reverseFullName));

    }
}