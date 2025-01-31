//import java.lang.String;

public class StringImmutabilityExample {
    
    public static void main(String[] args) {
        
        //Immutable - Can't modify original string - Every modification, results into new string
        String s = "sunil";
        
        s.toUpperCase();
        System.out.println(s);


        //Mutable class - We can modify original string
        StringBuffer sb = new StringBuffer("sunil"); // enup litap linus
        sb.append(" patil");
        sb.append(" pune");
        sb.deleteCharAt(3);
        sb.insert(3, 'A');

        sb.reverse();

        //StringBuilder -> String

        String str = sb.toString();

        System.out.println(sb);
        System.out.println(str);

    }
}
