package kienthuccannho;

import java.util.Scanner;

/*
 * boolean check = true;
 * boolean isLoop = false;
 * 
 * ! not-phu dinh
 * && and- va
 * || or-hoac
 * 
 * if(){
 * }
 * else{
 * }
 * 
 * 
 *
 */
public class Missions {

	public static void main(String[] args) {
//		final float interest = 0.015f;
//		float createCardBalance;
//		float payment;
//		float penalty = 0;
//		Scanner scan = new Scanner(System.in);
//		System.out.printf("Nhap vao so du the tin dung:");
//		createCardBalance = Float.parseFloat(scan.nextLine());
//		System.out.printf("Nhap vao so tien da thanh toan trong thang:");
//		payment = Float.parseFloat(scan.nextLine());
//		float balance = createCardBalance - payment;
//		if(balance > 0) {
//			penalty = (float) (balance * interest);
//		} 
//		System.out.println("Tien phat the tin dung chua thanh toan: " + penalty);
//		scan.close();
		
		int d1;
		int d2;
		int bigger;
		Scanner scan = new Scanner(System.in);
		System.out.printf("Nhap vao so thu nhat:");
		d1 = Integer.parseInt(scan.nextLine());
		System.out.printf("Nhap vao so thu hai:");
		d2 = Integer.parseInt(scan.nextLine());
		if(d1 < d2) {
			bigger = d2;
		} else {
			bigger = d1;
		}
		System.out.println("So lon nhat la: "+ bigger );
		
		scan.close();

	}

}
