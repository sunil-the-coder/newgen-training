public class RelationalOperator {

    public static void main(String[] args) {

        //Relational - always return true/false
        int age = 45;

        boolean result = age == 45; //true  => 45 == 45
        System.out.println(result);
       

        result = age != 45; // 45 != 45
        System.out.println(result);

        int year = 2025;
        System.out.println(year != 2024);

        int day = 1;
        System.out.println("Is Tuesday ? "+ (day == 2));


        /*
       
        Operator: ==
            firstValue and secondValue are same => true
            firstValue and secondValue are different => false

        Operator: !=
            firstValue and secondValue are same => false
            firstValue and secondValue are different => true   
       
        */

    }

}