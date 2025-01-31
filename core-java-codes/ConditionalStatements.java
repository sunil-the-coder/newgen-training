class ConditionalStatements {

    public static void main(String[] args) {

        // conditional decisions -> conditional statements
        System.out.println("Entry Main");


        //Ternary Operator - expresssion/condition ?  true  : false

        int age = 15;

        // String result = "";

        // if(age < 18)
        //     result = "Hi";
        // else 
        //     result = "Bye";

        // System.out.println(result);


        String result = age < 18 ? "Hi" : "Bye";
        System.out.println(result);

   
    }
}