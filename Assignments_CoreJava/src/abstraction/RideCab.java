package abstraction;

public abstract class RideCab {
		public abstract void calculateFare(int distance);
		public void rideDetails() {
			
			System.out.println("price of AutoRide: 20rs per KM\nprice of BikeRide: 15rs per KM\nprice of CarRide: 50rs per km");
			
		}
}

class AutoRide extends RideCab{
	public void calculateFare(int distance) {
		int totalAmount = distance*20;
		System.out.println("Total Fare: "+totalAmount+"rs");
	}
}
class BikeRide extends RideCab{
	public void calculateFare(int distance) {
		int totalAmount = distance*15;
		System.out.println("Total Fare: "+totalAmount+"rs");
	}
}
class CarRide extends RideCab{
	public void calculateFare(int distance) {
		int totalAmount = distance*50;
		System.out.println("Total Fare: "+totalAmount+"rs");
	}
}
