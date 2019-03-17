package cn.amos.factory.abstractfactory.haier;

import cn.amos.factory.abstractfactory.Fan;

public class HaierFan implements Fan {
	@Override
	public void blow() {
		System.out.println("haier blow");
	}
}
