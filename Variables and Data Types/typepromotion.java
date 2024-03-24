public class typepromotion {
    public static void main(String[] args) {
        char a = 'a';
        char b = 'b';

        int s = b - a;
        // System.out.println(s);

        short aa = 25;
        byte bb = 5;
        char c = 'c';
        byte d = (byte) (aa + bb + c);

        System.out.println(d);

        int num1 = 10;
        float num2 = 10.51f;
        long num3 = 367;
        double num4 = 56.8901;

        double num_sum = num1 + num2 + num3 + num4;
        System.out.println(num_sum);

        // a simple example of byte
        byte a_num = 5;
        byte b_num = (byte) (a_num * 2); // here if we don't cast it ,firstly it will convert the number into int then
                                         // do
        // the operation that's why int is not storeable to byte that's why we have to
        // use typecasting on that a_num
        System.out.println(b_num);

    }
}

// Java automatically promotes each byte,short or char operand to int when
// evaluating an expression.
// If one operanf is long,float or double the whole expression is promoted to
// long,float or double respectively