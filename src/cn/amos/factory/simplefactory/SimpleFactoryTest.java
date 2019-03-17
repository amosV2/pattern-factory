package cn.amos.factory.simplefactory;

import cn.amos.factory.Bus;
import cn.amos.factory.Car;
import cn.amos.factory.Vehicle;

public class SimpleFactoryTest {

	public static void main(String[] args) {
		VehicleFactory vehicleFactory = new VehicleFactory();
		Vehicle bus = vehicleFactory.createVehicle(Bus.class);
		Vehicle car = vehicleFactory.createVehicle(Car.class);
		bus.forward();
		car.forward();
	}

}
