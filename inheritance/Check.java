package inheritance;

public class Check {
    public void who(Person p) {
        if (p instanceof Employee) {
            System.out.println("This is instance of Person");
            p.printRole();
        } else if (p instanceof Person) {
            System.out.println("This is instance of Employee");
            Employee e = (Employee) p;
            e.printRole();
            //e.printSalary();
        }
    }
}