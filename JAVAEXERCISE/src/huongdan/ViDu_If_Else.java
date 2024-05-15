package huongdan;

import java.util.Scanner;

public class ViDu_If_Else {
static int n;
public static void main(String[] args) {
	System.out.println("Nhập N : ");
	Scanner sc = new Scanner(System.in);
	n=sc.nextInt();
	if(n%2==0) {
		System.out.println(n+" là số chẵn!");
	}
	else {
		System.out.println(n+" là số lẻ!");	
	}
	
}
}
