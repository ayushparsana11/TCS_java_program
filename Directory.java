package directory;

import java.util.Scanner;

public class Directory {

	private GetPersonData[] rec;
	private int size = 0;
	private int Uid = 1001;

	
	  public Directory(int cap) 
	  { // TODO Auto-generated constructor stub 
		  this.rec = new GetPersonData[cap]; 
		  this.size=0; 
		 }
	 
	public void createRecord() {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Name: ");
		String name = sc.nextLine();

		System.out.print("Enter Address: ");
		String address = sc.nextLine();

		System.out.print("Enter Telephone Number (with STD code, optional): ");
		String telephone = sc.nextLine();

		System.out.print("Enter Mobile Number (optional): ");
		String mobile = sc.nextLine();

		System.out.print("Enter Head of the Family: ");
		String headOfFamily = sc.nextLine();

		rec[size++] = new GetPersonData(name, address, telephone, mobile, headOfFamily, Uid + "");
		Uid++;

		System.out.println("Record Added...");
	}

	public void editRecord() 
	{
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Unique ID of the entry to edit: ");
        String uniqueID = scanner.nextLine();
        int index = findEntryById(uniqueID);
        if (index == -1) {
            System.out.println("Error: No entry found with the given Unique ID.");
            return;
        }

        GetPersonData entry = rec[index];

        System.out.println("Editing entry: \n" + entry);
        System.out.print("Enter Name (leave blank to keep current): ");
        String name = scanner.nextLine();
        System.out.print("Enter Address (leave blank to keep current): ");
        String address = scanner.nextLine();
        System.out.print("Enter Telephone Number (with STD code, optional, leave blank to keep current): ");
        String telephone = scanner.nextLine();
        System.out.print("Enter Mobile Number (optional, leave blank to keep current): ");
        String mobile = scanner.nextLine();
        System.out.print("Enter Head of the Family (leave blank to keep current): ");
        String headOfFamily = scanner.nextLine();

        // Check for telephone number uniqueness constraint if changed
        if (!telephone.isEmpty()) {
            for (int i = 0; i < size; i++) {
                GetPersonData e = rec[i];
                if (!e.getUniqueID().equals(uniqueID) && e.getTelephone().equals(telephone) && !e.getHeadOfFamily().equals(headOfFamily)) {
                    System.out.println("Error: Telephone number must be unique or shared by the same family head.");
                    return;
                }
            }
        }

        if (!name.isEmpty()) {
            entry.setName(name);
        }
        if (!address.isEmpty()) {
            entry.setAddress(address);
        }
        if (!telephone.isEmpty()) {
            entry.setTelephone(telephone);
        }
        if (!mobile.isEmpty()) {
            entry.setMobile(mobile);
        }
        if (!headOfFamily.isEmpty()) {
            entry.setHeadOfFamily(headOfFamily);
        }

        System.out.println("Entry updated successfully.");

	}

	public void deleteRecord() 
	{
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Unique ID of the entry to delete: ");
        String uniqueID = scanner.nextLine();
        int index = findEntryById(uniqueID);
        if (index == -1) {
            System.out.println("Error: No entry found with the given Unique ID.");
            return;
        }

        for (int i = index; i < size - 1; i++) {
            rec[i] = rec[i + 1];
        }
        rec[--size] = null;
        System.out.println("Entry deleted successfully.");
	}
	
	private int findEntryById(String uniqueID) 
	{
        for (int i = 0; i < size; i++) 
        {
            if (rec[i].getUniqueID().equals(uniqueID)) 
            {
                return i;
            }
        }
        return -1;
    }
	
	public void searchRecord() 
	{
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter keyword to search: ");
        String keyword = sc.nextLine().toLowerCase();

        boolean found = false;
        for (int i = 0; i < size; i++) {
            GetPersonData entry = rec[i];
            if (entry.getUniqueID().toLowerCase().contains(keyword) ||
                entry.getName().toLowerCase().contains(keyword) ||
                entry.getAddress().toLowerCase().contains(keyword) ||
                entry.getTelephone().toLowerCase().contains(keyword) ||
                entry.getMobile().toLowerCase().contains(keyword) ||
                entry.getHeadOfFamily().toLowerCase().contains(keyword)) {
            	System.out.println("---------------------------");
            	System.out.println(entry);
                System.out.println("---------------------------");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No matching entries found.");
        }
	}

	public void showRecord() {
		System.out.println("Record : ");
		for (int i = 0; i < size; i++) {
			System.out.println(rec[i]);
			System.out.println("-----------------------------------------------");
		}
	}
}