package com.mrroot501.exception;

/**
 * @author mrroot501
 */
public class WrongBirthday extends Exception{

    private static final long serialVersionUID = 1L; // fix warning ==> this warning is not problem

    public WrongBirthday(String msg) {
        super(msg);
    }
}
