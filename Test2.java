interface Polygon{
    double getArea();
    void getSides();

}

class Rectangle implements Polygon {
    private double length;
    private double width;
    public Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }
     public double getArea() {
     return length*width;
    }
    public void getSides(){
       System.out.println("I have 4 sides");

    }

}
class Square implements Polygon {
    private double side;
 public  Square(double side){
     this.side=side;
 }
    public double getArea(){
        return side*side;

    }
    public void getSides(){
        System.out.println("I can get sides of a polygon");

    }

}

public class Test2{
    public static void main(String[] args){
        Rectangle R1= new Rectangle(5,8);
        double rectangleArea=R1.getArea();
        System.out.println("The area of Rectangle is "+rectangleArea);
        R1.getSides();


        Square S1 = new Square(5);
        double squareArea= S1.getArea();
        System.out.println("The area of Square is "+squareArea);
        S1.getSides();





    }
}


