import java.util.*;
class AreaRectangle {
    public static void main(String args[]) {
        Rectangle r1 = new Rectangle();
        r1.setDimension();
        r1.calculateArea();
        r1.displayArea();
    }
}
class Rectangle {
    float length;
    float width;
    float area;
    Rectangle() {
        length = 0; 
        width = 0;
    }
    public void setDimension() {
        Scanner s = new Scanner (System.in);
        System.out.println("Enter length & width of rectangle :");
        length = s.nextFloat();
        width = s.nextFloat();
    }
    public void calculateArea() {
        area = length*width;
    }
    public void displayArea() {
        System.out.println("Area of rectangle with length "+length+" and width "+width+" is :  "+area);
    }
}