

// Sample private submission class to be replaced by your implementation
class Submission {
    // Return two fake files
	public int attemptNum;
	public int numFiles;
	private File[] files;
	
	public Submission(File[] files){
		this.attemptNum = 1;
		this.files = new File[10];
		this.files = files;
	}
    public File[] includedFiles(){
        if(files != null){
        	return files;
        }
        return files;
    }
}
