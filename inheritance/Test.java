package Java.inheritance;

public class Test {
    public static void main(String[] args) {
        // upcasting
        Person p = new Employee("hung");
        
        if (p instanceof Employee) {
            p.printRole();
        }
        
        // downcasting
        Employee e = (Employee) p;
        
        if (e instanceof Employee) {
            e.printRole();
            e.printSalary();
        }
        
        Check check = new Check();
        
        check.who(p);
        check.who(e);
    }
}