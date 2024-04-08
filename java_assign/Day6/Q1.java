import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
   
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "John", 500000));
        employees.add(new Employee(2, "Alice", 450000));
        employees.add(new Employee(3, "Bob", 380000));
        employees.add(new Employee(4, "Eve", 420000));

      
        System.out.println("Employees with Salary > 400000:");
        employees.stream()
                .filter(emp -> emp.getSalary() > 400000)
                .forEach(Employee::displayDetails);

        System.out.println("\nUpdating Employee Salary by 25%:");
        employees.forEach(emp -> emp.setSalary(emp.getSalary() * 1.25));
        employees.forEach(Employee::displayDetails);
        List<String> empNames = employees.stream()
                .map(emp -> emp.getName().toUpperCase())
                .collect(Collectors.toList());
        System.out.println("\nEmployee Names in Uppercase:");
        empNames.forEach(System.out::println);
    }
}
