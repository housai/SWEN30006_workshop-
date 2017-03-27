

public class Driver {
	public static void main(String[] args){
		
		//subject
		Subject subject = new Subject("Computing", "11111");
		System.out.println("subject name is :"+ subject.name + ", subject code is " +subject.subjectCode);
		
		//student
		Student student = new Student("123", "123@123.com");
		System.out.println("student name is :"+ student.studentID + ", email is " +student.email);
		
		//assignment
		Assignment newAssignment = new Assignment("Assignment1","just play", "2017-03-18", 2);
		System.out.println("new Assissment is " + newAssignment.name + 
				  ", Assissment description is " + newAssignment.description + 
				  ", dueDate is " + newAssignment.dueDate +
				  ", maxAttempts is " + newAssignment.maxAttempts
				    );
		subject.createAssignment(newAssignment);
		
		//test
		File[] myFile = new File[1];
		//test
		myFile[0] = new File("test1", "123", "pdf");
		System.out.println("file1 name is :" + myFile[0].fileName +", content is :" + myFile[0].content()+", type is :" + myFile[0].fileType );
		// type test
//		myFile[0] = new File("test2", "123456", "ddd");
//		System.out.println("file1 name is :" + myFile[0].fileName +", content is :" + myFile[0].content()+", type is :" + myFile[0].fileType );
		//copy test
//		myFile[1] = new File("test3","123", "pdf");
//		System.out.println("file1 name is :" + myFile[1].fileName +", content is :" + myFile[1].content()+", type is :" + myFile[1].fileType );
		
		Submission submitted = new Submission(myFile);
		
		newAssignment.validSubmissions(submitted);
		//newAssignment.invalidSubmissions(submitted);
		
	}
}
