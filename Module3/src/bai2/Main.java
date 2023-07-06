package bai2;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		
		
			//tinh tien sach giao khoa
		 SachGiaoKhoa giaoKhoa = new SachGiaoKhoa("ABC", LocalDate.of(2022, 10, 15), 5, "afc", 100000, "moi");
		 System.out.println("Tien sach giao khoa: "+giaoKhoa .tinhTienSachGiaoKhoa() +"\n");
		 System.out.println(giaoKhoa +"\n");
		 
		 SachGiaoKhoa giaoKhoa1 =  new SachGiaoKhoa("ADC", null, 5, "sghf", 100000, "cu");
		 System.out.println("Tien sach giao khoa: "+giaoKhoa1.tinhTienSachGiaoKhoa());
	
		 //tinh tien sách tham khao 
		 
		 SachThamKhao khao = new SachThamKhao("ACD", LocalDate.of(2023,07,05), 5, "adc", 10000, 1000);
		 System.out.println(khao +"\n");
		 
		 
	}

}
