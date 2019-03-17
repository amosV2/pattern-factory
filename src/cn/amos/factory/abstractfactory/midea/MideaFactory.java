package cn.amos.factory.abstractfactory.midea;

import cn.amos.factory.abstractfactory.AirConditioner;
import cn.amos.factory.abstractfactory.ApplianceFactory;
import cn.amos.factory.abstractfactory.Fan;
import cn.amos.factory.abstractfactory.Washer;

public class MideaFactory implements ApplianceFactory {
	@Override
	public AirConditioner createAirConditioner() {
		return null;
	}

	@Override
	public Fan createFan() {
		return new MideaFan();
	}

	@Override
	public Washer createWasher() {
		return new MideaWasher();
	}
}
