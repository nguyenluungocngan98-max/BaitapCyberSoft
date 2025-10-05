package buoi03;

import java.util.Scanner;

/*
 * B1: Tạo biến day, month, year, dayofweek, top, flag.
B2 : Thông báo nhập ngày và gán cho day
B3 : Thông báo nhập tháng và gán cho month
B4: Thông báo nhập năm và gán cho year
B5 : Xét year < 1582 -> Không hợp lệ, vì lịch theo cthuc gắn từ năm 1582. Gắn cờ flag = false
B6 : Xét month (1-12) -> nếu k hợp lệ gắn flag = false
B7: Xét ngày, cần kiểm tra tháng người nhập vào có tối đa bao nhiêu ngày. Chú ý năm nhuận tháng 2, xét day có đúng hay không
B8 : Tính dayOfWeek
B9 : In ra kết quả. 
 */

public class DayOfWeek {

	public static void main(String[] args) {
		int day;
		int month;
		int year;
		int top;
		int dayOfWeek;
		
		boolean flag = true;
		
		Scanner scan = new Scanner(System.in);
		System.out.printf("Vui long nhap ngay:");
		day = Integer.parseInt(scan.nextLine());
		System.out.printf("Vui long nhap thang:");
		month = Integer.parseInt(scan.nextLine());
		System.out.printf("Vui long nhap nam:");
		year = Integer.parseInt(scan.nextLine());
		
		//kiem tra nam
		if(year < 1582) {
			flag = false;
		}
		// kiem tra thang
		if(month < 1 || month > 12) {
			flag = false;
		}
		switch (month) {
		case 4:
		case 6:
		case 9:
		case 11:
			top = 30;
			break;
		case 2:
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
				top = 29;
			} else {
				top = 28;
			}
			break;
		default:
			top = 31;
			break;
		}
		// Kiem tra ngay 
		if(day < 1 || day > top) {
			flag = false;
		}
		
		if (!flag) {
			System.out.println("Khong hop le! Vui long nhap lai");
		} else {
			int a = (14 - month)/12;
			year -= a;
			month += (12*a - 2);
			dayOfWeek = (day + year + year/4 - year/100 + year/400 + (31*month)/12)%7;
			if(dayOfWeek == 0) {
				System.out.println("Chu Nhat");
			} else {
				int thu = dayOfWeek + 1;
				System.out.println("Thu " + thu);
			}
		}

	}

}
