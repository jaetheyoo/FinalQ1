package vehicleClassChain;

public class Truck extends Vehicle implements VehicleInterface {

	private int NumberOfAxels;

	public Truck() {

	}

	public int getNumberOfAxels() {
		return NumberOfAxels;
	}

	public void setNumberOfAxels(int numberOfAxels) {
		NumberOfAxels = numberOfAxels;
	}

	public void transferOwnership(Person newOwner) {
		this.setOwner(newOwner);
	}
}
