package Bai5;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KhachHangVN hangVN = new KhachHangVN("2134", "Lan Anh", LocalDate.of(2023,05,20), 50, 10, "kinh doanh", 10);
		System.out.println(hangVN+"\n");
		
		KhachHangNN hangNN = new KhachHangNN("1234", "Hoang",  LocalDate.of(2023,06,10), 30, 10, "VietNam");
		System.out.println(hangNN);
		
	
		
	}

}
