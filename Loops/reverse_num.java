import java.util.Scanner;

public class reverse_num {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        while (num > 0) {
            int last_digit = num % 10;
            num = num / 10;
            System.out.print(last_digit);
        }

        sc.close();

    }
}
