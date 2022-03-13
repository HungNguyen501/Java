package com.mrroot501.test;

import com.mrroot501.config.Resource;
import org.apache.log4j.Logger;

/**
 * @author mrroot501
 */
public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        LOGGER.info(Resource.Info.name);
        LOGGER.info(Resource.Info.email);
        LOGGER.info(Resource.Info.nickname);

    }

}
