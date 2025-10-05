package funtion;

import java.util.Scanner;

public class Sum {
	public static int sum(int a, int b, int c) {
		int total = 0;
		total = a + b +c;
		return total;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.printf("Nhap vao so thu nhat: ");
		int so1 = Integer.parseInt(scan.nextLine());
		System.out.printf("Nhap vao so thu hai: ");
		int so2 = Integer.parseInt(scan.nextLine());
		System.out.printf("Nhap vao so thu ba: ");
		int so3 = Integer.parseInt(scan.nextLine());
		int result = sum(so1, so2, so3);
		System.out.println("Tong ba so ban vua nhap la: " + result);
	}

}
