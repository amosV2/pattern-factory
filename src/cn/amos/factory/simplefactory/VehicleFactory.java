package cn.amos.factory.simplefactory;

import cn.amos.factory.Vehicle;

public class VehicleFactory {

	public Vehicle createVehicle(Class clazz){
		try {
			if (clazz != null) {
				return (Vehicle) clazz.newInstance();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
