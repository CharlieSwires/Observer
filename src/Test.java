import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

class Test {

	@BeforeEach
	void setUp() throws Exception {
	}

	@org.junit.jupiter.api.Test
	void test() {
		ConcreteSubject sub = new ConcreteSubject();
		System.out.println("Initial nothing");
		sub.notifyObservers();
		System.out.println("One observer");
		Observer ob1 = new ConcreteObserver1();
		sub.registerObserver(ob1);
		sub.notifyObservers();
		System.out.println("Two observer");
		Observer ob2 = new ConcreteObserver2();
		sub.registerObserver(ob2);
		sub.notifyObservers();
		System.out.println("Two observer goodbye");
		sub.setSubject("Goodbye");
		sub.removeObserver(ob1);
		System.out.println("One observer goodbye");
		sub.notifyObservers();

	}

}
