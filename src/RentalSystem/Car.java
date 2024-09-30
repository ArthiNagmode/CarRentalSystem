package RentalSystem;

  

	public class Car {
	    private String licensePlate;
	    private String model;
	    private boolean isAvailable;

	    public Car(String licensePlate, String model) {
	        this.licensePlate = licensePlate;
	        this.model = model;
	        this.isAvailable = true;  // All cars are available initially
	    }

	    public String getLicensePlate() {
	        return licensePlate;
	    }

	    public String getModel() {
	        return model;
	    }

	    public boolean isAvailable() {
	        return isAvailable;
	    }

	    public void setAvailable(boolean available) {
	        isAvailable = available;
	    }

	    @Override
	    public String toString() {
	        return "Car{" +
	                "licensePlate='" + licensePlate + '\'' +
	                ", model='" + model + '\'' +
	                ", isAvailable=" + isAvailable +
	                '}';
	    }

		 
	}
 

