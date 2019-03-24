import java.util.ArrayList;

public class ConcreteSubject implements Subject {

	private ArrayList<Observer> observers = new ArrayList<Observer>();
	protected String subject = "Hello";
	
	public ConcreteSubject() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
		
	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
		
	}

	@Override
	public void notifyObservers() {
		for(Observer ob: observers) {
			ob.update(subject);
		}
		
	}
	
	public void setSubject(String sub) {
		this.subject =sub;
		notifyObservers();
	}

}
