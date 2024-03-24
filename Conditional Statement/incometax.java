import java.util.Scanner;

public class incometax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int income = sc.nextInt();
        int tax = 0;

        if (income < 25000) {
            tax = 0;
        }

        else if (income >= 25000 && income <= 100000) {
            tax = (int) (income * 0.2);
        }

        else {
            tax = (int) (income * 0.3);
        }

        System.out.println("Your tax is: " + tax);
    }
}
