package 전략패턴;

public class Student {
	private DoSomething doStudy = new DoStudy();
	private Eating eatCafeteria = new EatCafeteria();
	public void daily() {
		doStudy.doSomething();
		eatCafeteria.eating();
	}
}