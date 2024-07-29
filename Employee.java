package Day3;

public class Employee {

		private String name;
		private int no;
		
		public Employee()
		{
			no=103;
			name="yuvraj";
		}
		
		public Employee(String name, int no) {
			super();
			this.name = name;
			this.no = no;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		@Override
		public String toString() {
			return "[Name=" + name + ", No=" + no + "]";
		}
		public int getNo() {
			return no;
		}
		public void setNo(int no) {
			this.no = no;
		}
		
	}


