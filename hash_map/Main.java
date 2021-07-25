package Java.hash_map;
import java.util.HashMap;

public class Main {
  public static void main(String[] args) {
    // Create a HashMap object called capitalCities
    HashMap<String, Person> myMap = new HashMap<String, Person>();

    // Add keys and values (Country, City)
    myMap.put("Alex", new Person("Alex", "male", 10));
    myMap.put("Bob", new Person("Bob", "male", 10));
    myMap.put("Linda", new Person("Linda", "fmale", 10));

    //System.out.println(myMap);

    //Person p1 = myMap.get("Linda");
    //System.out.println("Name: " + p1.name + "\nGender: " + p1.gender);

    // My HashMap
    HungHashMap<String, Person> hungMap = new HungHashMap<String, Person>();

    hungMap.put("Bob", new Person("Bob", "male", 10));
    hungMap.put("Alex", new Person("Alex", "male", 10));
    hungMap.put("Linda", new Person("Linda", "female", 10));

    Person p2 = hungMap.get("Linda");
    System.out.println("Name: " + p2.name + "\nGender: " + p2.gender);

  }
}