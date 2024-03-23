import java.util.Scanner;

public class product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first num: ");
        double num1 = sc.nextDouble();
        System.out.println("Enter the Second num: ");
        double num2 = sc.nextDouble();

        double mul = num1 * num2;
        System.out.println("Result: " + mul);

        sc.close();
    }
}
