import java.util.Scanner;

public class factorial_with_function {
    public static int factorial(int a) {
        int fact = 1;
        for (int i = 1; i <= a; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = sc.nextInt();

        int result = factorial(num);

        System.out.println("Factorial of " + num + " is: " + result);

        sc.close();
    }
}
