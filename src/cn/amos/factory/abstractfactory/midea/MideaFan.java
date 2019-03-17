package cn.amos.factory.abstractfactory.midea;

import cn.amos.factory.abstractfactory.Fan;

public class MideaFan implements Fan {
	@Override
	public void blow() {
		System.out.println("midea blow");
	}
}
