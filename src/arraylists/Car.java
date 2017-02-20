package arraylists;

public class Car {
	private String registrationNumber;
	
	public Car(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	
	@Override
	public String toString() {
		return this.registrationNumber;
	}
	
}
