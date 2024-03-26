import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        // Caclulator program
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int fn = sc.nextInt();

        System.out.println("Enter the second number: ");
        int sn = sc.nextInt();

        System.out.println("Enter the operator: ");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println("Addition is: " + (fn + sn));
                break;
            case '-':
                System.out.println("Subtraction is: " + (fn - sn));
                break;
            case '*':
                System.out.println("Multiplication is: " + (fn * sn));
                break;
            case '/':
                System.out.println("Division is: " + (fn / sn));
                break;
            case '%':
                System.out.println("Modulo is: " + (fn % sn));
                break;

            default:
                System.out.println("My caclulator can only work with (+ - * / %) operator ");
                break;
        }

        sc.close();
    }
}
