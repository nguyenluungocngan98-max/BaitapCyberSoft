package kienthuccannho;

import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		final float overTime = 1.5f;
		final int STANDARD_HOUR = 40;
		float hours;
		float salary;
		float rate;
		Scanner scan = new Scanner(System.in);
		System.out.printf("Nhap so gio lam viec: ");
		hours = Float.parseFloat(scan.nextLine());
		System.out.printf("Nhap so luong 1 gio: ");
		rate = Float.parseFloat(scan.nextLine());
		if(hours > STANDARD_HOUR) {
			salary = (STANDARD_HOUR * rate) + ((hours - STANDARD_HOUR) * (overTime*rate));
		} else {
			salary = hours * rate;
		}
		System.out.println("So tien luong can tra la: " + salary);
		scan.close();
	}

}
