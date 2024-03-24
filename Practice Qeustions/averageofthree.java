import java.util.Scanner;

public class averageofthree {
    public static void main(String[] args) {
        // Question 1 : In a program, input 3 numbers : A, B and C. You have to output
        // the average of
        // these 3 numbers.

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int avg = (a + b + c) / 3;
        System.out.println("Average of the number is: " + avg);

        sc.close();
    }
}