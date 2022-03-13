package com.mrroot501.exception;

import org.apache.log4j.Logger;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author mrroot501
 */
public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class);

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
            LOGGER.info(ex.getMessage());
        }

        in.close();

    }
}