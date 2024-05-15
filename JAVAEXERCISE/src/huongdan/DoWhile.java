package huongdan;

import java.util.Scanner;

public class DoWhile {

public static void main(String[] args) {
	int N;
do {	
	System.out.println("Nhập số N: ");
	Scanner sc = new Scanner(System.in);
	 N = sc.nextInt();
	
}while (N<=0);
System.out.println("N: "+N);
}
}
