
public class Student {
	public String studentID;
	public String email;
	private Assignment myAss;
	public Student(String studentID, String email){
		this.studentID = studentID;
		this.email = email;
	}
	public void sendEmailMsg(String msg){
		System.out.println(msg + "has been sent to " + this.email);
	}
	

}
