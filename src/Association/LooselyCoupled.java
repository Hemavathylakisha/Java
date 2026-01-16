package Association;

//Loosely coupled achieved using Interface 
interface Database{
	void getConnection();
}
class Mysql implements Database{
	public Mysql(){
		System.out.println("Mysql created");
	}
	public void getConnection() {
		System.out.println("Mysql connected");
	}
}
class Postgre implements Database{
	public Postgre(){
		System.out.println("Postgre created");
	}
	public void getConnection() {
		System.out.println("Postgre connected");
	}
}
class Java{
	//Mysql mysql;
	Database database;
//	public Java(Mysql mysql) {
//		this.mysql=mysql;
//	}
	public Java(Database database) {
		this.database=database;
	}
	public void start() {
		//mysql.getConnection()
		database.getConnection();
	}
}
public class LooselyCoupled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Java java=new Java(new Postgre());
		java.start();
	}

}
