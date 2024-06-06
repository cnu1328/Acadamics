import javax.swing.text.StyledEditorKit;

// Write a Java program which can give example of Method overloading and overriding 
class Area {
    

    void getArea(int length, int breadth) {
        System.out.println("The area of rectangle:" + (length * breadth));

    }

    void getArea(int side) {
        System.out.println("The area of Sqaure:" + (side * side));

    }
 void hi()
 {
  System.out.println("Hi");
 }

}
class Baseclass extends Area
{
    void hi()
    {
        System.out.println("Hi Hello");
        // super.hi();
    }
}

public class java02 {
    public static void main(String[] args) {
        
        Area a=new Area();
        a.getArea(10, 20);
        a.getArea(10);
        a.hi();
        Baseclass b= new Baseclass();
        b.hi();
    }
    
}
