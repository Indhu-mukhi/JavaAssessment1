package Day1;
import java.util.Scanner;
public class Salary {
  public static void main (String args[]){
	Scanner sc=new Scanner(System.in);
	int bs;
	float ta,da;
	bs=sc.nextInt();
	if(bs>=10000) {
		 da=bs*0.4f;
		 ta=bs*0.3f;
	}
	else {
		da=bs*0.3f;
		ta=bs*0.2f;
	}
	System.out.println("Gross Salary:"+(bs+da+ta));
  }
}
