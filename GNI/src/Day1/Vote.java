package Day1;
import java.util.Scanner;
public class Vote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int a;
       a=sc.nextInt();
       if(a<18) {
    	   System.out.println("Not eligible to vote");
       }
       else {
    	   System.out.println("Eligible");
       }
	}

}
