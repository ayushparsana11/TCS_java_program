package Day17_LinkedList;

import java.util.LinkedList;
import java.util.List;

public class LinkedList1 {

    public static void main(String[] args) {
        // Creating a LinkedList of Strings
        List<String> l2 = new LinkedList<>();

        // Adding elements to the LinkedList
        l2.add("Sakshi");
        l2.add("Shubham");
        l2.add("Jay");
        l2.add("Vrunda");
        l2.add("Om");
        l2.add("Mantra");

        // Printing the elements of the LinkedList
        for (String name : l2) {
            System.out.println(name);
        }
    }
}
