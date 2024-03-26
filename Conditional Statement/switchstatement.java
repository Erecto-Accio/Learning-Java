import java.util.Scanner;

public class switchstatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the menu no (1-3): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You have selected the friend rice platter");
                break;
            case 2:
                System.out.println("You have selected the pizza platter");
                break;
            case 3:
                System.out.println("You have selected the student platter");
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }

        sc.close();

    }
}
