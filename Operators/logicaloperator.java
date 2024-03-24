public class logicaloperator {
    public static void main(String[] args) {
        /*
         * Logical Operator
         * && --> Logical AND
         * || --> Logical OR
         * ! --> Logical Not
         */

        System.out.println((5 > 0) && (4 < 0)); // false
        System.out.println((5 > 0) || (4 < 0)); // true
        System.out.println(!(4 < 0)); // true
    }
}

// AND --> Means both sides condition needs to be true
// OR --> Only one condition needs to be true
// NOT --> Make true condition to false