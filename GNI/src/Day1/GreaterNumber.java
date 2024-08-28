package Day1;
import java.util.Scanner;
public class GreaterNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int a,b;
      a=sc.nextInt();
      b=sc.nextInt();
      if(a>b) {
    	  System.out.println("Maximum number is:"+a);
      }
      else {
    	  System.out.println("Maximum number is:"+b);
      }
	}

}
