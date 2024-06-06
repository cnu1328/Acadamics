import java.time.format.SignStyle;

// Write a Java program to find Area and Circle of different shapes using polymorphism concept
class Area {
    static float PIE = 3.14f;
 int count =0;
    void incCount()
    {
        ++count;
    }

    void getArea(int length, int breadth) {
        System.out.println("The area of rectangle:" + (length * breadth));

    }

    void getArea(int side) {
        System.out.println("The area of Sqaure:" + (side * side));

    }

    void getArea(float radius) {
        System.out.println("The area of Circle: " + (PIE * radius * radius));
    }

}

public class java01 {
    public static void main(String[] args) {
        Area a=new Area();
        Area b=new Area();
        a.getArea(10f);
        a.getArea(10);
        a.getArea(10,20);
    //    System.out.println( Area.PIE);
  
    

    }

}