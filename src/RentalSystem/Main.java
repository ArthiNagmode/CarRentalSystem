package RentalSystem;

public class Main {

	public static void main(String[] args) {
		CarRentalSystem rentalSystem = new CarRentalSystem();

        // Add cars to the system
        rentalSystem.addCar(new Car("ABC123", "Toyota Corolla"));
        rentalSystem.addCar(new Car("XYZ789", "Honda Civic"));

        // Add customers to the system
        rentalSystem.addCustomer(new Customer("John Doe", "DL12345"));
        rentalSystem.addCustomer(new Customer("Jane Smith", "DL67890"));

        // Rent a car
        rentalSystem.rentCar("ABC123", "DL12345", "2024-09-30", "2024-10-05");

        // Display available cars
        System.out.println("\nAvailable cars:");
        rentalSystem.displayAvailableCars();

        // Display all rentals
        System.out.println("\nRentals:");
         rentalSystem.displayRentals();

        // Return a car
        rentalSystem.returnCar("ABC123");

        // Display available cars after returning
        System.out.println("\nAvailable cars after return:");
        rentalSystem.displayAvailableCars();
    }

	

}
