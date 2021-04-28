package BaiKiemTraCuoiKy.BaiKiemTraCuoiKy;

class Book extends Product{
    private String author;
    
    public Book() {
        // Default Constructor
    }
    
    public Book(String author) {
        this.author = author;
    }
    
    public Book(String title, double cost, String author) {
        super(title, cost);
        this.author = author;
    }

    public void printInfo() {
        System.out.println("author: " + author);
    }
}