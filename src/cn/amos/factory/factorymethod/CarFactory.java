package cn.amos.factory.factorymethod;

import cn.amos.factory.Car;
import cn.amos.factory.Vehicle;

public class CarFactory implements VehicleFactory {

	public Vehicle create(){
		return new Car();
	}

}
