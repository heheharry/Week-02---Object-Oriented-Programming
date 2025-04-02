package Day3.ObjectModeling;
import java.util.ArrayList;
import java.util.List;
class Employee {
    private String name;
    private String position;
    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }
    public void displayEmployee() {
        System.out.println("   Employee: " + name + ", Position: " + position);
    }
}
class Department {
    private String departmentName;
    private List<Employee> employees;
    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.employees = new ArrayList<>();
    }
    public String getDepartmentName() {
        return departmentName;
    }
    public void addEmployee(String name, String position) {
        employees.add(new Employee(name, position));
    }
    public void displayDepartment() {
        System.out.println(" Department: " + departmentName);
        for (Employee emp : employees) {
            emp.displayEmployee();
        }
    }
}

class Company {
    private String companyName;
    private List<Department> departments;
    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }
    public void addDepartment(String departmentName) {
        departments.add(new Department(departmentName));
    }
    public void addEmployeeToDepartment(String departmentName, String employeeName, String position) {
        for (Department dept : departments) {
            if (dept.getDepartmentName().equals(departmentName)) {
                dept.addEmployee(employeeName, position);
                return;
            }
        }
        System.out.println("Department not found!");
    }
    public void displayCompany() {
        System.out.println("\nCompany: " + companyName);
        for (Department dept : departments) {
            dept.displayDepartment();
        }
    }
}
public class CompanyManagement {
    public static void main(String[] args) {
        Company company = new Company("Tech Innovations");
        company.addDepartment("Software Development");
        company.addDepartment("Human Resources");
        company.addEmployeeToDepartment("Software Development", "Alice", "Software Engineer");
        company.addEmployeeToDepartment("Software Development", "Bob", "Senior Developer");
        company.addEmployeeToDepartment("Human Resources", "Charlie", "HR Manager");
        company.displayCompany();
    }
}
