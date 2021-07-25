package Java.exception;

public class Birthday {
    private int day, month;
    
    // Default constructor
    public Birthday() {
        
    }
    
    public Birthday(int day, int month) throws WrongBirthday{
        // Exception handling
        if (month < 1 || month > 12) throw new WrongBirthday("Nhap sai thang");
        if (day < 1) throw new WrongBirthday("Nhap sai ngay cua thang " + month);
        if (month == 2 && day > 29 ) throw new WrongBirthday("Nhap sai ngay cua thang 2");
        if ( month == 4 || month == 6 || month == 9 || month == 11 ) {
            if (day > 30) throw new WrongBirthday("Nhap sai ngay cua thang " + month);
        } else {
            if (day > 31) throw new WrongBirthday("Nhap sai ngay cua thang " + month);
        }
            
        this.day = day;
        this.month = month;
    }

    public void printInfo() {
        System.out.println("Day: " + this.day + ", month: " + this.month);
    }
}