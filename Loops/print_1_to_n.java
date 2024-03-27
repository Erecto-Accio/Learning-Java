import java.util.Scanner;

public class print_1_to_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the range: ");
        int num = sc.nextInt();
        int counter = 1;

        while (counter <= num) {
            System.out.println(counter);
            counter++;
        }

        sc.close();
    }
}
