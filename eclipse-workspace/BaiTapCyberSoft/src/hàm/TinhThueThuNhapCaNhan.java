package hàm;

import java.util.Scanner;

public class TinhThueThuNhapCaNhan {
	static final int TAX_60 = 5;
	static final int TAX_60_TO_120 = 10;
	static final int TAX_120_TO_216 = 15;
	static final int TAX_216_TO_384 = 20;
	static final int TAX_384_TO_624 = 25;
	static final int TAX_624_TO_960 = 30;
	static final int TAX_OVER_960 = 35;
	
	static final float SUBTRACT = 4.0f;
	static final float MULTIPLIER = 1.6f;
	
	public static String nhapTen(Scanner sc) {
		System.out.printf("Nhap Ho va Ten vao: ");
		String hoTen = sc.nextLine();
		System.out.println("Ho ten da nhap: " + hoTen);
		return hoTen;
	}
	
	public static float nhapThuNhap(Scanner sc) {
		System.out.printf("Nhap tong thu nhap nam (trieu dong): ");
		float thuNhap = Float.parseFloat(sc.nextLine());
		return thuNhap;
	}
	
	public static int nhapNguoiPhuThuoc(Scanner sc) {
		System.out.printf("Nhap so nguoi phu thuoc: ");
		int nguoiPhuThuoc = Integer.parseInt(sc.nextLine());
		return nguoiPhuThuoc;
	}
	public static int kiemTraThue(float thuNhap, int nguoiphuThuoc) {
		float income = thuNhap - SUBTRACT - nguoiphuThuoc*MULTIPLIER;
		int tax;
		if(income <= 60) {
			tax = TAX_60;
		} else if(income > 60 && income <= 120) {
			tax = TAX_60_TO_120;
		} else if(income > 120 && income <= 216) {
			tax = TAX_120_TO_216;
		} else if(income > 216 && income <= 384) {
			tax = TAX_216_TO_384;
		} else if(income > 384 && income <= 624) {
			tax = TAX_384_TO_624;
		} else if(income > 624 && income <= 960) {
			tax = TAX_624_TO_960;
		} else {
			tax = TAX_OVER_960;
		}
		System.out.println("===KET QUA TINH THUE===");
		System.out.println("Thu nhap chiu thue: " + income);
		System.out.println("Thue suat phai chiu: " + tax + "%");
		return tax;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		nhapTen(sc);
		float thuNhap = nhapThuNhap(sc);
		int nguoiPhuThuoc = nhapNguoiPhuThuoc(sc);
		
		kiemTraThue(thuNhap, nguoiPhuThuoc);
		
		sc.close();
		
	}
	

}
