package buoi02;

import java.util.Scanner;

public class bai01 {
	public static void main(String[] args) {
		final int N = 5;
		
		int firstNum;
		int secondNum;
		int thirdNum;
		int fourNum;
		int fifthNum;
		
		int sum = 0;
		Scanner nhapSo = new Scanner(System.in);
		
		System.out.printf("Nhap vao so thu nhat: ");
		firstNum = Integer.parseInt(nhapSo.nextLine());
		
		System.out.printf("Nhap vao so thu hai: ");
		secondNum = Integer.parseInt(nhapSo.nextLine());
		
		System.out.printf("Nhap vao so thu ba: ");
		thirdNum = Integer.parseInt(nhapSo.nextLine());
		
		System.out.printf("Nhap vao so thu bon: ");
		fourNum = Integer.parseInt(nhapSo.nextLine());
		
		System.out.printf("Nhap vao so thu nam: ");
		fifthNum = Integer.parseInt(nhapSo.nextLine());
		
		sum += firstNum + secondNum + thirdNum + fourNum + fifthNum;
		double average = (float)sum/N;
		System.out.println("Gia tri trung binh 5 so ban nhap la:" + average);
		
		nhapSo.close();
	}

}
