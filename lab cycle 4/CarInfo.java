import java.util.*;
class CarInfo {
    public static void main(String args[]) {
        Car c1 = new Car();
        c1.setCarInfo();
        c1.displayInfo();
    }
}
class Car {
    String make;
    String model;
    int year;
    public void setCarInfo() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter make, model and year of the car :");
        System.out.println("Make :");
        make = s.nextLine();
        System.out.println("Model :");
        model = s.nextLine();
        System.out.println("Year :");
        year = s.nextInt();
    }
    public void displayInfo() {
        System.out.println("Car Info :");
        System.out.println("Make :"+make);
        System.out.println("Model :"+model);
        System.out.println("Year :"+year);
    }
}