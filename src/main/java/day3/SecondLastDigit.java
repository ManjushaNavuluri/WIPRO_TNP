package day3;

import java.util.Scanner;

public class SecondLastDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int res=SecondLastDigitNumber(Math.abs(num));
		System.out.println(res);

	}
	public static int SecondLastDigitNumber(int num) {
		if(num>10) {
			num=(num/10)%10;
			return num;
		}
		else {
			return -1;
		}
	}

}
