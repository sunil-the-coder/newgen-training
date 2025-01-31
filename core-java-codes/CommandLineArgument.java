import java.util.*; // Referring the existing java utility classes

public class CommandLineArgument {

    public static void main(String[] args) {

        //String[] args = {"100", "200", "300"};

        // To print the output of primitive data types array into array format.
        //toString() -> Represent object in String format.

        System.out.println(Arrays.toString(args));

        String n1 = args[0]; // "10"
        String n2 = args[1]; // "20"

        int number1 = Integer.parseInt(n1); // user should provide ;
        int number2 = Integer.parseInt(n2); //user provide provide ;

        int result = number1 + number2; 

        System.out.println("Result:" + result);

    }
}