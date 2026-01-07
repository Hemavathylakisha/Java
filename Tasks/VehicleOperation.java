package Tasks;
class Vehicle{
	public void start() {
		System.out.println("Car started.........");
	}
	public void stop() {
		System.out.println("Car stopped.........");
	}
}
class Car extends Vehicle{
	public void playMusic() {
		System.out.println("Music is playing.........");
	}
}
class VehicleThread extends Thread{
	Car ob;
	VehicleThread(Car ob){
		this.ob=ob;
	}
	public void run() {
		ob.start();
		ob.playMusic();
		ob.stop();
	}
}
public class VehicleOperation {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Car car=new Car();
		VehicleThread ob=new VehicleThread(car);
		
		ob.start();
		
	}

}
