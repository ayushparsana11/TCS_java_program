package Day2;
public class emp {
 private String name; 
 private int no;
  
 public String getName() 
 {
  return name; 
  }
 public void setName(String name) 
 {  
	 this.name = name;
 } 
 @Override
 public String toString() 
 {  return "[Name=" + name + ", No=" + no + "]";
 } 
 public int getNo() 
 {
  return no; 
  }
 public void setNo(int no) 
 {  
	 this.no = no;
 } 
}