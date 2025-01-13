import java.util.*;
class EmployeeInfo {
    public static void main(String args[]) {
        Employee emp = new Employee();
        emp.setSalaryDetails();
        emp.displayInfo();
    }
}
class Employee {
    String name;
    String id;
    int salary;
    public void setSalaryDetails() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the employee details :");
        System.out.print("Name :");
        name = s.nextLine();
        System.out.print("Id :");
        id = s.nextLine();
        System.out.print("Salary :");
        salary = s.nextInt();
    }
    public void displayInfo() {
        System.out.println("..............");
        System.out.println("Employee Info :");
        System.out.println("Name :"+name);
        System.out.println("Id :"+id);
        System.out.println("Salary :"+salary);
    }
}