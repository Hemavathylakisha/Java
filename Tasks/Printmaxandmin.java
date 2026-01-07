package Tasks;
class FindMax extends Thread{
	int[] arr;
   FindMax(int[] arr) {
		this.arr=arr;
	}
	public void run() {
		int max=arr[0];
		for(int num: arr) {
			if(num>max) {
				max=num;
			}
		}
		System.out.println("Max value: " +max);
	}
}
class Findmin extends Thread{
   int[] arr;
	Findmin(int[] arr) {
		this.arr=arr;
	}
	public void run() {
		int min=arr[0];
		for(int num: arr) {
			if(num<min) {
				min=num;
			}
		}
		System.out.println("Min value: " +min);
	}
}
public class Printmaxandmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {20,40,32,10,19,21};
		Findmin minThread=new Findmin(nums);
		FindMax maxThread=new FindMax(nums);
		maxThread.start();
		minThread.start();
	}

}
