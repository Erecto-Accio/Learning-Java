import java.util.Scanner;

public class multiplication_by_function {

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();

        int product = multiply(a, b);

        System.out.println("Multiplication: " + product);

        sc.close();
    }
}
