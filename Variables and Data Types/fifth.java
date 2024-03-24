import java.util.Scanner;

public class fifth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any name: ");
        String input = sc.nextLine();

        System.out.println("Your entered name is: " + input);

        int num = sc.nextInt();
        System.out.println(num);

        sc.close();

    }
}
