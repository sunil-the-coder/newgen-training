public class LogicalOperator
{
    public static void main(String[] args) {

        //Covid -> FluShot
        // age > 18 and age < 60

        //Movie -> A+ rated ( min age 3 years )
        //age > 3 || 

        //Whenerver you want multiple condition checks use logical operators.

        //AND - &&
        //OR - ||

        int age = 17;
        boolean result = age > 18 && age < 60;
        System.out.println(result);

        result = age > 15 || age < 60; // smart check => Short Circuit Evaluation.
        System.out.println(result);

        /*
            Truth table - &&
                true true -> true
                true false -> false
                false true -> false
                false false -> false

                If first condition is true then only it executes 2nd case.

            Truth table - ||
                true true -> true
                true false -> true
                false true -> true
                false false -> false

                If first condition is false then only it executes 2nd case.
        */

       boolean res = false;
       boolean notResult = ! (age > 10 && age < 50);

       // Single & and Single |

       int a = 10; // binary number -> 1010
       int b = 25; // -> 101011

       int c = a & b;

       System.out.println(c);

    }
}