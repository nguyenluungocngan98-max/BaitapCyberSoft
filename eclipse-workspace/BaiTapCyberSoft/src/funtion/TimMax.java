package funtion;

import java.util.Scanner;

public class TimMax {
	public static int timSoLonNhat(int a, int b, int c) {
		int max = a;
		if(b > max) {
			max = b;
		}
		if(c > max) {
			max = c;
		}
		return max;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.printf("Nhap vao so a:");
		int a = Integer.parseInt(scan.nextLine());
		System.out.printf("Nhap vao so b:");
		int b = Integer.parseInt(scan.nextLine());
		System.out.printf("Nhap vao so c:");
		int c = Integer.parseInt(scan.nextLine());
		
		int kQua = timSoLonNhat(a, b, c);
		System.out.println("Max la: " + kQua);

	}
	
}
