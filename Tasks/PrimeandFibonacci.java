package Tasks;

public class PrimeandFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread PrimeThread=new Thread(()->{
			int num=13;
			boolean isPrime=true;
			for(int i=2;i<=num;i++) {
				if(num%2==0) {
					isPrime=false;
					break;
				}
			}
			System.out.println("Prime num: " + isPrime);
		});
		
		Thread FibonacciThread=new Thread(()->{
			int a=0, b=1;
			System.out.println("Fibonacci series:");
			for(int i=1;i<=10;i++) {
				System.out.println(a+" ");
				int c=a+b;
				a=b;
				b=c;
			}
			System.out.println();
		});
		
		Thread MaxThread=new Thread(()->{
			int[] arr= {10,40,34,20,60,90};
			int max=arr[0];
			
			for(int num:arr) {
				if(num>arr[0]) {
					max=num;
				}
			}
			System.out.println("Find maximum: " + max);
		});
		
		Thread DuplicateThread=new Thread(()->{
			int[] arr= {1,3,4,4,5,6,7};
			
			for(int i=0; i<=arr.length;i++) {
				for(int j=i+1; j<arr.length; j++) {
					if(arr[i]==arr[j]) {
						System.out.println(arr[i]+ " ");
					}
				}
			}
			System.out.println();
		});
		
		Thread SortThread=new Thread(()->{
			int[] arr= {20,19,47,32,11,2};
			
			for(int i=0;i<arr.length;i++) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]>arr[j]) {
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
			System.out.println("Sorted array:");
			for(int num:arr) {
				System.out.println(num + " ");
			}
			System.out.println();
		});
		
		PrimeThread.start();
		FibonacciThread.start();
		MaxThread.start();
		DuplicateThread.start();
		SortThread.start();
	}

}
