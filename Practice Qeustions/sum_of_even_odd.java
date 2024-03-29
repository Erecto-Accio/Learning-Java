import java.util.Scanner;

public class sum_of_even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int choice = 0;
        int evenSum = 0;
        int oddSum = 0;

        do {
            System.out.println("Enter the number: ");
            num = sc.nextInt();

            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }

            System.out.println("Do you want to start again ?");
            System.out.println("Press 1 for continue");
            System.out.println("Press 0 for break");

            choice = sc.nextInt();
        } while (choice != 0);

        System.out.println("Sum of the even numbers: " + evenSum);
        System.out.println("Sum of the odd numbers: " + oddSum);

        sc.close();
    }
}
