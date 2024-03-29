import java.util.Scanner;

public class prime_check {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num == 2) {
            System.out.println("Primer Number");
        }

        boolean isTrue = true;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isTrue = false;
            }
        }

        if (isTrue == true) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a prime number");
        }

        sc.close();
    }
}
