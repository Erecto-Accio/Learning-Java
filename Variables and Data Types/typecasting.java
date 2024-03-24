public class typecasting {
    public static void main(String[] args) {
        // type casting { narrowing conversion -> because it makes data shorter}
        float age = 25.67f;
        int age2 = (int) age;
        System.out.println(age2);

        char c = 'a';
        int num1 = c;
        char c2 = 'b';
        int num2 = c2;

        System.out.println(num1);
        System.out.println(num2);
    }
}
