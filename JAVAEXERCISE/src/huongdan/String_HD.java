package huongdan;

public class String_HD {
public static void main(String[] args) {
	String input ="Xi nc hao c a cba n";
	int totalSpace=0;
	int len = input.length();//lấy ra độ dài chuỗi
	for(int i = 0;i<len;i++) {
		char kyTu=input.charAt(i);
		if(kyTu==' ')//so sánh với dấu cách
			{
			totalSpace++;
		}
	}
	System.out.println("Số lượng dấu cách: "+totalSpace);
//Xóa khoảng trắng
	input=input.replaceAll(" ", "");
	System.out.println("Chuỗi sau khi xóa dấu cách:"+input);
//chuyển sang in hoa
	input=input.toUpperCase();
System.out.println("Chuỗi sau khi chuyển in hoa: "+input);
	
	
}
	
}
