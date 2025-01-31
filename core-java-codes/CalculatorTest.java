class Calculator {

    public Calculator() {
        System.out.println("default constructor");
    }

    public Calculator(int n1) {
        System.out.println("one int argument constructor: "+n1);
    }

    public Calculator(float n1) {
        System.out.println("one float argument constructor: "+n1);
    }

    public Calculator(int n1, int n2) {
        System.out.println("two int argument default constructor: "+ n1 + " - "+ n2);
    }

    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    public double add(double d1, double d2) {
        return d1 + d2;
    }

    public float add(float d1, float d2) {
        return d1 + d2;
    }

    public int substract(int n1, int n2) {
        return n1 - n2;
    }

}

class CalculatorTest {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int result = calculator.add(10, 20);
        System.out.println("Result of 2 integers:"+result);

        result = calculator.add(10, 20, 30);
        System.out.println("Result of 3 integers:"+result);

        double dResult = calculator.add(100.55, 20.25);
        System.out.println("Result:"+dResult);

        float fResult = calculator.add(50.51f, 20.25f);
        System.out.println("Result:"+fResult);

        new Calculator(10);
        new Calculator(10.5f);
        new Calculator(10, 20);


    }
}
