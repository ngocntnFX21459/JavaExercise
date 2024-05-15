package ThucHanh;

import java.util.Scanner;

public class GiaiPTBac2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhập số a: ");
	float a = sc.nextFloat();
	System.out.println("Nhập số b: ");
	float b = sc.nextFloat();
	System.out.println("Nhập số c: ");
	float c = sc.nextFloat();
	float delta = b*b-4*a*c;
	if(delta<0) {
		System.out.println("Phương trình vô nghiệm");
	}else if(delta==0) {
		float x = -b/2*a;
		System.out.println("Phương trình có nghiệm x = "+x);
	}else if(delta>0) {
		double x1=(-b + Math.sqrt(delta))/(2 * a);
		double x2=(-b-Math.sqrt(delta))/(2 * a);
		System.out.println("Nghiệm thứ nhất của phương trình là : "+x1);
		System.out.println("Nghiệm thứ hai của phương trình là : "+x2);
	}
}
}
