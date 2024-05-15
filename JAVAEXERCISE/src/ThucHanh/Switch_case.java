package ThucHanh;

import java.util.Scanner;

public class Switch_case {
public static void main (String[] args) {
	System.out.println("Gói nào trong java chứa lớp Scanner dùng để nhập dữ liệu bàn phím ?");
System.out.println("A.java.net");
System.out.println("B.java.io");
System.out.println("C.java.util");
System.out.println("D.java.awt");
System.out.println("Nhập vào đáp án:");
Scanner sc = new Scanner(System.in);
String input = sc.nextLine();
input=input.trim();
input=input.toUpperCase();
switch (input) {
case "A": {
	System.out.println("Đáp án không hợp lệ.");
	break;
}
case "B":{
	System.out.println("Đáp án không hợp lệ.");
	break;
}
case "C":{
	System.out.println("Đáp án hợp lệ.");
	break;
}
case "D":{
	System.out.println("Đáp án không hợp lệ.");
	break;
}
default:
	throw new IllegalArgumentException("Đáp án không hợp lệ. " + input);
}
}
}
