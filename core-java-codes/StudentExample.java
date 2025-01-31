import java.util.Scanner;

class Student {

    //instance variable
    private String name; 
    private int age; 
    
    Student(String n, int a) { // formal parameters
        System.out.println("param constructor called");
        name = n;
        age = a;       
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) { // a = 25
        
        if( age > 0 && age < 100)
            this.age = age; // name collision - name hiding
        else 
            System.out.println("Invalid Age");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class StudentExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name and age:");
        String name = scanner.nextLine();
        int age  = scanner.nextInt();
    
        Student s1 = new Student(name, age); 
        System.out.println(s1.getName() +" - "+ s1.getAge());

        scanner.close();
        
    }
}
