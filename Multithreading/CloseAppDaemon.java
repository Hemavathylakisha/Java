package Multithreading;
class Download extends Thread{
	int a=10;
	public void appdownload() {
		for(int i=1; i<=10; i++) {
		try {
			Thread.sleep(1000);
		System.out.println("Downloading in progress..."+ a + "%");
		a+=10;
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		}
	}
	public void run() {
		appdownload();
	}
}
public class CloseAppDaemon{
	void close(){
		System.out.println("Close the app");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CloseAppDaemon ob=new CloseAppDaemon();
		Download obj=new Download();
		obj.setDaemon(true);
		obj.start();
		for(int i=1;i<=5;i++) {
		try {	
			Thread.sleep(1000);
			if(i==5) {
		ob.close();
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		}
	}

}
