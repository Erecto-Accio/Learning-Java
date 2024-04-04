import java.util.Scanner;

public class prime_using_function {
    public static boolean check_prime(int n) {

        if (n == 2) {
            return true;
        }

        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        boolean result = check_prime(num);
        System.out.println(result);

        sc.close();

    }
}
