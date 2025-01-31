//Structure -> properties & behaviours

class Car {

    //Properties -> instance variables
    String carName;
    int yearOfManufacturing;
    String color;
    String tyreManufacturer;
    String engine; // 

    // //default constructor - To initialize the initial object state.
    // Car() {
    //     carName = "BMW";
    //     color = "WHITE";
    //     yearOfManufacturing = 2025;
    //     tyreManufacturer = "Bridgestone";

    //     System.out.println("default constructor");
    // }  

    // parameterized constructor - To initialize the object state based on given user input 
    // which is mandatory for my object creation.
    Car(String newColor, String e) {
        color = newColor;
        engine = e;
        System.out.println("In parameterized constructor");
    }

    void setTypeManufacturer(String m) {
        tyreManufacturer = m;
    }


    //Behaviours -> functions/methods - instance methods
    void startEngine() {
        System.out.println("Engine started...");
    }

    void stopEngine() {
        System.out.println("Engine stopped...");
    }

    void drive() {
        System.out.println("Car driving...");
    }

    void playMusic() {
        System.out.println("Music playing...");
    }

    void display() {
     
        //Print all car information on console.

        System.out.println("Car Name:"+ carName);
        System.out.println("Year of Manufacturing:"+ yearOfManufacturing);
        System.out.println("Color:"+ color);
    }
}

public class CarExample {

    public static void main(String[] args) {

        Car car4 = new Car("RED", "FASTER ENGINE");  // mandatory -> constructor injection
        car4.setTypeManufacturer("Apollo"); // optional -> method injection
        System.out.println(car4.color); 
        System.out.println(car4.tyreManufacturer); 
        System.out.println(car4.engine); 

    }
}