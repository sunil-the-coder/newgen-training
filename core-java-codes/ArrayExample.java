import java.util.Scanner;

class Student {
    private int rollNumber;
    private String name;
    
    public Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }
    
}

public class ArrayExample {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter how many student information you want to be stored ?");
        int noOfStudents = scanner.nextInt();

        //int[] arr = new int[N];
        Student[] sarr = new Student[noOfStudents]; // [ null, null, null, null ,null ]
        
        for(int i = 0; i < noOfStudents; i++) {
            System.out.println("Enter rollNumber and Name for student "+(i+1));
            int rollNumber = scanner.nextInt();
            String name = scanner.next();
            sarr[i] = new Student(rollNumber, name);
        }

        for(int i = 0; i < noOfStudents; i++) {
            System.out.println(sarr[i].getRollNumber() + " - "+ sarr[i].getName());
        }       

        scanner.close();
    }
}


/*
 * 
 *   
 *      Tyre[] tyres =  new Tyre[4];
        tyres[0] = new Tyre();

        Car[] cars = new Car[4];
        car[0] = new Car();

        Laptop[] laptops = new Laptop[4];
        laptops[0] = new Laptop(null, null, null, null);

 */