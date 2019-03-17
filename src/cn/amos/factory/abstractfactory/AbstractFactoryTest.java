package cn.amos.factory.abstractfactory;

import cn.amos.factory.abstractfactory.haier.HaierFactory;
import cn.amos.factory.abstractfactory.midea.MideaFactory;

public class AbstractFactoryTest {

	public static void main(String[] args) {
		ApplianceFactory factory = new MideaFactory();
		factory.createWasher().wash();
		factory.createFan().blow();
		factory = new HaierFactory();
		factory.createFan().blow();
	}

}
