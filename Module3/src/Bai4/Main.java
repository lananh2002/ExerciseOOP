package Bai4;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Tạo 3 giao dịch không cần nhập từ bàn phím 
		GiaoDichDat dat = new GiaoDichDat("ma", LocalDate.of(2023, 10, 10), 500000, 10, "A");
		System.out.println(dat+ "\n");
		GiaoDichDat dat1 = new GiaoDichDat("ma", LocalDate.of(2023, 10, 10), 500000, 10, "B");
		System.out.println(dat1 + "\n");
	
		
		GiaoDichNha dichNha = new GiaoDichNha("ma", LocalDate.of(2023, 10, 20), 50,10, "Thuong", "LamDong");
		System.out.println(dichNha + "\n");
		
		
		GiaoDichNha dichNha1 = new GiaoDichNha("ma", LocalDate.of(2023, 10, 20), 50,10, "Cao Cap", "TP. HCM ");
		System.out.println(dichNha1);
		

		//tính trung bình thanh tiền của giao dich jđát 
		
		double trungBinhThanhTienDDDat = (dat.thanhTien() + dat1.thanhTien())/2;
		System.out.println("Trung binh tien cua giao dich dat : " + trungBinhThanhTienDDDat);
		
	
	}

}
