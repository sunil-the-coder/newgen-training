//Calculator -> structure of your real calculator
class Calculator {

    //1. Properties
    
    //2. Behaviour - functions/method
    int add(int number1, int number2) { // number1 & number2 -> method/function arguments -> formal parameters
        System.out.println("in add function");
        int res = number1 + number2;
        return res;
    }

    int substract(int number1, int number2) {
        System.out.println("in substract function");
        int res = number1 - number2;
        return res;
    }
}


class ClassExample {

    public static void main(String[] args) {

        //Build real time calculator - Object
        System.out.println("In main");

        Calculator calc = new Calculator(); // this will create object in memory ( calc -> reference variable )
        int result = calc.add(20, 40); // make a function call / invoke the behaviour - actual parameters
        System.out.println(result);

        result = calc.add(100, 200); // make a function call / invoke the behaviour
        System.out.println(result);

        result = calc.add(500, 500); // make a function call / invoke the behaviour
        System.out.println(result);

        result = calc.substract(50, 30);
        System.out.println(result);

        System.out.println("Main Exit");
    }
}