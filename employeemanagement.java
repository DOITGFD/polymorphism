import java.util.ArrayList;
import java.util.List;

class Employee {
    private String name;
    private int employeeID;
    private double hourlyRate;
    private double hoursWorked;

    public Employee(String name, int employeeID, double hourlyRate, double hoursWorked) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double calculateGrossPay() {
        return hourlyRate * hoursWorked;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Hourly Rate: $" + hourlyRate);
        System.out.println("Hours Worked: " + hoursWorked);
        
        double grossPay = calculateGrossPay();
        if (grossPay % 1 == 0) {
            System.out.printf("Gross Pay: $%.1f%n", grossPay);
        } else {
            System.out.printf("Gross Pay: $%.2f%n", grossPay);
        }
        
        System.out.println();
    }
}

public class employeemanagement {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Alice", 101, 20.0, 40.0));
        employees.add(new Employee("Bob", 102, 18.5, 35.5));
        employees.add(new Employee("Carol", 103, 22.0, 45.0));

        System.out.println("Employee Details");
        System.out.println("-----------------");
        
        for (Employee employee : employees) {
            employee.displayDetails();
        }
    }
}