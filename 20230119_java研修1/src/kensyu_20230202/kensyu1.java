package kensyu_20230202;

import java.util.Arrays;
import java.util.Scanner;

public class kensyu1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] input = ((String)sc.nextLine()).split(" ");
		Arrays.sort(input);
		int num1=0,num2=0;
		num1 += Integer.valueOf(input[0])+Integer.valueOf(input[1]);
		num2 += Integer.valueOf(input[2]);
/*
		for (int i=0; i < input.length; i++) {
			if(i==0 || i==1) {
				num1 += Integer.valueOf(input[i]);
			}else {
				num2 += Integer.valueOf(input[i]);
			}
		}
		*/
		if(num1 == num2) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		sc.close();
	}

}
