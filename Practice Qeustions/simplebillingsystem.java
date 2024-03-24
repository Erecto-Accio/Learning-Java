/*
 * Question 3: Enter cost of 3 items from the user (using float data type) - a pencil, a pen and
an eraser. You have to output the total cost of the items back to the user as their bill.
(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem
 */

import java.util.Scanner;

public class simplebillingsystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the price of pencil: ");
        float pencil = sc.nextFloat();

        System.out.println("Enter the price of pen: ");
        float pen = sc.nextFloat();

        System.out.println("Enter the price of eraser: ");
        float eraser = sc.nextFloat();

        float totalBill = pencil + pen + eraser;
        System.out.println("Total cost: " + totalBill);

        System.out.print("After adding 18% of gst tax your total bill is: ");

        // formula
        /*
         * First, convert tax percentage to a decimal
         * 
         * tax rate = 18% / 100 = 0.18
         * 
         * Then use the formula to calculate the total:
         * 
         * total = price + (price x tax rate)
         * 
         */

        float percentage = 0.18f;
        float price = totalBill + (totalBill * percentage);
        System.out.print(price);

        sc.close();
    }
}
