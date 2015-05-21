package VehicleTest;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import vehicleClassChain.Car;
import vehicleClassChain.MotorCycle;
import vehicleClassChain.Person;
import vehicleClassChain.Truck;

public class TestVehicleChain {

	private Map<UUID, Object> hashMap = new HashMap<>();
	private Person person;
	@Before
	public void setUp() throws Exception {
		Person a = new Person("Jae", "Yoo");
		Car car = new Car();
		car.setOwner(a);
		car.setNumberOfDoors(4);

		Truck truck = new Truck();
		truck.setOwner(a);
		truck.setNumberOfAxels(2);

		Person b = new Person("Other", "Person");
		this.person = b;
		truck.transferOwnership(b);

		MotorCycle motorcycle = new MotorCycle();
		motorcycle.setHasSideCar(false);

		hashMap.put(a.getPersonID(), a);
		hashMap.put(UUID.randomUUID(), car);
		hashMap.put(UUID.randomUUID(), truck);
		hashMap.put(UUID.randomUUID(), motorcycle);
		hashMap.put(b.getPersonID(), b);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertTrue("The hashMap has 5 instances: ", hashMap.size()==5);
		assertTrue("Person B UUID returns personB: ", hashMap.get(person.getPersonID())==person);
	}

}
