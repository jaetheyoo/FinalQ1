package vehicleClassChain;

public class MotorCycle extends Vehicle implements VehicleInterface {

	private boolean hasSideCar;

	public MotorCycle() {

	}

	public boolean isHasSideCar() {
		return hasSideCar;
	}

	public void setHasSideCar(boolean hasSideCar) {
		this.hasSideCar = hasSideCar;
	}

	public void transferOwnership(Person newOwner) {
		this.setOwner(newOwner);
	}
}
