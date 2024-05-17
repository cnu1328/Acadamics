abstract class shape{
 abstract void getArea();
 abstract void getVolume();
}
class myShapes extends shape{
 float side;
 float radius;
 myShapes(float side, float radius){
 this.side= side;
 this.radius= radius;
 }
 @Override
 void getArea() {
 System.out.println("The Area of Square: "+side*side);

 System.out.println("The Area of Circle: "+Math.PI*radius*radius);
 System.out.println("The Area of Sphere: "+4*Math.PI*radius*radius);
 }
 @Override
 void getVolume() {
 System.out.println("The Volume of Cube: "+(side*side*side));
 System.out.println("The Area of Sphere: "+4/3*Math.PI*radius*radius*radius);
 }
}
public class java01 {
 public static void main(String[] args) {
 myShapes s1= new myShapes(4,5);
 s1.getArea();
 s1.getVolume();
 
}
}