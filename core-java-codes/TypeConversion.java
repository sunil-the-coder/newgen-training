public class TypeConversion
{
    public static void main(String[] args) {

        byte b = 10;

        //Implicit Casting ( Data conversion )
        short s = b; // (byte to short assignment)
        int a = s; // ( byte to int assignment ) - 4 byte
        double d = 10.5; // ( 8 byte )

        //Explicit Casting ( Explicit Type conversion )
        b = (byte) s; // ( short to byte assignment )
        a = (int) d; 

        System.out.println(a);
        System.out.println(b);
        System.out.println(s);
        System.out.println(d);

        //Type promotion - 

        // byte -> 127
        byte b1 = 100;
        byte b2 = 100;

        int b3 = b1 + b2;


        char c = '9'; 
        System.out.println((int) c);

        //Characters -> code ( ASCII code ) 
        /*
            a - z => 97 to 122
            A - Z => 65 to 90
            0 - 9 => 48 to 57
        */
    }
}