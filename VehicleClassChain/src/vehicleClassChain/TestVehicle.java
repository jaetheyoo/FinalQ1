package vehicleClassChain;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class TestVehicle {

	public static void main(String[] args) {

		Person a = new Person("Jae", "Yoo");
		Car car = new Car();
		car.setOwner(a);
		car.setNumberOfDoors(4);

		Truck truck = new Truck();
		truck.setOwner(a);
		truck.setNumberOfAxels(2);

		Person b = new Person("Other", "Person");
		truck.transferOwnership(b);

		MotorCycle motorcycle = new MotorCycle();
		motorcycle.setHasSideCar(false);

		Map<UUID, Object> hashMap = new HashMap<>();
		hashMap.put(a.getPersonID(), a);
		hashMap.put(UUID.randomUUID(), car);
		hashMap.put(UUID.randomUUID(), truck);
		hashMap.put(UUID.randomUUID(), motorcycle);
		hashMap.put(b.getPersonID(), b);
	}

}
