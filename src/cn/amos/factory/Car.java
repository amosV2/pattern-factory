package cn.amos.factory;

public class Car implements Vehicle {
	@Override
	public void forward() {
		System.out.println("car forward");
	}
}
