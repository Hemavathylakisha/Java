package PracticePackage;
import java.util.*;

public class OneDarrayDemo {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("You entered:");
        for (int num : arr) {
            System.out.println(num);
        }
	}

}
