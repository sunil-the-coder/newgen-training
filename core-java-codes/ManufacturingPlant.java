
class Engine {
    //instance variable - attributes

    private int number;
    private int rpmSpeed;
    
    public void startEngine() {}

    public void stopEngine() {}
}

// Composition - Reuse the existing functionality

class Tyre {

     //attributes
    private int totalRunning;
    private int life;
    private int maxRunSpeed;
    
    public void move() {

    }

    public void stop() {

    }
}

class Car {

    private String name;
    private String numberPlate;
    private String color;
    private int manfacturingYear;
   
    private Engine engine; // reference variables
    private Tyre tyre;


    public Car(String name, String numberPlate, String color, int manfacturingYear, Engine engine, Tyre tyre) {
        this.name = name;
        this.numberPlate = numberPlate;
        this.color = color;
        this.manfacturingYear = manfacturingYear;
        this.engine = engine;
        this.tyre = tyre;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void drive() {

    }

    public void startCar() {
        engine.startEngine();
        //



    }

    public void stopCar() {

    }

    public void display() {
        System.out.println("Car [name=" + name + ", numberPlate=" + numberPlate + ", color=" + color + ", manfacturingYear="
                + manfacturingYear + ", engine=" + engine + ", tyre=" + tyre + "]");
    }

}


public class ManufacturingPlant {
    
    public static void main(String[] args) {

        Engine engine  = new Engine(); // 
        Tyre tyre = new Tyre(); // 
        
        Car car1 = new Car("BMW", "MH12CJ5434", "RED", 2025, engine, tyre);
        car1.setEngine(engine); // method injection
        car1.display();
    }
}

// Spring -> Constructor Injection
// Spring -> Method Injection

// Constructor, Method and Field
