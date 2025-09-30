package buoi02;

import java.util.Scanner;

public class bai02 {

	public static void main(String[] args) {
		final double tiGia = 23.500;
		double soTien;
		Scanner nhapTien = new Scanner(System.in);
		System.out.printf("Nhap so tien don gia USD:");
		soTien = Integer.parseInt(nhapTien.nextLine());
		double tienDaDoi = soTien * tiGia;
		System.out.println("So tien theo don vi VND la:" + tienDaDoi + "VNĐ");
		nhapTien.close();
	}

}
