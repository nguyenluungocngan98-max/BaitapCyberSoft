package hàm;

import java.util.Scanner;

public class QuanLyTuyenSinh {
	static final float AREA_A = 2.0f;
	static final float AREA_B = 1.0f;
	static final float AREA_C = 0.5f;
	static final float AREA_X = 0.0f;
	
	static final float OBJECT_1 = 2.5f;
	static final float OBJECT_2 = 1.5f;
	static final float OBJECT_3 = 1.0f;
	static final float OBJECT_0 = 0.0f;
	
	static final int SO_MON = 3;
	
	public static char chonKhuVuc(Scanner scan) {
		System.out.println("Nhập khu vực của thí sinh: ");
		System.out.println("A. Khu vực A ");
		System.out.println("B. Khu vực B ");
		System.out.println("C. Khu vực C ");
		System.out.println("X. Không có khu vực ");
		System.out.printf("Lựa chọn của bạn : ");
		char khuVuc = scan.next().toUpperCase().charAt(0); //cho phep nhap chu thuong va doi thanh in hoa
		return khuVuc;
	}
	
	public static int chonDoiTuong(Scanner scan) {
		System.out.println("Nhập đối tượng của thí sinh ");
		System.out.println("1. Đối tượng 1");
		System.out.println("2. Đối tượng 2");
		System.out.println("3. Đối tượng 3");
		System.out.println("0. Không có đối tượng");
		System.out.printf("Lựa chọn của bạn : ");
		int doiTuong = scan.nextInt();
		return doiTuong;
	}
	
	public static float nhapDiemChuan(Scanner scan) {
		float diem=0;
		System.out.println("Mời bạn nhập điểm chuẩn : ");
		diem = scan.nextFloat();
		return diem;
	}
	
	public static float nhapDiem3mon(Scanner scan) {
		System.out.println("Mời bạn nhập điểm môn thứ nhất");
		float diem1 = scan.nextFloat();
		System.out.println("Mời bạn nhập điểm môn thứ hai");
		float diem2 = scan.nextFloat();
		System.out.println("Mời bạn nhập điểm môn thứ ba");
		float diem3 = scan.nextFloat();
		
		if(diem1 == 0 || diem2 == 0 || diem3 == 0) {
			System.out.println("Có 1 môn = 0 => RỚT ");
			return -1;
		}
		return diem1 + diem2 + diem3;
	}
	
	public static float tinhDiemUuTien(char khuVuc, int doiTuong) {
		float diemKV = 0;
		float diemDT =0;
		switch(khuVuc) {
		case 'A':
			diemKV = AREA_A;
			break;
		case 'B':
			diemKV = AREA_B;
			break;
		case 'C':
			diemKV = AREA_C;
			break;
			default:
				diemKV = AREA_X;
				break;
		}
		switch(doiTuong) {
		case 1:
			diemDT = OBJECT_1;
			break;
		case 2:
			diemDT = OBJECT_2;
			break;
		case 3:
			diemDT = OBJECT_3;
			break;
			default:
				diemDT = OBJECT_0;
				break;
		}
		
		return diemKV + diemDT;
	}
	
	public static void kiemTraKetQua(float tong3Mon, float diemChuan, float diemUuTien) {
		if(tong3Mon == -1) {
			return;
		}
		float tongDiem = tong3Mon + diemUuTien;
		
		if(tongDiem >= diemChuan) {
			System.out.println("Bạn đã đậu với tổng điểm: " + tongDiem );
		} else {
			System.out.println("Bạn đã rớt với tổng điểm: " + tongDiem );
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float tong3Mon = nhapDiem3mon(scan);
		char khuVuc = chonKhuVuc(scan);
		int doiTuong = chonDoiTuong(scan);
		float diemChuan = nhapDiemChuan(scan);
		
		
		float diemUuTien = tinhDiemUuTien(khuVuc, doiTuong);
		System.out.println("Điểm ưu tiên là : " + diemUuTien);
		
		kiemTraKetQua(tong3Mon, diemChuan, diemUuTien);
		
		scan.close();
		
		
	}
	
	
	
}
