package huongdan;

import java.util.Scanner;

public class WhileDemo {

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
System.out.println("Nhập số nguyên N : ");
	int	N = sc.nextInt();
	System.out.println("Dãy số giảm dần là : ");
	while(N>0) {
		System.out.print(N+" ");
		N--;
	}
	
}
}
