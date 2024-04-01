public class function_with_return {
    public static int returnInt() {
        return 50;
    }

    public static float returnFloat() {
        return 50.5f;
    }

    public static double returnDouble() {
        return 50.788;
    }

    public static char returnChar() {
        return 'c';
    }

    public static void main(String[] args) {
        int catch_int = returnInt();
        float catch_float = returnFloat();
        double catch_double = returnDouble();
        char catch_char = returnChar();

        System.out.println("Catching int: " + catch_int);
        System.out.println("Catching float: " + catch_float);
        System.out.println("Catching double: " + catch_double);
        System.out.println("Catching char: " + catch_char);
    }
}
