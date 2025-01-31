class StarPattern {

    public static void main(String[] args) {

        /*
            *
            * *
            * * *
            * * * *
            * * * * *
            * * * * * *
            * * * * * * *
            * * * * * * * *
        */


        for(int i = 1; i <= 5; i++) { // i = 1, 1 <=5, 2 <= 5, 3 <= 5, 4<= 5, 5<=5, 6 <= 5
            
            for(int j = 1; j <= i; j++) { // j = 1, 1 <= 5, 2 <= 5, 3 <= 5, 4 <= 5, 5 <= 5, 6 <= 5
                System.out.print("* ");
            }

            System.out.println(); // just print newline
        }
    }
}