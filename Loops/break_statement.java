public class break_statement {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                break;
            }

            System.out.println(i);
        }

        System.out.println("Hello");
    }
}
