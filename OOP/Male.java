package Java.OOP;

public class Male extends Person{
    private String job;

    public Male() {
        // Default constructor
        super();
    }

    public Male(String name, int age, String sex, String job) {
        super(name, age, sex);
        this.job = job;
    }

    void setJob(String job) {
        this.job = job;
    }

    String getJob() {
        return this.job;
    }

    void printType() {
        System.out.println("This is a male");
    }

    void printInfo() {
        System.out.println("Iam " + getName() + " age: " + getAge());
    }

    void overWrite(int age, int temp) {
        System.out.println(age+temp);
    }


}
