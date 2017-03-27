package workshop1;

public class Test {
	 public static void main(String[] args)
	    {
		 Subject lol = new ConcreteSubject();
		 Subject lolw = new ConcreteSubject();
     
          Observer observer1 = new ConcreteObserver();
         
   
          lol.registerObserver(observer1);
          lolw.registerObserver(observer1);
              
             
     
         lol.NotifyObserver("asdjasda");
         lolw.NotifyObserver("1");
         
 }
}
