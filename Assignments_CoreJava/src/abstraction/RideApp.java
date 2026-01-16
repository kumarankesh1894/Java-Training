package abstraction;

public class RideApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			RideCab ride;
			//Auto Ride Object Initialization
			ride = new AutoRide();
			System.out.println("Ride Details: ");
			ride.rideDetails();
			System.out.println("\nThankyou for Auto Booking....\nRider will reach in 5 minutes.\n\nRide Completed........");
			ride.calculateFare(12);
			System.out.println("....................................................................................");
			
			//Bike Ride Object Initialization
			ride = new BikeRide();
			System.out.println("\nRide Details: ");
			ride.rideDetails();
			System.out.println("\nThankyou for Bike Booking....\nRider will reach in 5 minutes.\n\nRide Completed........");
			ride.calculateFare(12);
			
			//Car Ride Object Initialization
	}

}
