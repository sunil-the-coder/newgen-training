public class StringMethodsExample {
    
    public static void main(String[] args) {
        
        //What are the method in String class ? - 

        String s = "SunIl PaTil"; // ['s', 'u', 'n']
        s = s.toUpperCase(); // SUNIL PATIL
        System.out.println("toUpperCase() : " + s);

        s = s.toLowerCase(); // sunil patil 
        System.out.println("toLowerCase() : " + s);

        char ch = s.charAt(6);
        System.out.println("charAt(6) : " + ch);

        int length = s.length(); // total number of characters including any special characters
        System.out.println("length() : " + length); // 11

       // s = "";
        boolean isEmpty = s.isEmpty(); // String s = "";
        System.out.println("isEmpty() : " + isEmpty); 

        boolean result = s.contains("patil"); // sunil patil
        System.out.println("contains(patil) : " + result); 

        int index = s.indexOf("l"); // If string found, return index otherwise return -1 ( left to right search)
        System.out.println("indexOf() : " + index); 

        index = s.lastIndexOf("l"); // right to left search
        System.out.println("lastIndexOf() : " + index); 

        boolean isStartWith = s.startsWith("pat");
        System.out.println("startsWith() : " + isStartWith); 

        boolean isEndWith = s.endsWith("til");
        System.out.println("endsWith() : " + isEndWith); 

        //sunil patil -> sunil ( string -> substring )

        String s1 = s.substring(6);
        System.out.println("substring(beginIndex) : " + s1); 
    
        String s2 = s.substring(6, 9); // beginIndex - Inclusive, endIndex - Exclusive
        System.out.println("substring(beginIndex, endIndex) : " + s2); 

        s2 = s.substring(1, 4); // beginIndex - Inclusive, endIndex - Exclusive
        System.out.println("substring(beginIndex, endIndex) : " + s2); // uni

    }
}
