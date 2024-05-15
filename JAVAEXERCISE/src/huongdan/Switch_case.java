package huongdan;

import java.util.Scanner;

public class Switch_case {
/* Nhập vào 1 số bất kì từ bàn phím. Nếu số đó có giá trị bằng 2 → in ra màn hình
“Monday. Nếu = 3 thì in ra “Tuesday … 8→ “Sunday”
Nếu nằm ngoài giá trị từ 2→ 8, in ra “Giá trị không hợp lệ”
*/
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhập số nguyên N");
	int N = sc.nextInt();
	String mes="";
	switch (N) {
	case 2: {
		mes="Monday";
		break;
	}
	case 3:{
		mes="Tueday";
		break;
	}
	case 4:{
		mes="Wednesday";
		break;
	}
	case 5:{
		mes="Thurdday";
		break;
	}
	case 6:{
		mes="Friday";
		break;
	}
	case 7:{
		mes="Saturday";
		break;
	}
	case 8:{
		mes="Sunday";
		break;
	}
	
	default:
		mes="Giá trị N không hợp lệ";
		break;
	}
	System.out.println(mes);
	}
	
	
	
}
