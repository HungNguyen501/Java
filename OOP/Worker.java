package Java.OOP;

public class Worker extends Male{
    private String company;

    public Worker() {
        super();
    }

    void setCompany(String company) {
        this.company = company;
    }

    String getJob() {
        return this.company;
    }
}
