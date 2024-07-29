// write a program to create a list of integer numbers and print the total of all 
//even numbers and print the total of all even numbers.

package Day17_ListCollection;


import java.util.ArrayList;
import java.util.List;

public class List_ArrayList2_TotEven {
    public static void main(String[] args) {
        // Creating a list of integers
        List<Integer> l1 = new ArrayList<>();   

        // Adding elements to the list
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);

        int sum = 0;

        // Iterating through the list to calculate the sum of even numbers
        for (int no : l1) {
            if (no % 2 == 0) {
                sum += no; // Add semicolon here
            }
        }
        
        // Printing the total of all even numbers
        System.out.println("Total : " + sum);
    }
}
