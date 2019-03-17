package cn.amos.factory.factorymethod;

public class FactoryMethodTest {

	public static void main(String[] args) {
		CarFactory carFactory = new CarFactory();
		carFactory.create().forward();
		BusFactory busFactory = new BusFactory();
		busFactory.create().forward();
	}

}
