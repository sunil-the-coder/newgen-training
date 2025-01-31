public class StringExample {
    
    public static void main(String[] args) {
        
      
        // int a = 10;
        // int b = 20;

       // == -> comparing values stored in variables.

//       boolean result = a == b;


        String s1 = "Sunil"; // ['s','u','n','i','l'] -> 100
        String s2 = "Sunil";  // 100

        if(s1 == s2)
            System.out.println("s1 & s2 are equals");
        else
            System.out.println("s1 & s2 are not equal");

        
        String s3 = new String("Sunil"); // 200

        if(s1 == s3) // 100 == 200
            System.out.println("s1 & s3 are equals");
        else
            System.out.println("s1 & s3 are not equal");

        String s4 = new String("Sunil"); // 300


        if(s3 == s4) // 200 == 300
            System.out.println("s3 & s4 are equals");
        else
            System.out.println("s3 & s4 are not equal");

        //equals() method in java -> It is used for comparing contents of the object

        if(s3.equals(s4))
         System.out.println("s3 & s4 are equals by content");
        else
            System.out.println("s3 & s4 are not equal content");        

    }
}
