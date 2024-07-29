package Day19_Set;

import java.util.*;

public class TreeMap1 {

    public static void main(String[] args) {
        // Key, value
        TreeMap<String, Integer> courses = new TreeMap<String, Integer>();

        courses.put("Java", 5000);
        courses.put("C", 5000);
        courses.put("Python", 6000);
        courses.put("DS", 7000);

        System.out.println(courses);

        System.out.println(courses.firstEntry());
        
        // Corrected loop
        for (String key : courses.keySet()) { 
            System.out.println("Course: " + key + " | Price: " + courses.get(key)); 
        } 
    }
}