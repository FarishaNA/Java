import java.util.*;
class Circumference {
    public static void main(String args[]) {
        Circle c1 = new Circle();
        c1.setRadius();
        c1.calculateCircumference();
        c1.displayCircumference();
    }
}
class Circle {
    double radius, circumference;
    double pi;
    Circle() {
        radius = 0;
        pi = 3.1416;
    }
    public void setRadius() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter value for radius :");
        radius = s.nextDouble();
    }
    public void calculateCircumference() {
        circumference = 2*pi*radius;
    }
    public void displayCircumference() {
        System.out.println("Circumference of circle with radius "+radius+" is : "+circumference);
    }
}