public class relationaloperator {
    public static void main(String[] args) {
        /*
         * Relational Operator
         * == -> Equal to
         * != -> Not Equal to
         * < --> Less than
         * > --> Greater than
         * <= --> Less than or equal to
         * >= --> Greater than or equal to
         */

        int a = 5;
        int b = 10;

        System.out.println("From line1: " + (a == b)); // false
        System.out.println("From line2: " + (a != b)); // true
        System.out.println("From line3: " + (a < b)); // true
        System.out.println("From line4: " + (a > b)); // false
        System.out.println("From line5: " + (a <= b)); // true
        System.out.println("From line6: " + (a >= b)); // false
    }
}
