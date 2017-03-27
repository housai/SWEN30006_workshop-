package workshop2;



public class Assissment {
	
	String name;
	String description;
	String dueDate;
	int maxAttempts;
    
	 Submission[] validSubmission;
	 Submission[] invalidSubmission;
	 SampleValidator validator;
	
	
//			String name, String description, String dueDate, int maxAttempts){
//		this.name = name;
//		this.description = description;
//		this.dueDate = dueDate;
//		this.maxAttempts = maxAttempts;
//		
//		validSubmission = new Submission[maxAttempts];
//		invalidSubmission = new Submission[maxAttempts];
//		validator = new SampleValidator();
//	}
//		String name;
//		String description;
//		String dueDate;
//		int maxAttempts;
//		this.name = name;
//		this.description = description;
//		this.dueDate = dueDate;
//		this.maxAttempts = maxAttempts;



	public Submission[] validSubmissions(Submission sub){
		
	
		if((validator.validateSubmission(sub)) != null){
			invalidSubmission[sub.attemptNum] = sub;

			System.out.println(sub.attemptNum + "Submission UnSuccessful");
		}else{
			validSubmission[sub.attemptNum] = sub;

			System.out.println(sub.attemptNum + "Submission successful");
		}
//		
		return validSubmission;
	}



	
	
//	public Submission[] invaildSubmission(Submission check){
//		if((validator.validateSubmission(check)) != null){
//			invalidSubmission[check.attemptNum] = check;
//		System.out.println("Submission successful");}
//		return null;
//	}
}
