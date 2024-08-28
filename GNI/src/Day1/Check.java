package Day1;
import java.util.Scanner;
public class Check {
  public static void main(String args[]) {
	  Scanner sc=new Scanner(System.in);
	  int a;
	  a=sc.nextInt();
	  if(a<0) {
		  System.out.println("Entered number is negative");
	  }
	  else {
		  System.out.println("Entered number is positive");
	  }
  }
}
