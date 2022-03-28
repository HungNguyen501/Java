package com.mrroot501.lambda_function;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * @author mrroot501
 */
public class Lambdas {
    private static final Logger LOGGER = LogManager.getLogger(Lambdas.class);

    public static void main(String[] args) {
        LOGGER.info("Lambda Function");

        // Method 1
        printThing(
            (s) -> {
                LOGGER.info("method 1 " + s);
            }
        );

        // Method 2
        printThing((s) -> LOGGER.info("method 2 " + s));

        // Method 3
        Printable lambdaPrintable = (s) -> LOGGER.info("method 3 " + s);
        printThing(lambdaPrintable);



    }

    public static void printThing(Printable thing) {
        String s = "hello";
        thing.print(s);
    }



}
