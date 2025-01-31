public class ArithmeticSingleHandOperator {

    public static void main(String[] args) {

        //single hand operators

        int a = 10;
        a++;  // a = a + 1; ( post increment )
        System.out.println(a);

        a--;  // a = a - 1; ( post decrement )
        System.out.println(a);

        ++a;  // a = a + 1; ( pre increment )
        System.out.println(a);

        --a;  // a = a - 1; ( pre decrement )
        System.out.println(a);

        //post -> First assign the value & then increment/decrement
        //pre -> First increment/decrement & then assign the value.

        System.out.println("-------------------------");

        // int b = 10;
        // int res = ++b; //( res = 11, b = 11 )
        // System.out.println(res); // 11
        // System.out.println(b); // 11

        int b = 10;
        int res = b-- + --b;
        System.out.println(res); // 21, 22
        System.out.println(b); // 11, 12

        //Negate -> Reverse the existing value - boolean expression.
            // Use before the variable name only.

        boolean bl = false;
        System.out.println(!bl);
        

    }
}