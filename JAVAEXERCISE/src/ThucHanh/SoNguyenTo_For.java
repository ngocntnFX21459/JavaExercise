package ThucHanh;

import java.util.Scanner;

public class SoNguyenTo_For {
	static int N;
	public static boolean kiemTraSoNguyenTo(int k) {
		boolean songuyento = true;
	if(k<1) {
		return songuyento = false;


	}
	for (int i=2;i<=k;i++) {
	if (k%i==0) {
		return songuyento=false;
		}
	}
		return songuyento;
		}
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào một số nguyên N: ");
		N = sc.nextInt();
		if(N<1) {
			System.out.println(N + "không phải số nguyên tố");
		}else {
			
		System.out.println("Các số nguyên tố từ 1 đến N là : ");
		int demso=0;
		for(int i = 1;i<N;i++) {

			if(kiemTraSoNguyenTo(i)) {
				System.out.print(i+" ");
				demso=demso+1;
			}
			
		}
		System.out.println();
		System.out.println("Số lượng số nguyên tố đếm được là: "+demso);
		}
	}
	
}

