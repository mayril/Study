package 전략패턴;

public class Employee {
	private DoSomething doWork = new DoWork();
	private Eating eatWelStory = new EatWelstory();
	public void daily() {
		doWork.doSomething();
		eatWelStory.eating();
	}
}