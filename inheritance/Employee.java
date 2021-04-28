package inheritance;

public class Employee extends Person {
    public Employee(String name) {
        super(name);
    }
    
    public void printSalary() {
        System.out.println("Salary is 555");
    }
}