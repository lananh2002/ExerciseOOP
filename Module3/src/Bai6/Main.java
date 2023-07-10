package Bai6;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Test hóa đơn theo giờ 
		HoaDonTheoGio donTheoGio = new HoaDonTheoGio("ACVB", LocalDate.of(2023,07,03), "Lan anh", "201", 50, 5);
		System.out.println("Thanh tien hoa don la: "+ donTheoGio.thanhTienTheoGio());
		
		HoaDonTheoGio donTheoGio1 = new HoaDonTheoGio("ACVB", LocalDate.of(2023,07,03), "Lan anh", "201", 50, 25);
		System.out.println("Thanh tien hoa don1 la: "+ donTheoGio1.thanhTienTheoGio());
	
		
		HoaDonTheoGio donTheoGio2 = new HoaDonTheoGio("ACVB", LocalDate.of(2023,07,03), "Lan anh", "201", 50, 24);
		System.out.println("Thanh tien hoa don2 la: "+ donTheoGio2.thanhTienTheoGio());
		
		
		HoaDonTheoGio donTheoGio3 = new HoaDonTheoGio("ACVB", LocalDate.of(2023,07,03), "Lan anh", "201", 50, 35);
		System.out.println("Thanh tien hoa don la: "+ donTheoGio3.thanhTienTheoGio());

		//Test hóa đơn theo ngày 
		HoaDonTheoNgay donTheoNgay = new HoaDonTheoNgay("ACD", LocalDate.of(2023,07,03), "Nguyen Van A", "504", 50, 6);
		System.out.println("Thanh tien hoa don la: "+donTheoNgay.thanhTienTheoNgay());
		
		HoaDonTheoNgay donTheoNgay2 = new HoaDonTheoNgay("ACD", LocalDate.of(2023,07,03), "Nguyen Van A", "504", 50, 10);
		System.out.println("Thanh tien hoa don la: "+donTheoNgay2.thanhTienTheoNgay());
		
		
		
		
		
	}
}
