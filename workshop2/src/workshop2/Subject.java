package workshop2;



import java.util.ArrayList;

public class Subject {
	String name;
	String subjectCode;
	ArrayList<Assissment> myAss = new ArrayList<Assissment>();
	
//	public Subject(String name, String subjectCode){
//		this.name = name;
//		this.subjectCode = subjectCode;
//	}
	
public void createAssignment(Assissment Ass){
	myAss.add(Ass);
}



public void deleteAssignment(String name){
//	for(Assissment wantedAss: myAss){
//		if( wantedAss.name.equals(name)){
//			myAss.remove(wantedAss);
//		}
//}

}
}


