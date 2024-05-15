package huongdan;

import java.util.Scanner;

public class For {
public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	int tongchan=0;
	int tongle=0;
	System.out.println("Nhập số nguyên N: ");
	int N = sc.nextInt();
	for(int i=1;i<=N;i++) {
		if(i%2==0) {
			tongchan=tongchan+i;
		}else {
			tongle=tongle+i;
		}
		
	}
	System.out.println("Tổng các số chắn là: "+tongchan);
	System.out.println("Tổng các số lẻ là : "+tongle);
}
}
