package Java.exception;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) throws WrongBirthday{
        Scanner in = new Scanner(System.in);
        int day, month;
        
        try {
            System.out.print("Nhap thang: ");
            month =in.nextInt();
            System.out.print("Nhap ngay: ");
            day =in.nextInt();
            
            Birthday bd = new Birthday(day, month);
            bd.printInfo();
        } 
        catch (InputMismatchException ex) {
            ex.printStackTrace();
        }
        catch (WrongBirthday ex) {
            System.out.println(ex.getMessage());
        }

        in.close();
             
    }
}