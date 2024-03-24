public class assignmentoperators {
    public static void main(String[] args) {
        /*
         * Assignment Operator
         * += --> Short form of ( int a = 5; a = a + 5; simply write a += 5;)
         * -= --> Short form of ( int a = 5; a = a - 5; simply write a -= 5;)
         * *= --> Short form of ( int a = 5; a = a * 5; simply write a *= 5;)
         * /= --> Short form of ( int a = 5; a = a / 5; simply write a /= 5;)
         */

        int a = 10;
        // a = a + 5;
        a += 5;

        int b = 25;
        // b = b - 20;
        b -= 20;

        int c = 5;
        // c = c * 10;
        c *= 10;

        int d = 50;
        // d = d / 5;
        d /= 5;

        System.out.println("A : " + a);
        System.out.println("B : " + b);
        System.out.println("C : " + c);
        System.out.println("D : " + d);

    }
}
