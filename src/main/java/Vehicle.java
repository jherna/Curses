public abstract class Vehicle {
	private int velocitatMAX;
	private Pilot pilot;

	public Vehicle(int vel) {
		velocitatMAX = vel;
	}

	public Pilot getPilot() {
		return pilot;
	}

	public void setPilot(Pilot pilot) {
		this.pilot = pilot;
	}

	public int getVelocitatMAX() {
		return velocitatMAX;
	}

	public void setVelocitatMAX(int velocitatMAX) {
		this.velocitatMAX = velocitatMAX;
	}
}
