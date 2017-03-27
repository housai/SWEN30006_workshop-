package workshop1;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject{

	private List<Observer> list = new ArrayList<Observer>();

    public void registerObserver(Observer observer)
    {
        list.add(observer);
        
    }

    public void  deregisterObserver(Observer observer)
    {
        list.remove(observer);
    }

    public void NotifyObserver(String str)
    {
        
        for (Observer observer : list)
        {
        	observer.Mynotify(str);
        }
    }

	
}


