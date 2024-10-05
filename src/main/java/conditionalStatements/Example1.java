package conditionalStatements;
import java.util.*;
public class Example1 {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		if(N>0) {
			System.out.println("Positive");
		}
		else if(N<0) {
			System.out.println("Negative");
		}
		else {
			System.out.println("Zero");
		}
	}

}
