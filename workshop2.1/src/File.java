

// Sample private file class to be replaced by your implementaiton
class File {
	public String fileName;
	private String fileData;
	public String fileType;
	
	public File(String fileName, String fileData, String fileType){
		this.fileName = fileName;		
		this.fileData = fileData;
		this.fileType = fileType;
	}
	
	
    public String fileType(){
    	return this.fileType;
    }
    
    public void setFileData(String FileData){
    	this.fileData = FileData;
    }
    
    public String getFileData(){
    	return fileData;
    }
    
    public int fileSize(){
    	return fileData.length();
    }
    
    public String content(){
    	return fileData;
    }
}