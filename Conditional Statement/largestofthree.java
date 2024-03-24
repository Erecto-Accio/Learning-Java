import java.util.Scanner;

public class largestofthree {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int first = sc.nextInt();

        System.out.println("Enter the second number: ");
        int second = sc.nextInt();

        System.out.println("Enter the third number: ");
        int third = sc.nextInt();

        // conditions

        if (first > second && first > third) {
            System.out.println(first + " is bigger.");
        } else if (second > first && second > third) {
            System.out.println(second + " is bigger.");
        } else {
            System.out.println(third + " is bigger.");
        }

        sc.close();
    }
}
