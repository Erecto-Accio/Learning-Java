public class binary_to_decimal {
    public static int decimal(int a) {
        int pow = 0;
        int dec = 0;
        while (a > 0) {
            int ld = a % 10;
            dec = dec + (ld * (int) Math.pow(2, pow));
            pow++;
            a = a / 10;
        }

        return dec;
    }

    public static void main(String[] args) {
        int res = decimal(101);
        System.out.println(res);
    }
}
