package kienthuccannho;

import java.util.Scanner;

/*
 * B1. Tạo biến name, mathScore, physicScore, chemistryScore, averageScore 
B2. Cho nhập tên và gán cho name
B3. Cho nhập điểm toán và gán cho mathScore
B4. Cho nhập điểm lý và gán cho physicScore
B5. Cho nhập điểm hoá và gán cho chemistryScore
B6. Công thức tính averageScore = cộng 3 môn / 3
B7. Kiểm tra if averageScore >= 8.5 : Giỏi
B8. 6,5 <= avg < 8,5 : Khá 
B9. 5 <= avg < 6.5 : tb
B10. avg < 5 : yếu 
B11. In ra kết quả
 */
public class TinhDiemTrungBinh {
	public static void main(String[] args) {
		final int TOTAL = 3;
		String name;
		float mathScore;
		float physicScore;
		float chemistryScore;
		float average;
		String xepHang;
		
		Scanner scan = new Scanner(System.in);
		System.out.printf("Nhap ten sinh vien:");
		name = scan.nextLine();
		System.out.printf("Nhap diem mon toan:");
		mathScore = Float.parseFloat(scan.nextLine());
		System.out.printf("Nhap diem mon ly:");
		physicScore= Float.parseFloat(scan.nextLine());
		System.out.printf("Nhap diem mon hoa:");
		chemistryScore = Float.parseFloat(scan.nextLine());
		
		average = (mathScore+physicScore+chemistryScore)/TOTAL;
		if(average >= 8.5) {
			xepHang = "Loai Gioi";
		} else if (average >= 6.5) {
			xepHang = "Loai Kha";
		} else if (average >= 5) {
			xepHang = "Loai TB";
		} else {
			xepHang = "Loai Yeu";
		}
		System.out.println("Xep loai cua sinh vien: "+ name + "\t Diem Tb: " + average +"\t Xep Loai: " + xepHang);
		scan.close();

	}

}
