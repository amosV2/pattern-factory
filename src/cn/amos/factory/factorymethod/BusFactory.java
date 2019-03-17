package cn.amos.factory.factorymethod;

import cn.amos.factory.Bus;
import cn.amos.factory.Vehicle;

public class BusFactory implements VehicleFactory {

	public Vehicle create(){
		return new Bus();
	}

}
