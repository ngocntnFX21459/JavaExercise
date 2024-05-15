package ThucHanh;

import java.util.Scanner;

public class KiemTraNamNhuan {
public static void main(String[] args) {
	
	System.out.println("Nhập năm muốn kiểm tra: ");
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
if(N>0) {
	if(N%400==0) {
		System.out.println("N là năm nhuận.");
	}else if(N%4==0 && N%100!=0) {
		System.out.println("N là năm nhuận");
	}else {
		System.out.println("N không là năm nhuận");
	}


}else {
	System.out.println("N nhập vào không hợp lệ");
}
	
}}

