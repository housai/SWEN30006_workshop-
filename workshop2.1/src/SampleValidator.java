

import java.util.ArrayList;

/** Simple Sample Validator that only considers the file types
 * Created by mat on 10/02/2016.
 */
public class SampleValidator implements SubmissionValidator{

    @Override
    public ValidationError[] validateSubmission(Submission submission) {
        ArrayList<ValidationError> errors = new ArrayList<ValidationError>();
        // Loop through all files and create an error if there are any no pdfs
        File[] files = submission.includedFiles();
        for(File f1 : files){
        	
            String type = f1.fileType();
            
            if(!type.equals("pdf")){
            	//System.out.println(type);
                ValidationError error = new ValidationError(f1);
                error.addError("Error Type", "Unsupported filetype.");
                errors.add(error);
                System.out.println("Error Type");
                
            } 
        
            for(File f2: files){
            	if(f2.content().equals(f1.content())&& !f2.fileName.equals(f1.fileName)){
            		System.out.println( f2.fileName  +" copy " + f1.fileName );
            		System.out.println("Submission UnSuccessful");
            	}
            }
            
        }

            return null;
        }
    }
//}
