package homework;

public class Circle {
    double radius;
    String color;
    public static double PI = 3.141592;
    
    public Circle() {
        radius = 1.0;
        color = "red";
    }
    public Circle(int radius) {
        this.radius = radius;
        color = "red";
    }
    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    
    public double getRadius() {return radius;}
    public String getColor() {return color;}
    public double getArea() {return PI*radius*radius;}
}