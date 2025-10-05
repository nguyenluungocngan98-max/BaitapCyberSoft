package funtion;

import java.util.Scanner;

public class KiemTraChanLe {
	public static void kiemtraChanLe(int number) {
//		boolean kqua;
		if(number % 2 == 0) {
			System.out.println("So chan");
		} else {
			System.out.println("So le");
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.printf("Nhap vao so can kiem tra:");
		int so = Integer.parseInt(scan.nextLine());
		kiemtraChanLe(so);
//		if (ketQua) {
//			System.out.println("So ban vua nhap la so chan");
//		} else {
//			System.out.println("So ban vua nhap la so le");
//		}

	}

}
