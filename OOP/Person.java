package Java.OOP;

class Person{
    private String name;
    private int age;
    private String sex;

    public Person() {
        // Default constructor
    }

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    void setName(String name) {
        this.name = name;
    }

    void setAge(int age) {
        this.age = age;
    }

    void setSex(String sex) {
        this.sex = sex;
    }

    String getName() {
        return this.name;
    }

    int getAge() {
        return this.age;
    }

    String getSex() {
        return this.sex;
    }
        
    void printType() {
        System.out.println("This is a person");
    }

    void printInfo() {
        System.out.println("show info");
    }

    void overLoad(int age) {
        System.out.println(age);
    }
    
}