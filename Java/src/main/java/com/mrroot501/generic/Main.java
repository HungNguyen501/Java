package com.mrroot501.generic;

import org.apache.log4j.Logger;

/**
 * @author mrroot501
 */
public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        Generic<Integer> array = new Generic<Integer>(new Integer[]{1, 2, 3, 4, 5});
        Generic<String> s = new Generic<String>(new String("hello"));

        LOGGER.info(array.getArray()[0] + "\t" + s.getE());
    }

}
