package Encapsulation;

public class MobileBattery {

	private int batteryLevel;
	MobileBattery(int batteryLevel) {
		// TODO Auto-generated constructor stub
		if(batteryLevel > 0 && batteryLevel <= 100) {
		this.batteryLevel = batteryLevel;
		}else  {
			this.batteryLevel=0;
		}
	}
	
	public void chargeBattery(int chargingAmount) {
		if(chargingAmount>0) {
			batteryLevel+=chargingAmount;
			if(batteryLevel>100) {
				batteryLevel=100;
			}
			System.out.println("Initial Battery Level is "+batteryLevel+"%");
		}
	}
	public void useBattery(int useAmount) {
		if(useAmount>0) {
			batteryLevel-=useAmount;
			if(batteryLevel<0) {
				batteryLevel=0;
			}
		}System.out.println("The Battery Percentage after used "+batteryLevel+"%");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MobileBattery mobile = new MobileBattery(80);
		mobile.chargeBattery(10);
		mobile.useBattery(50);
		
		
	}

}
