public class Looping
{
    public static void main(String[] args) {
        
       // Week days -> 7 days - Working days - 5 ( monday to friday )

    int day = 1;
    while ( day <= 5) // 1 <= 5, 2 <= 5, 3 <= 5, 4 <= 5 , 5 <= 5 , 6 <= 5
    {
       switch(day) { // 1, 2, 3, 4, 5
            case 1: 
                System.out.println("Monday");
                break;
            case 2: 
                System.out.println("Tuesday");
                break;
            case 3: 
                System.out.println("Wednesday");
                break;
            case 4: 
                System.out.println("Thursday");
                break;
            case 5: 
                System.out.println("Friday");
                break;
       }

       int startTime = 9; 
       while( startTime < 18) { // 9 <= 17,  10 <= 17, 11 <= 17, 12 <= 17, 13 <=17, 14 <= 17, 15 <= 17, 16 <= 17, 17 <= 17, 18 <= 17
        int endTime = startTime + 1; // 9+1 => 10, 10 + 1 => 11, 11 + 1 = 12
        System.out.println(startTime + "-" + endTime ); // 9 - 10, 10 - 11, 11-12
        startTime = startTime + 1; // 10, 11, 12
       }

       day = day + 1; // day - 2, day - 3, day - 4, day - 5 , day - 6

    }

    System.out.println("Final Day value: "+ day); //

    }
}

// Comment Line

/*

HW - 
    1. Print * on screen 10 times.
    2. Monday to Friday - 9am to 5pm => 
        Monday
            9 - 10
            10 - 11
            11 - 12
            12 - 13
            13 - 14
            14 - 15
            15 - 16
            16 - 17
         Tuesday
            9 - 10
            10 - 11
            11 - 12
            12 - 13
            13 - 14
            14 - 15
            15 - 16
            16 - 17


*/


/* 

while ( condition ) { // day tracking ( 1 to 5)

    //code

        //nested while loop
        while(condition) { // time tracking ( 9am to 6pm )
            //code

            //nested while loop
            while(condition) {
                //code
            }

        }

        while( condition ){

        }

    //code

}
*/