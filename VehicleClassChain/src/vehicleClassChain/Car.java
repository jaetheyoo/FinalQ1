package vehicleClassChain;

public class Car extends Vehicle implements VehicleInterface {

	private int NumberOfDoors;

	public Car() {

	}

	public int getNumberOfDoors() {
		return NumberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		NumberOfDoors = numberOfDoors;
	}

	public void transferOwnership(Person newOwner) {
		this.setOwner(newOwner);
	}
}
