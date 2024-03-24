import java.util.Scanner;

public class areaofsquare {
    public static void main(String[] args) {
        // Question 2: In a program, input the side of a square. You have to output the
        // area of the
        // square

        Scanner sc = new Scanner(System.in);

        int side = sc.nextInt();
        System.out.println("Area of the square is: " + (side * side));

        sc.close();
    }
}
