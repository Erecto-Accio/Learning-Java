import java.util.Scanner;

public class sixth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int firstInt = sc.nextInt();

        System.out.println("Enter the second number: ");
        int secondInt = sc.nextInt();

        int sum = firstInt + secondInt;

        System.out.println("Sum of the two number is: " + sum);

        sc.close();
    }
}
