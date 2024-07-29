package stddatabase;

//import stddatabase.CRUDOperation;

import java.util.*;

public class testConnnection {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
				Scanner sc1 = new Scanner(System.in);
				Scanner sc2 = new Scanner(System.in);
				Scanner sc3 = new Scanner(System.in);
				String menu="\n1..Insert Student\n2..Update Student\n3..Delete Student\n4..Show Record\n5..Exit";
				std ts = new std();
				CRUDOperation crd = new CRUDOperation();
				int c=0;
				
				do {
					System.out.println(menu);
					System.out.print("Enter Choice : ");
					c=sc1.nextInt();
					
					switch(c)
					{
						case 1:
							System.out.println("Enter Std id : ");
							ts.setStud_id(sc1.nextInt());
							
							System.out.println("Enter std Name : ");
							ts.setSname(sc2.nextLine());
							
							System.out.println("Enter std Stream : ");
							ts.setStream(sc3.nextLine());
							
							crd.insertData(ts.getStud_id(), ts.getSname(), ts.getStream());
							break;
						
						case 2:
							System.out.print("Enter Stud ID : ");
							c=sc1.nextInt();
							
							System.out.println("Enter Name : ");
							ts.setSname(sc2.nextLine());
							
							System.out.println("Enter Stream : ");
							ts.setStream(sc3.nextLine());
							
							crd.updateData(ts.getSname(), ts.getStream(),c);
							
							break;
							
						case 3:
							System.out.print("Enter Stud ID : ");
							c=sc1.nextInt();
							crd.deleteData(c);
							break;
							
						case 4:
							crd.getData();
							break;
						
						default:
							System.out.println("Invlaid Choice");
					}
					
				}while(c!=5);		
			}

}


