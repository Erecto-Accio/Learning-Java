import java.util.Scanner;

public class optimized_prime {
    public static boolean checkPrime(int n) {
        if (n == 2) {
            return true;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
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

        boolean result = checkPrime(num);
        System.out.println("IsPrime: " + result);

        sc.close();
    }
}
