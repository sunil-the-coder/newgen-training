
class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int substract(int a, int b) {
        return a - b;
    }
 
}

class AdvanceCalculator extends Calculator {
   
    public int mult(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }
}

class ScientificCalculator extends AdvanceCalculator {

    // more powerful feature for scientific computing
    public double power(int a, int b) {        
        return Math.pow(a, b);
    }

    public double sin(double a) {        
        return Math.sin(a);
    }

    public double cos(double a) {        
        return Math.cos(a);
    }

}

public class CalcTest {

    public static void main(String[] args) {

        //10$ -> 1000
        Calculator obj = new Calculator();
        int r1 = obj.add(10, 20);
        System.out.println("Add result:"+r1);
        
        int r2 = obj.substract(200, 100);
        System.out.println("Substract result:"+r2);


        //20$ = 2000
        AdvanceCalculator advanceCalculator = new AdvanceCalculator();

        int addResult = advanceCalculator.add(500,200);
        System.out.println(addResult);

        int r3 = advanceCalculator.mult(200, 100);
        System.out.println("Multiplication result:"+r3);

        int r4 = advanceCalculator.div(200, 100);
        System.out.println("Division result:"+r4);


        //50$ = 5000 ( req - sin, cos, power etc. )
        ScientificCalculator scientificCalculator = new ScientificCalculator();

        int multResult = scientificCalculator.mult(10,20);
        System.out.println(multResult);
        
        double r5 = scientificCalculator.power(20, 2);
        System.out.println("Power result:"+r5);

        double r6 = scientificCalculator.sin(200.5);
        System.out.println("Sin() result:"+r6);

        double r7 = scientificCalculator.cos(200.5);
        System.out.println("Cos() result:"+r7);

    }
}


/**
 * Inheritance -> Reusing the functionality of base classes into child classes.
 */