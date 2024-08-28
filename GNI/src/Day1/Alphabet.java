package Day1;
import java.util.Scanner;
public class Alphabet {
 public static void main(String args[]) {
	 Scanner sc=new Scanner(System.in);
	 char vo;
	 vo=sc.next().charAt(0);
	 if(vo=='a'||vo=='e'||vo=='i'||vo=='o'||vo=='u') {
		 System.out.println("Entered Alphabet is vowel");
	 }
	 else {
		 System.out.println("Entered Alphabet is consonants");
	 }
 }
}
