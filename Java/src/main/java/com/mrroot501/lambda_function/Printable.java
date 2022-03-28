package com.mrroot501.lambda_function;

/**
 * @author mrroot501
 */
public interface Printable {
    /* In lambda expression, we have only one abstract method in interface class
    * This is because we show the java knows the used method
    * If we add more than one method in interface class, error will happen
    * */
    void print(String s);
//    String returnString(String s1, String s2);

}
