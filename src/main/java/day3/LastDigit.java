package day3;
import java.util.*;
import java.math.*;
public class LastDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int res=LastDigitNumber(Math.abs(num));
		System.out.println(res);

	}
	public static int LastDigitNumber(int num) {
		if(num>10) {
			num=num%10;
			return num;
		}
		else {
			return -1;
		}
	}

}
