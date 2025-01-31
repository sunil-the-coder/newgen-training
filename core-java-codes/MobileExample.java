class Mobile {

    private String brand;
    private int price;
    static String name; // shared property between multiple object of the class which belong to class.

    static {
        System.out.println("static block is called.");
        name  = "Smartphone";
    }

    public Mobile(String brand, int price) {
        this.brand = brand;
        this.price = price;         
    }

    public static void show(Mobile mob) {
        System.out.println("static method is called.");

        System.out.println("Brand:" + mob.brand);
    }

    public void display() {
        System.out.println("Mobile [brand=" + brand + ", price=" + price + ", name=" + name + "]");
    }
}

public class MobileExample {
    
    public static void main(String[] args) {

        System.out.println(Mobile.name);
        System.out.println(Mobile.name);
       
    }
}
