package Day2.AccessModifiers;
class Employee {
    public int employeeID;
    protected String department;
    private double salary;
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
            System.out.println("Salary updated successfully.");
        } else {
            System.out.println("Invalid salary amount.");
        }
    }
    public void displayEmployeeDetails() {
        System.out.println("\nEmployee Details:");
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
    }
}
class Manager extends Employee {
    private int teamSize;
    public Manager(int employeeID, String department, double salary, int teamSize) {
        super(employeeID, department, salary);
        this.teamSize = teamSize;
    }
    public void displayManagerDetails() {
        System.out.println("\nManager Details:");
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + getSalary());
        System.out.println("Team Size: " + teamSize);
    }
}
public class EmployeeRecords {
    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "HR", 50000);
        emp1.displayEmployeeDetails();
        emp1.setSalary(55000);
        System.out.println("Updated Salary: $" + emp1.getSalary());
        Manager mgr1 = new Manager(201, "IT", 80000, 10);
        mgr1.displayManagerDetails();
    }
}
