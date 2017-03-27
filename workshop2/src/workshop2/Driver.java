package workshop2;


public class Driver {
	
	 public static void main(String[] args){
		
		      File f1 = new File();
//		      
//	
		      f1.fileSize();
		      f1.fileType();
              f1.fileName("lol");
		      
		      Subject newSubject = new Subject();
		      newSubject.name= "play";
		      newSubject.subjectCode = "123456";
		      		
		      System.out.println("new subject is " + newSubject.name + ",subject code is " + newSubject.subjectCode);
		      
			  Student newStudent = new Student();
			  newStudent.studentID="123";
			  newStudent.email="123@123.com";
			  
			  System.out.println("new student is " + newStudent.studentID + ",email is " + newStudent.email);		
			  
			  Assissment newAssissment = new Assissment();
			  newAssissment.name="Assignment1";
			  newAssissment.description="just play ";
			  newAssissment.dueDate="2017-03-30";
			  newAssissment.maxAttempts=2;
			  System.out.println("new Assissment is " + newAssissment.name + 
					  ", Assissment description is " + newAssissment.description + 
					  ", dueDate is " + newAssissment.dueDate +
					  ", maxAttempts is " + newAssissment.maxAttempts
					    );
			  
			  System.out.println("My fileName is :"+ f1.fileName("lol") );
			  System.out.println("My fileSize is :"+ f1.fileSize() );
			  System.out.println("My fileType is :"+ f1.fileType());
			  
			  newSubject.createAssignment(newAssissment);
			  
//				File[] myFile = new File[1];
//				myFile[0] = new File();
//				//myFile[1] = new File();
//				
//				myFile[0].fileName="111";
//				
//				//myFile[1].fileName="111";
//				
//				
//				
//				System.out.println("file name is :" + myFile[0].fileName);
			
				//System.out.println("file name is :" + myFile[1].fileName);
				
				
			

				
				Submission sub = new Submission(f1);
				
				newAssissment.validSubmissions(sub);
//				System.out.println("fileSize:"+ myFile.fileSize() );
//			    System.out.println("fileType:"+ myFile.fileType() );
//		      
		 
		 
		 
		 
	 }

}
