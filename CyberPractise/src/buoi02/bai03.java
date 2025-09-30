package buoi02;

import java.util.Scanner;

public class bai03 {

	public static void main(String[] args) {
		double toaDoTamxC;
		double toaDoTamyC;
		double banKinh;
		double toaDoDiemxM;
		double toaDoDiemyM;
		Scanner nhapVao = new Scanner(System.in);
		System.out.printf("Nhap vao toa do tam C xC:");
		toaDoTamxC = Double.parseDouble(nhapVao.nextLine());
		System.out.printf("Nhap vao toa do tam C yC:");
		toaDoTamyC = Double.parseDouble(nhapVao.nextLine());
		System.out.printf("Nhap vao ban kinh:");
		banKinh = Double.parseDouble(nhapVao.nextLine());
		System.out.printf("Nhap vao toa do diem M xM:");
		toaDoDiemxM = Double.parseDouble(nhapVao.nextLine());
		System.out.printf("Nhap vao toa do diem M yM:");
		toaDoDiemyM = Double.parseDouble(nhapVao.nextLine());
		
		double d = Math.sqrt(Math.pow((toaDoDiemxM - toaDoTamxC),2) + Math.pow((toaDoDiemyM - toaDoTamyC),2));
		if(d < banKinh) {
			System.out.println("M nam trong duong tron C()");
		} else if (d > banKinh) {
			System.out.println("M nam tren duong tron C()");
		} else {
			System.out.println("M nam ngoai duong tron C()");
		}
		nhapVao.close();

	}

}
