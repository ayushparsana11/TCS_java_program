package stddatabase;
import java.sql.*;
import javax.sql.*;
import java.util.Scanner;
public class CRUDOperation {
    
	static Statement st;
	Connection cn;
	
	public CRUDOperation()
	{
		cn = databaseConnection.getConnection();
		try 
		{
			st = cn.createStatement(); // create null statement
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	//insert reacord
	
	public static void insertData(Integer stud_id, String sname, String stream)
	{
		String iquery = "insert into std1 values(" + stud_id + ",'" + sname + "','"+ stream+ "')";
		try 
		{
			int result = st.executeUpdate(iquery); // executing Query
			if(result > 1)
			{
				System.out.println("Inserted sucessfully....");
			}
		}
		catch(SQLIntegrityConstraintViolationException sq)
		{	
			System.out.println("Please enter unique number for student id");
		}
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("inserted sucessfully");
	}
	
	//delete record
	public static void deleteData(int stud_id)
	{
		String dquery = "delete from std1 where s_id="+stud_id+"";
		int r;
		try 
		{
			r = st.executeUpdate(dquery);
			if(r>0)
			{
				System.out.println("Deleted Sucessfully....");
			}
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//update data
	public static void updateData(String sname,String stream,int stud_id)
	{	
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		
		String uquery = "update std1 set s_name= '"+sname+"',s_stream='"+stream+"' where s_id= "+stud_id+"";
		try {
			int r = st.executeUpdate(uquery);
			if(r>0){
				System.out.println("Updated Sucessfully....");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//read data
	public static void getData()
	{
		String squery = "select * from std1";
		try 
		{
			ResultSet r = st.executeQuery(squery); // executeQuery is used only for select statement to print the output over here
			System.out.println(r); 
			while(r.next())
			{
				System.out.println(r.getInt(1)+ " " +r.getString(2)+" " + r.getString(3));
			}
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
