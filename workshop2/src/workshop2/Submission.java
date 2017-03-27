package workshop2;


//Sample private submission class to be replaced by your implementation
class Submission {
	int attemptNum;
	int numFiles;
    File files;
	

	public Submission(File files){
		this.attemptNum = 1;
//		this.files = new File;
		this.files = files;
	}
	
 // Return two fake files
 public  File includedFiles(){
	
//	        File[] files = new File[1];
//	    	files[0] = new File("firstfile", "Today", "This is hard, right?");
////	    	System.out.println("file is :" + files[0] );
//			//files[1] = new File("firstfile", "Today", "This is hard, right?");
	        return files;
	    }
//	 if(files != null){
//     	return files;
//     }
//     return files;
//    
 }

  

 
 
 

