package com.ssafy.generic1;

public class NumberBox<T extends Number> {
	//가변인자 ... 이건 제일뒤에
	public void addSomes(T... ts) {
		double sum = 0;
		for (T t : ts) {
			sum += t.doubleValue();
		}
		System.out.printf("총 합은: %f%n", sum);
	}
}
