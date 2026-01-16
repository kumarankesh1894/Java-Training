package Encapsulation;

public class VehicleSpeedControl {
		private int speed;
		public VehicleSpeedControl(int speed) {
			// TODO Auto-generated constructor stub
			this.speed = speed;
		}
		
		public void increaseSpeed() {
			if(speed<=200) {
				++speed;
				System.out.println("Speed increased: "+speed);
			}else {
				System.out.println("Maximum Speed limit reached. "+speed);
			}
		}
		public void decreaseSpeed() {
			if(speed>=1) {
				--speed;
				System.out.println("Speed decreased: "+speed);
			}else {
				System.out.println("Minimum Speed limit reached. "+speed);
			}
		}
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VehicleSpeedControl vehicle = new VehicleSpeedControl(1);
		vehicle.increaseSpeed();
		
		vehicle.decreaseSpeed();
		
	}

}
