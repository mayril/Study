package 전략패턴;

public class Person {
	private DoSomething doSomething;
	private Eating eating;
	
	public void daily() {
		doSomething.doSomething();
		eating.eating();
	}
}
