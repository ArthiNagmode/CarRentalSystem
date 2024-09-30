package RentalSystem;

public class Rental {
 
	private Car car;
	
	private Customer customer;
	
	private String rentalDate;
    private String returnDate;

    public Rental(Car car, Customer customer, String rentalDate, String returnDate) {
        this.car = car;
        this.customer = customer;
        this.rentalDate = rentalDate;
        this.returnDate = returnDate;
    }
 

    public Customer getCustomer() {
        return customer;
    }

    public String getRentalDate() {
        return rentalDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    @Override
    public String toString() {
        return "Rental{" +
                "car=" + car +
                ", customer=" + customer +
                ", rentalDate='" + rentalDate + '\'' +
                ", returnDate='" + returnDate + '\'' +
                '}';
    }

	public Car getCar() {
		// TODO Auto-generated method stub
		return null;
	}
}