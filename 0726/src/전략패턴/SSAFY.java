package 전략패턴;

public class SSAFY {
	private DoSomething doStudy = new DoStudy();
	private Eating eatWelStory = new EatWelstory();
	public void daily() {
		doStudy.doSomething();
		eatWelStory.eating();
	}
}
