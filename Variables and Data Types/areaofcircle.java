import java.util.Scanner;

public class areaofcircle {
    public static void main(String[] args) {

        float PI = 3.14f;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius: ");
        float radius = sc.nextFloat();

        System.out.println("Area of the circle: " + PI * radius * radius);
        sc.close();
    }
}
