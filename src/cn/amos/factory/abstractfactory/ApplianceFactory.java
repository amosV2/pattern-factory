package cn.amos.factory.abstractfactory;

public interface ApplianceFactory {

	AirConditioner createAirConditioner();

	Fan createFan();

	Washer createWasher();


}
