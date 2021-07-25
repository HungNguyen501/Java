package Java.OOP;

public class main{
    public static void main(String[] args) {
        Male m1 = new Male("Hung", 12, "male", "student");
        Worker w1 = new Worker();

        System.out.println((m1 instanceof Person));
        System.out.println((m1 instanceof Male));
        System.out.println((w1 instanceof Person));
        System.out.println((w1 instanceof Male));

        m1.printInfo();
        m1.overWrite(12, 12);
    }
}
