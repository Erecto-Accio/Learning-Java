public class ternaryoperator {
    public static void main(String[] args) {
        int num = 10;

        String type = ((num % 2 == 0) ? "Even" : "Odd");
        System.out.println(type);

        boolean check = num > 50 ? true : false;
        System.out.println(check);
    }
}
