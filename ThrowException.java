package Day13;

public class ThrowException {
	private int marks;
	
	public int getMarks(){
		return marks;
	}
	
	public void setMarks(int marks){
		try{
			if(marks < 0){
				throw new Exception();
			}
			else{
				this.marks = marks;
			}
		}catch(Exception ex){
			System.out.println("Marks should not be negative");
		}
	}

	@Override
	public String toString() {
		return "ThrowException [marks=" + marks + "]";
	}
	
}