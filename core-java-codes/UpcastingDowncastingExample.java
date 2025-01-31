final class A {
    public void show() {} // derived types can't override this method.
}

class B extends A {

    public void show() {}

    public void disp() {}

}


public class UpcastingDowncastingExample {
    
    public static void main(String[] args) {
    
        A obj = new B(); // Upcasting - Going towards parent type
        obj.show();

      //  obj.disp(); -> You can't access it usiing base type


        B obj2 = (B) obj; // Downcasting - Going towards to child type
        obj2.disp();  // You can access the properties of child class using child class reference.



        final int data = 10;
        data++; // not allowe
        data = 100; // not allowed

        
    }
}
