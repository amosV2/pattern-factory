package cn.amos.factory.abstractfactory.midea;

import cn.amos.factory.abstractfactory.Washer;

public class MideaWasher implements Washer {
	@Override
	public void wash() {
		System.out.println("midea wash");
	}
}
