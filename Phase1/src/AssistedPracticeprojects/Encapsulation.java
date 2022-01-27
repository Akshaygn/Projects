package AssistedPracticeprojects;

class StudentDetails{
	private int rollno;
	private String name;
	//getters
	public int getRollno() {
		return rollno;
	}
	
	public String getName() {
		return name;
	}
	
	
	
	//setters
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
public class Encapsulation 
{
	public static void main(String[] args) 
	{
		StudentDetails stud=new StudentDetails();
		stud.setRollno(25);
		stud.setName("Panda");
		System.out.println("Rollno="+stud.getRollno());
		System.out.println("Name="+stud.getName());
	}

}