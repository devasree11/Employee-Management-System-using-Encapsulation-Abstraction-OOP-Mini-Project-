abstract class Employee {
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

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }
    
    abstract void displayDetails();
}

class FullTimeEmployee extends Employee {

    public FullTimeEmployee(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    void displayDetails() {
        System.out.println("Full-Time Employee");
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Salary: " + getSalary());
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        FullTimeEmployee emp1 = new FullTimeEmployee(101, "Deva", 50000);

        emp1.displayDetails();
        emp1.setSalary(55000);
        System.out.println("\nAfter Salary Update:");
        emp1.displayDetails();
    }
}
