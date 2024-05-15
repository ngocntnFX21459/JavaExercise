package ThucHanh;

import java.util.Scanner;

public class Daysogiamdan {
static int Tong=0;
static int N;
public static void main(String[] args) {
	do {
	System.out.println("Nhập số nguyên N");
	Scanner sc = new Scanner(System.in);
	N = sc.nextInt();
	Tong = Tong + N;

}while (Tong<100);
	if(N%2!=0) {
		System.out.println("Dãy số lẻ giảm dần: ");
		for(int i = N;i>=1;i-=2){
			System.out.print(" "+i);
		}
		}else if(N%2==0) {
			System.out.println("Dãy số chẵn giảm dần: ");
			for(int i = N;i>=2;i-=2) {
				System.out.print(" "+i);
			}
		}
		
}

}
