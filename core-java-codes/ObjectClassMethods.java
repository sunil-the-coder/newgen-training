
class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;

        // super.x; //base class property
        // super.baseMethod(); // base class
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + x;
        result = prime * result + y;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Point other = (Point) obj;
        if (x != other.x)
            return false;
        if (y != other.y)
            return false;
        return true;
    }

    
}

public class ObjectClassMethods {
    
    public static void main(String[] args) {

        Point p1 = new Point(5, 10); // 1000
        Point p2 = new Point(5, 10); // 2000
        Point p3 = p2; // 2000


        if(p1 == p2)
            System.out.println("p1 & p2 are equal by == ");
        else 
            System.out.println("p1 & p2 are not equal by ==");

        
        //this -> p1, that -> p2
        if(p1.equals(p2)) 
            System.out.println("p1 & p2 are equal by equals() method ");
        else 
            System.out.println("p1 & p2 are not equal by equals() method");

            
        if(p3.equals(p2)) 
            System.out.println("p1 & p2 are equal by equals() method ");
        else 
            System.out.println("p1 & p2 are not equal by equals() method");
    
    }
}
