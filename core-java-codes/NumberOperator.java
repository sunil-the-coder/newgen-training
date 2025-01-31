class NumberOperator {
    
    
    public static void main(String[] args) {

        //Array - set of similar data types - Grouping of similar type

        int[] arr = {10,20,30,40,50,60,70};
        float[] farr = {10.5f, 5.6f, 6.8f};
        String s1 = "Neha";
        String s2 = "Mayur";
        String s3 = "Sunil";

        String[] sarr = { "Neha",  "Mayur", "Sunil" };

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        //Index -> identifier to locate number in array

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);

        System.out.println(farr[2]); // 5.6f, 6.8f

        System.out.println(sarr[1]);
        System.out.println(sarr[2]);


        //Sequential -> 10 -> 20 -> 30 -> 40

        String s = "10";
        s = s + 50;  // concatination -> 1050
        System.out.println(s); // 20 -> 1050


    // "10" -> 10 ( int ) 
    // String  -> int ( conversion ) - parsing

        //int, float, double => Primitive ( )
        //Integer, Float, Double => Wrapper data types 

        String data = "10";

        int idata = Integer.parseInt("10"); // static method - String to integer
        float fdata = Float.parseFloat("30.55f"); // String to float
        double ddata = Double.parseDouble("33.56"); // String to double 
        
        System.out.println( idata);
        System.out.println(fdata);
        System.out.println("Converted double data:" + ddata);


        String firstName = "Sunil";
        String lastName = "Patil";

        String fullName = firstName + lastName;
        System.out.println(fullName);
        

        int a  = 10;
        a = a + 10;
        System.out.println(a); // 20

        
       
    }
}

