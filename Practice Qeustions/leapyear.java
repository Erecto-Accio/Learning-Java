import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        // Question 5 : Write a Java program that takes a year from the user and print
        // whether that
        // year is a leap year or not

        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();
        if (year % 4 == 0 && (year % 400 == 0 || year % 100 != 0)) {
            System.out.println("LeapYear");
        } else {
            System.out.println("Not LeapYear");
        }

        sc.close();
    }
}
