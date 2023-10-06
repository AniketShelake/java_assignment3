// Create a class named Shape with a function that prints "This is a
// shape". Create another class named Polygon inheriting the Shape
// class with the same function that prints "Polygon is a shape".
// Create two other classes named Rectangle and Triangle having
// the same function which prints "Rectangle is a polygon" and
// "Triangle is a polygon" respectively. Again, make another class
// named Square having the same function which prints "Square is a
// rectangle".

// Now, try calling the function by the object of each of these
// classes.

class Shape{
    void display(){
        System.out.println("This is shape");
    }
}
class Polygon extends Shape{
    void display(){
        System.out.println("Polygon is shape");
    }
}
class Rectangle extends Polygon{
    void display(){
        System.out.println("Rectangle is polygoan");
    }
}
class Triangle extends Polygon{
    void display(){
        System.out.println("Triangle is polygoan");
    }
}
class Square extends Rectangle{
    void display(){
        System.out.println("Square is rectangle");
    }
}
public class ass5 {
    public static void main(String[] args){
        Shape s1=new Shape();
        s1.display();
        Polygon p1=new Polygon();
        p1.display();
        Rectangle r1=new Rectangle();
        r1.display();
        Triangle t1=new Triangle();
        t1.display();
        Square s2=new Square();
        s2.display();
    }
}
