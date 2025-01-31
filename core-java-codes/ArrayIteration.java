public class ArrayIteration {
    
    public static void main(String[] args) {
        
        int[] arr = {10,20,30,40,50,60};

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] +" ");
        }

        System.out.println();

        //Enhanced for each loop

        for(int element : arr){
            System.out.print(element +" ");
        }

        System.out.println();


        float[] farr = {10.5f,5.6f};
        for(float element : farr){
            System.out.print(element +" ");
        }

        Student[] students = new Student[5];
        for(Student student : students) {
            System.out.println(student.getName());
        }

    }
}
