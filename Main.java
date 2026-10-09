package employee;

class Employee {
    String name;
    int salary;

    void displayEmployee() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    String department;

    void displayManager() {
        System.out.println("Department: " + department);
    }
}

class Salesperson extends Employee {
    int target;

    void displaySalesperson() {
        System.out.println("Sales Target: " + target);
    }
}

public class Main {
    public static void main(String[] args) {

        Manager m = new Manager();
        m.name = "Sahana";
        m.salary = 60000;
        m.department = "Development";

        System.out.println("Manager Details:");
        m.displayEmployee();
        m.displayManager();

        System.out.println();

        Salesperson s = new Salesperson();
        s.name = "Rahul";
        s.salary = 40000;
        s.target = 200000;

        System.out.println("Salesperson Details:");
        s.displayEmployee();
        s.displaySalesperson();
    }
}