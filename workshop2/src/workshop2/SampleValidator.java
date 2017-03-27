package workshop2;


import java.util.ArrayList;

/** Simple Sample Validator that only considers the file types
 * Created by mat on 10/02/2016.
 */
public class SampleValidator implements SubmissionValidator{

    @Override
    public ValidationError[] validateSubmission(Submission submission) {
    	
        ArrayList<ValidationError> errors = new ArrayList<ValidationError>();
        
        // Loop through all files and create an error if there are any no pdfs
        File f1 = submission.includedFiles();
        //for(File f1 ){
        	
            String type = f1.fileType();
            
            if(!type.equals("pdf")){
                ValidationError error = new ValidationError(f1);
                error.addError("File Type", "Unsupported filetype."); 
                errors.add(error);
                System.out.println("Error:"+ errors.add(error));
                
            }
//            for(File f2: files){
//            	if(f2.fileName.equals(f1.fileName)){
//            		System.out.println("Error in "+ f2.fileName);
//            	}
//            }
//            
//            
//            for(File f2: files){
//            	if(f2.content().equals(f1.content()) && !f2.fileName.equals(f1.fileName)){
//            		System.out.println("Plagerism Decteced in "+ f2.fileName);
//            	}
//            }
//         
     //   }
		return null;
		
//
//        if(errors.size() > 0){
//        	System.out.println("ErrorSize:"+ errors.size());
//           return errors.toArray(new ValidationError[0]);
//        } else {
//            return null;
//        }
    }
}
