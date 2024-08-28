package Day1;
import java.util.Scanner;
public class Marriage {
	public static void main(String args[]) {
		 Scanner sc=new Scanner(System.in);
		  int Mage,Fage;
		  System.out.println("Enter Male Age");
		  Mage=sc.nextInt();
		  System.out.println("Enter Female Age");
		  Fage=sc.nextInt();
		  if(Fage>21||Mage>25) {
			  System.out.println("He/She is Elgible for Marriage");
		  }
		 
		  else {
			  System.out.println("Not Elgible");
		  }
		  
	}

}
