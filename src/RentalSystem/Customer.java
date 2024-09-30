package RentalSystem;

public class Customer {
 
	private String name;
    private String drivingLicenseNumber;

    public Customer(String name, String drivingLicenseNumber) {
        this.name = name;
        this.drivingLicenseNumber = drivingLicenseNumber;
    }

    public String getName() {
        return name;
    }

    public String getDrivingLicenseNumber() {
        return drivingLicenseNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", drivingLicenseNumber='" + drivingLicenseNumber + '\'' +
                '}';
    }
}
	 
	 
	
	
