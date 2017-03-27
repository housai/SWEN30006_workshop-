package workshop1;

public interface Subject {
	public  void registerObserver(Observer observer);
	public  void deregisterObserver(Observer observer);
	public  void NotifyObserver(String str);
	

}
