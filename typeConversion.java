import java.util.Scanner;

public class typeConversion {
    public static void main(String[] args) {
        // type conversion { also known as widening conversion }
        // byte - > short - > int -> float -> long -> double

        // Not possbile
        // double -> long -> float -> int -> short -> byte

        int age = 5;
        long b = age;

        // bad thing
        // long x = 5;
        // int z = x; // will throw error because long is 8 byte where int is 4 byte {
        // lossy
        // conversion}

        System.out.println(b);

        Scanner sc = new Scanner(System.in);
        float myNumber = sc.nextInt();
        System.out.println(myNumber);

        sc.close();

    }
}
