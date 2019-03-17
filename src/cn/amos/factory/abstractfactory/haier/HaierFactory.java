package cn.amos.factory.abstractfactory.haier;

import cn.amos.factory.abstractfactory.AirConditioner;
import cn.amos.factory.abstractfactory.ApplianceFactory;
import cn.amos.factory.abstractfactory.Fan;
import cn.amos.factory.abstractfactory.Washer;

public class HaierFactory implements ApplianceFactory {

	@Override
	public AirConditioner createAirConditioner() {
		return null;
	}

	@Override
	public Fan createFan() {
		return new HaierFan();
	}

	@Override
	public Washer createWasher() {
		return null;
	}
}
