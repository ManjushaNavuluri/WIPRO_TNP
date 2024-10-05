package day3;
import java.util.*;
import java.math.*;
public class SumLastDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int res=Sum(num1,num2);
        System.out.println(res);
	}
	public static int Sum(int num1,int num2) {
		return Math.abs(num1%10)+Math.abs(num2%10);
	}

}
