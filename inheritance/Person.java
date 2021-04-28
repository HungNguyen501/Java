package inheritance;

public class Person {
    protected String name;
    
    public Person(String name) {
        this.name = name;
    }
    
    public void printRole() {
        System.out.println("This is " + name);
    }
    
}