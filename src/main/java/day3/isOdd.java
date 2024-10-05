package day3;
import java.util.*;
import java.math.*;
public class isOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int result=isOddorNot(Math.abs(num));
		System.out.println(result);

	}
	public static int isOddorNot(int num) {
		if(num%2!=0) {
			return 2;
		}
		else {
			return 1;
		}
	}

}
