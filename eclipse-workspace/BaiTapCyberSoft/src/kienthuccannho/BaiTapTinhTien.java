package kienthuccannho;

import java.util.Scanner;

/*
 * if...else => toán tử ? : nếu câu lệnh sau biểu thức đơn giản 
 * Bieu thuc dieu kien ? Bieu thuc 1 : Bieu thuc 2
 * Neu bieu thuc dieu lien la TRUE , gia tri tra ve la Bieu thuc 1
 * Neu bieu thuc dieu lien la FALSE , gia tri tra ve la Bieu thuc 2
 */
/*
 * B1. Tạo biến name, quantify, unitPrice, sumPrice , discount (hằng số) 8% và 12% 
B2. Cho nhập tên sp và gán cho name
B3. Cho nhập số lượng và gán cho quantify
B4. Cho nhập giá tiền và gán cho unitprice
B5. Cho nhập số lượng đơn hàng và gán cho order
B6. Kiểm tra 50 <= quantify <= 100 
B7. Nếu b6 đúng => sumPrice = quantify * unitPrice *8%
B8. Quantify > 100 => sumPrice = quantify * unitPrice * 12%
B9. Quantify <= 50 => quantify * unitPrice
B10. In ra kết quả 
 */
public class BaiTapTinhTien {
	public static void main(String[] args) {
	final int QUOTE1 = 50;
	final int QUOTE2 = 100;
	final float DISCOUNT1 = 0.92f;
	final float DISCOUNT2 = 0.88f;
	String name;
	int quantify;
	float unitPrice;
	float sumPrice;
	
	Scanner scan = new Scanner(System.in);
	System.out.printf("Nhap ten san pham: ");
	name = scan.nextLine();
	System.out.printf("Nhap so luong san pham: ");
	quantify = Integer.parseInt(scan.nextLine());
	System.out.printf("Nhap don gia san pham: ");
	unitPrice = Float.parseFloat(scan.nextLine());
	
	if(quantify > QUOTE2) {
		sumPrice = (QUOTE2 * unitPrice) + (quantify - QUOTE2)*unitPrice * DISCOUNT2;
	} else if ((quantify < QUOTE2) && (quantify > QUOTE1)) {
		sumPrice = (QUOTE1 * unitPrice) + (quantify - QUOTE1)*unitPrice * DISCOUNT1;
	} else {
		sumPrice = quantify * unitPrice;
	}
	System.out.println("Ten: " + name +"\tSo luong "+quantify + "\tDon gia "+unitPrice + "\tThanh tien " + sumPrice);
	scan.close();
	
	}
}
