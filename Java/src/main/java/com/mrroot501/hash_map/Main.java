package com.mrroot501.hash_map;

import org.apache.log4j.Logger;

/**
 * @author mrroot501
 */
public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        // Create a HashMap object called capitalCities
        HashMap<String, Person> myMap = new HashMap<String, Person>();

        // Add keys and values (Country, City)
        myMap.put("Alex", new Person("Alex", "male", 10));
        myMap.put("Bob", new Person("Bob", "male", 10));
        myMap.put("Linda", new Person("Linda", "fmale", 10));

        //LOGGER.info(myMap);

        //Person p1 = myMap.get("Linda");
        //LOGGER.info("Name: " + p1.name + "\nGender: " + p1.gender);

        // My HashMap
        HashMap<String, Person> hungMap = new HashMap<String, Person>();

        hungMap.put("Bob", new Person("Bob", "male", 10));
        hungMap.put("Alex", new Person("Alex", "male", 10));
        hungMap.put("Linda", new Person("Linda", "female", 10));

        Person p2 = hungMap.get("Linda");
        LOGGER.info("Name: " + p2.name);
        LOGGER.info("Gender: " + p2.gender);

    }
}
