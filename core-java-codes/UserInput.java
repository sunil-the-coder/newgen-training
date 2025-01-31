import java.util.Scanner;

public class UserInput {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        //static array allocation
        //int[] arr = {};

        // dynamic array allocation 
        //1. Declaratation of array with no of elements
        //2. Dynamically add values into array.

        System.out.println("How many elements you want to store ?");
        int N = scanner.nextInt();

        int[] arr = new int[N]; // Just allocate memory with default value of data type.
    
        //Loop to iterate over array, take a input from user and modify the array value
        for(int i = 0; i < N; i++) {
            System.out.println("Enter number:");
            int data = scanner.nextInt();
            arr[i] = data;    // arr[0] = 10, arr[1] = 200, arr[2] = 300        
        }

        //Loop to iterate over array to read the array value.
        for(int i = 0; i < N; i++) {
            System.out.print(arr[i] +" ");
        }

        System.out.println();

        scanner.close();

      
    }
}
