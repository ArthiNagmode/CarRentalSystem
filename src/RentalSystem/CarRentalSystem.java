package RentalSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
 

public class CarRentalSystem {
	 
	    private List<Car> cars;
	    private List<Customer> customers;
	    private List<Rental> rentals;

	    public CarRentalSystem() {
	        this.cars = new ArrayList<>();
	        this.customers = new ArrayList<>();
	        this.rentals = new ArrayList<>();
	    }

	    // Add car to the system
	    public void addCar(Car car) {
	        cars.add(car);
	    }

	    // Add customer to the system
	    public void addCustomer(Customer customer) {
	        customers.add(customer);
	    }

	    // Rent a car to a customer
	    public void rentCar(String licensePlate, String drivingLicenseNumber, String rentalDate, String returnDate) {
	        Optional<Car> car = cars.stream().filter(c -> c.getLicensePlate().equals(licensePlate) && c.isAvailable()).findFirst();
	        Optional<Customer> customer = customers.stream().filter(c -> c.getDrivingLicenseNumber().equals(drivingLicenseNumber)).findFirst();

	        if (!car.isPresent()) {
	            System.out.println("Car rental failed. Car with license plate " + licensePlate + " not found or is unavailable.");
	            return;
	        }

	        if (!customer.isPresent()) {
	            System.out.println("Car rental failed. Customer with driving license " + drivingLicenseNumber + " not found.");
	            return;
	        }

	        // If both car and customer are valid, proceed with the rental
	        car.get().setAvailable(false);  // Mark car as unavailable
	        
	        
	        System.out.println("Car rented successfully to " + customer.get().getName());
	    }

	    // Return a car
	    public void returnCar(String licensePlate) {
	    	 Optional<Rental> rental = rentals.stream()
	    		        .filter(r -> r.getCar().getLicensePlate().equals(licensePlate))
	    		        .findFirst();
	        if (rental.isPresent()) {
	            
	            System.out.println("Car returned successfully.");
	        } else {
	            System.out.println("Car return failed. Rental for car with license plate " + licensePlate + " not found.");
	        }
	    }

	    // Display all available cars
	    public void displayAvailableCars() {
	        cars.stream()
	            .filter(Car::isAvailable)
	            .forEach(System.out::println);
	    }

	    // Display all rentals
	    public void displayRentals() {
	        rentals.forEach(System.out::println);
	    }
	}

