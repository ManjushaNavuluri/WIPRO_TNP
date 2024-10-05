package conditionalStatements;
import java.util.*;
public class Example2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		if(num1>num2) {
			System.out.println("Greater value is:"+num1);
		}
		else if(num1<num2) {
			System.out.println("Greater value is:"+num2);
		}
		else {
			System.out.println("Greater value is:"+num1);
		}
	}

}
