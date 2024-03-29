import java.util.Scanner;

public class mutliple_of_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter any number: ");
            int num = sc.nextInt();
            if (num % 10 == 0) {
                break;
            }
        } while (true);

        sc.close();
    }
}
