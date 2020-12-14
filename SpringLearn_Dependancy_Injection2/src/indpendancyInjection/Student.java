		package indpendancyInjection;
		
		public class Student {
			/**
			 * these varables are called independances 
			 */
			
			 private  String studentName; // this means "student name is the dependancy of  the class student ". What we need to do is,  we need to "Inject, it means to assign" it but by using xml file .
			 private int ID ;
			 
			 public Student(String studentName, int ID) {
				 this.ID=ID;
				 this.studentName= studentName;
				 
			 }
	public  void displayStudentInfo() {
					 
					 System.out.println(studentName +" "+ ID);
					 
				 }
			 
			/* public int getID() {
				return ID;
			}
	
			public void setID(int iD) {
				ID = iD;
			}
	
			
		
			public String getStudentName() {
				return studentName;
			}
		
			public void setStudentName(String studentName) {
				this.studentName = studentName;
			}*/
			
		
		}
