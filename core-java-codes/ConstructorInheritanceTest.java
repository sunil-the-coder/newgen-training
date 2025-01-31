
class A {
    public A() {
        super();
        System.out.println("A class constructor called.");
    }
    public A(int a) {
        super();
        System.out.println("A class int param constructor called.");
    }
}

class B extends A {
    public B() {
        super();
        System.out.println("B class constructor called.");
    }
    public B(int a) {
        super(10);
        System.out.println("B class int param constructor called.");
    }
}

class C extends B {
    public C() {        
        this(10);
        System.out.println("C class constructor called.");
    }
    public C(int a) {
        super(a); // call to superclass param constructor
        System.out.println("C class int param constructor called.");
    }
}


public class ConstructorInheritanceTest {
    
    public static void main(String[] args) {
        
       // A obj = new A(10);
        C obj = new C();

    }
}
