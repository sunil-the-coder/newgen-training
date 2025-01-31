class A {
    public void show(int a) {
        System.out.println("A show() method");      
    }
}

class B extends A {
   
    //Method Overriding
    public void show(int a) {
        System.out.println("B show() method");      
    }
   
}

class C extends B {
   
    //Method Overriding
    public void show(int a) {
        System.out.println("C show() method");      
    }
   
}



class Student {
   
    private String name;
    private String phone;

    public Student(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", phone=" + phone + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((phone == null) ? 0 : phone.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
       
        Student other = (Student) obj;
        if (phone == null) {
            if (other.phone != null)
                return false;
        } else if (!phone.equals(other.phone))
            return false;
        return true;
    }

}


public class MethodOverriding {
    
    public static void main(String[] args) {
        
       Student obj1 = new Student("Akshay", "278592896"); // 1000
       Student obj2 = new Student("Rutuja", "278592896"); // 2000

       System.out.println(obj2.toString());


       if(obj1.equals(obj2))
            System.out.println("Same object");
        else
            System.out.println("Not same object");




        //Type casting 

        double d = 10.56;
        int a = 15;

        //d =  a; // 8 -> 4 - implicit type casting
        a = (int) d; // 4 -> 8 -> explicit type casting

        System.out.println(a);
        System.out.println(d);

        // Inheritance => Upcasting & Downcasting

        

    }
}

