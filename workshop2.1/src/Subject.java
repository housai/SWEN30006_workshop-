

import java.util.ArrayList;

public class Subject {
	public String name;
	public String subjectCode;
	ArrayList<Assignment> myAss = new ArrayList<Assignment>();
	
	public Subject(String name, String subjectCode){
		this.name = name;
		this.subjectCode = subjectCode;
	}
	
	
	public void createAssignment(Assignment Ass){
		myAss.add(Ass);
	}
	
	public void deleteAssignment(String name){

	}

}
