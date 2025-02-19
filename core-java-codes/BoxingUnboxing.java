public class BoxingUnboxing {
    
    public static void main(String[] args) {
        
        // int -> Integer
        // double -> Double
        // float -> Float
        // char -> Character
        // short -> Short
        //boolean -> Boolean


        int a = 10;
        Integer i = Integer.valueOf(10);

        i = a; // boxing - primitive to wrapper

        a = i; // unboxing - wrapper to primtive

        System.out.println(i);
        System.out.println(a);

    }
}
