public class unaryoperator {
    public static void main(String[] args) {
        // ++ -> increment { pre, post }
        // -- -> decrement { pre, post }

        System.out.println("Pre Increment: ");

        // pre increment
        int a = 5;
        int b = ++a;
        System.out.println(a);
        System.out.println(b);

        System.out.println("Post Increment: ");

        // Post increment
        int c = 6;
        int d = c++;
        System.out.println(c);
        System.out.println(d);

        System.out.println("");
        System.out.println("");

        System.out.println("Pre Decrement: ");

        // pre decrement ( -- )
        int z = 10;
        int y = --z;
        System.out.println(z);
        System.out.println(y);

        System.out.println("Post Decrement: ");

        // post decrement ( -- )
        int a1 = 11;
        int b2 = a1--;
        System.out.println(a1);
        System.out.println(b2);
    }
}

// Explanation:
/*
 * pre increment -> Value update first , then do other work
 * post increment -> Do the other work first , then increment
 * 
 * Let's look at the example below
 * int a = 5;
 * int b = ++a;
 * Now what's the code doing firstly we assigning 5 to a then to b we pre
 * incremented a and lastly we assigned it to b
 * 
 * 
 * Let's look at the example below
 * int a = 5;
 * int b = a++;
 * Now what's the code doing firstly we assigning 5 to a then to b we post
 * incremented the value it will increase the value for a but updated value will
 * not assign into b
 * 
 * 
 * Same Example Will implement for ( -- );
 */