package funtion;

import java.util.Scanner;

/*
 * B1: Tạo hàm cho chọn 1 trong 3 loại xe(switch case)
B2 : tạo hàm tính tiền của loại 1
B3 : tính tiền km đầu km * 8000
B4: tính tiền km 1-19 tiếp theo: km*8000 + (km-1)*7500
B5 : tính tiền km 19 trở lên : km*8000 + 18*7500 + (km-19)*7000
B6 :tính thời gian chờ: thoigianCho = 3 -> không tính tiền 
B7: thời gian chờ : thoigianChờ > 3 ->( tgcho - 3) * 2000
Tính tổng tiền đi được sum= tienXe + tienChoXe.
B8 : hàm main
B9 : cho nhập biến km, tgCho, lựa chọn xe 
B10  in kết quả

 */

public class TinhtienGrab {
	static final int GRAB_CAR_1KM = 8000;
	static final int GRAB_SUV_1KM = 9000;
	static final int GRAB_BLACK_1KM = 10000;
	
	static final int GRAB_CAR_1_TO_19KM = 7500;
	static final int GRAB_SUV_1_TO_19KM = 8500;
	static final int GRAB_BLACK_1_TO_19KM = 9500;
	
	static final int GRAB_CAR_OVER_19KM = 7000;
	static final int GRAB_SUV_OVER_19KM = 8000;
	static final int GRAB_BLACK_OVER_19KM = 9000;
	
	static final int GRAB_CAR_WAIT = 2000;
	static final int GRAB_SUV_WAIT = 3000;
	static final int GRAB_BLACK_WAIT= 3500;
	
	public static int chonLoaiGrab(Scanner scan) {
		int loai;
		System.out.println("Vui long chon loai grab");
		System.out.println("1. Grab Car");
		System.out.println("2. Grab Suv");
		System.out.println("3. Grab Black");
		System.out.printf("Lua chon cua ban: ");
		loai = Integer.parseInt(scan.nextLine());
		return loai;
	}
	//Tinh tien so km dau tien , dua tren chon loai grab roi tinh tien
	public static float tinhTienKmdautien(int chonLoaiGrab) {
		float tien = 0;
		if(chonLoaiGrab == 1) {
			tien = GRAB_CAR_1KM; // do tien 1 km dau bang voi so tien ban dau bang
		} else if(chonLoaiGrab == 2) {
			tien = GRAB_SUV_1KM;
		} else {
			tien = GRAB_BLACK_1KM;
		}
		return tien;
	}
	// tinh tien so km tiep theo
	public static float tinhTienKmTieptheo(int chonLoaiGrab, float soKm) {
		float tien = 0;
		if(chonLoaiGrab == 1) {
			tien = GRAB_CAR_1KM + (soKm - 1) * GRAB_CAR_1_TO_19KM;
		} else if(chonLoaiGrab == 2){
			tien = GRAB_SUV_1KM + (soKm - 1) * GRAB_SUV_1_TO_19KM;
		} else {
			tien = GRAB_BLACK_1KM + (soKm -1) * GRAB_BLACK_1_TO_19KM;
		}
		return tien;
	}
	public static float tinhTienKmTren19Km(int chonLoaiGrab, float soKm) {
		float tien = 0;
		if(chonLoaiGrab == 1) {
			tien = GRAB_CAR_1KM + 18 * GRAB_CAR_1_TO_19KM + (soKm - 19) * GRAB_CAR_OVER_19KM;
		} else if(chonLoaiGrab == 2){
			tien = GRAB_SUV_1KM + 18 * GRAB_SUV_1_TO_19KM + (soKm - 19) * GRAB_SUV_OVER_19KM;
		} else {
			tien = GRAB_BLACK_1KM + 18 * GRAB_BLACK_1_TO_19KM + (soKm - 19) * GRAB_BLACK_OVER_19KM;
		}
		return tien;
	}
	public static float tinhTienCho(int chonLoaiGrab, int thoiGianCho) {
		float tien = 0;
		if(thoiGianCho >= 3) {
			int solanTinh = Math.round((float)thoiGianCho / 3);
			if(chonLoaiGrab == 1) {
				tien = solanTinh * GRAB_CAR_WAIT;
			} else if(chonLoaiGrab == 2) {
				tien = solanTinh * GRAB_SUV_WAIT;
			} else {
				tien = solanTinh * GRAB_BLACK_WAIT;
			}
		}
		return tien;
	}
	public static float tinhTienTra(int chonLoaiGrab, float soKm, int thoiGianCho) {
		float tienTra = 0;
		if(soKm <= 1) {
			tienTra = tinhTienKmdautien(chonLoaiGrab) + tinhTienCho(chonLoaiGrab, thoiGianCho);
		} else if(soKm > 1 && soKm < 19) {
			tienTra = tinhTienKmTieptheo(chonLoaiGrab, soKm) + tinhTienCho(chonLoaiGrab, thoiGianCho);
		} else {
			tienTra = tinhTienKmTren19Km(chonLoaiGrab, soKm) + tinhTienCho(chonLoaiGrab, thoiGianCho);
		}
		return tienTra;
	}
	public static float nhapSoKm(Scanner scan) {
		float soKm;
		System.out.printf("Nhap so km:");
		soKm = Float.parseFloat(scan.nextLine());
		return soKm;
	}
	public static int nhapSoThoiGianCho(Scanner scan) {
		int soThoigian;
		System.out.printf("Nhap so thoi gian cho:");
		soThoigian = Integer.parseInt(scan.nextLine());
		return soThoigian;
	}
	public static void inDongKm1(int chonLoaiGrab, float soKm) {
		int donGia;
		if(chonLoaiGrab == 1) {
			donGia = GRAB_CAR_1KM;
		} else if (chonLoaiGrab == 2) {
			donGia = GRAB_SUV_1KM;
		} else {
			donGia = GRAB_BLACK_1KM;
		}
		if(soKm <= 1) {
			System.out.println("KM DAU TIEN\t\t" + soKm + "\t\t\t" + donGia + "\t\t\t" + donGia);
		} else {
			System.out.println("KM DAU TIEN\t\t" + 1 + "\t\t\t" + donGia + "\t\t\t" + donGia);
		}
	}
	public static void inDong2(int chonLoaiGrab, float soKm) {
		int donGia;
		if(chonLoaiGrab == 1) {
			donGia = GRAB_CAR_1_TO_19KM;
		} else if (chonLoaiGrab == 2) {
			donGia = GRAB_SUV_1_TO_19KM;
		} else {
			donGia = GRAB_BLACK_1_TO_19KM;
		}
		inDongKm1(chonLoaiGrab, soKm);
		if(soKm < 19) {
			System.out.println("Tu 2 den " + (soKm-1) + "\t\t" + (soKm -1) + "\t\t\t" + donGia + "\t\t\t" + donGia*(soKm -1));
		} else {
			System.out.println("Tu 2 den " + 18 + "\t\t" + 18 +"\t\t\t"+ donGia + "\t\t\t" + donGia*18);
		}
	}
	public static void inDong3(int chonLoaiGrab, float soKm) {
		int donGia;
		if(chonLoaiGrab == 1) {
			donGia = GRAB_CAR_OVER_19KM;
		} else if (chonLoaiGrab == 2) {
			donGia = GRAB_SUV_OVER_19KM;
		} else {
			donGia = GRAB_BLACK_OVER_19KM;
		}
		inDong2(chonLoaiGrab, soKm);
		System.out.println("Tu 19 den " + soKm + "\t\t" + (soKm - 19)+ "\t\t\t" + donGia + "\t\t\t" + donGia * (soKm -19));
	}
	public static void inThoiGianCho(int chonLoaiGrab, int thoiGianCho) {
		int donGia;
		if(chonLoaiGrab == 1) {
			donGia = GRAB_CAR_WAIT;
		} else if (chonLoaiGrab == 2) {
			donGia = GRAB_SUV_WAIT;
		} else {
			donGia = GRAB_BLACK_WAIT;
		}
		float tienCho = tinhTienCho(chonLoaiGrab, thoiGianCho);
		System.out.println("Thoi gian cho " + "\t\t" + thoiGianCho + "\t\t\t" + donGia + "\t\t\t" + tienCho);
	}
	public static void inChiTiet(int chonLoaiGrab, float soKm, int thoiGianCho) {
		System.out.println("\t\t\t\tCHI TIET HOA DON");
		System.out.println("CHI TIET\t\t SU DUNG(KM)\t\t DON GIA(1000d)\t\t THANH TIEN(1000d)");
		if(soKm < 1) {
			inDongKm1(chonLoaiGrab, soKm);
		} else if ( soKm > 1 && soKm < 19) {
			inDong2(chonLoaiGrab, soKm);
		} else {
			inDong3(chonLoaiGrab, soKm);
		}
		inThoiGianCho(chonLoaiGrab, thoiGianCho);
		float tongTien = tinhTienTra(chonLoaiGrab, soKm, thoiGianCho);
		System.out.println("-----------------------------------------------------------------------------------------------");
		System.out.println("\t\t\t\t\t\t\t\t Tong Tien: " + tongTien);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int loaiGrab = chonLoaiGrab(scan);
		float soKm = nhapSoKm(scan);
		int thoigianCho = nhapSoThoiGianCho(scan);
		float tienTra = tinhTienTra(loaiGrab, soKm, thoigianCho);
		System.out.println("Tien tra: "+tienTra);
		inChiTiet(loaiGrab, soKm, thoigianCho);
	}
}
