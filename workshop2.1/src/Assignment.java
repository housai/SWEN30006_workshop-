

import java.util.ArrayList;
import java.util.Date;

public class Assignment {
	public String name;
	public String description;
	public String dueDate;
	public int maxAttempts;
	
	

	Submission[] validSubmission;
	Submission[] invalidSubmission;
	SampleValidator validator;

	
	public Assignment(String name,
			String description,
			String dueDate, 
			int maxAttempts){
		this.name = name;
		this.description = description;
		this.dueDate = dueDate;
		this.maxAttempts = maxAttempts;
		validSubmission = new Submission[maxAttempts];
		invalidSubmission = new Submission[maxAttempts];
		validator = new SampleValidator();
	}

	
	
	
	public Submission[] validSubmissions(Submission check){
		if((validator.validateSubmission(check)) != null){
			invalidSubmission[check.attemptNum] = check;

			System.out.println("Submission UnSuccessful");
		}else{
			validSubmission[check.attemptNum] = check;

			System.out.println("Submission successful");
		}
		
		return validSubmission;
	}

	
}
