import java.util.Scanner;

public class sum_of_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the range you want sum: ");
        int num = sc.nextInt();
        int i = 1;

        // sum variable { initialize with 0 }
        int s = 0;

        // condition and loop to add one by one
        while (i <= num) {
            s += i;
            i++;
        }

        System.out.println("Sum is : " + s);

        sc.close();
    }
}
