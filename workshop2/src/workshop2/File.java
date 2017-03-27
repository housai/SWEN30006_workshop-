package workshop2;



//Sample private file class to be replaced by your implementaiton
public class File {
	
	public String fileName;
	public String dueDate;
	public String fileData;
//	public String fileType;

//	public  File (String fileName, String dueDate, String fileData, String fileType){
//		this.fileName= fileName;
//		this.dueDate= dueDate;
//		this.fileData= fileData;
//		this.fileType= fileType;
//		
//		
//	}
//    
	
	public String fileName(String fileName){
		
		return fileName;
		
		
	}
    public int fileSize() {
    	int num2 = (int) (Math.random()*10);
//    	System.out.println("num2:"+ num2 );
		return  num2;
	}
 
  	public String dueDate(){
  		 
		return dueDate;
  		
  	}
 public String fileType(){
     double num = Math.random();
     if(num<0.3){
//    	 System.out.println("num:"+ num );
         return "pdf";
     } else if(num>0.3 ){
//    	 System.out.println("num:"+ num );
         return "docx";}
	return fileType();

         
     }
 
 
 public String content(){
	 
	return fileData;
	 
	 
 }  
 
 
 
 public void printFile(){
//     System.out.println("name:"+ fileName );
//     System.out.println("dueDate:" + dueDate );
//     System.out.println("fileData:" + fileData );
    
  }

}