package kienthuccannho;

import java.util.Scanner;

/*
 * switch(Bieu thuc Switch){
 * case case1:
 * 		Action1
 * 		break;
 * case case2:
 * 		Action2
 * 		break;
 * .......
 * case caseN:
 * 		ActionN
 * 		break;
 * default:
 * 		DefaultAction
 * }
 */
/*B1: tạo biến month, day 
B2 : Cho nhập vào tháng và gán cho month
B3: tạo switch(month)
B4 :case 1-12 : day của từng tháng tương ứng
B5: kết thúc case in ra day của tháng đã nhập.

 * 
 */
public class SwitchCase {

	public static void main(String[] args) {
		int month;
		int day = 0;
		Scanner scan = new Scanner(System.in);
		System.out.printf("Nhap vao thang: ");
		month = Integer.parseInt(scan.nextLine());
		// Ki thuat co hieu 
		boolean flag = true; // gia su thang hop le
		
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 9:
		case 11:
			day = 31;
			break;
		case 2:
			day = 28;
			break;
		case 4:
		case 6:
		case 8:
		case 10:
		case 12:
			day = 30;
			break;
		default:
			flag = false; // Thang sai
//			throw new IllegalArgumentException("Vui long nhap thang 1 den 12!");
		}
		// if(!flag) 
		// chi hop kieu boolean (false) con true nhu duoi = if(flag == true)
		if (flag) {
			System.out.println("Thang " + month + " hop le");
			System.out.println("Thang " +month + " co so ngay la " + day + " ngay");
		} else {
			System.out.println("Thang khong hop le.");
		}

	}

}
