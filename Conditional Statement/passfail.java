import java.util.Scanner;

public class passfail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the mark you have obtained: ");
        int marks = sc.nextInt();
        if (marks < 33) {
            System.out.println("You have failed the exam.");
        } else {
            System.out.println("You have passed the exam.");
        }

        sc.close();
    }
}
