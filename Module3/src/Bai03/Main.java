package Bai03;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//tao  3  giao dich
		GiaoDichVang dichVang = new GiaoDichVang("acd", LocalDate.of(2022,10,20), 5, 50,"acf" );
		System.out.println(dichVang.thanhTien());
		
		GiaoDichTienTe dichTienTe = new GiaoDichTienTe("ma", LocalDate.of(2023, 05,16), 5, 3, 10000000, "vnd");
		System.out.println(dichTienTe.thanhTien()); 
		
		GiaoDichTienTe dichTienTe1 = new GiaoDichTienTe("ma1", LocalDate.of(2023, 06,16), 5, 3, 10, "usd");
		System.out.println(dichTienTe1.thanhTien());
		
		
				// Tính tổng số lượng cho từng loại giao dịch
				double tongSoLuongVang = dichVang.getSoLuong();
				double tongSoLuongTienTe = dichTienTe.getSoLuong() + dichTienTe1.getSoLuong();
				
				System.out.println("Tổng số lượng giao dịch vàng: " + tongSoLuongVang);
				System.out.println("Tổng số lượng giao dịch tiền tệ: " + tongSoLuongTienTe);
				
				// Tính trung bình thành tiền của giao dịch tiền tệ
				double trungBinhThanhTien = (dichTienTe.thanhTien() + dichTienTe1.thanhTien()) / 2;
				System.out.println("Trung bình thành tiền của giao dịch tiền tệ: " + trungBinhThanhTien);
				
				// Xuất ra các giao dịch có đơn giá > 1 tỷ
				System.out.println("Các giao dịch có đơn giá > 1 tỷ:");
				if (dichVang.getDonGia() > 1000000000) {
					System.out.println(dichVang);
				}
				if (dichTienTe.getDonGia() > 1000000000) {
					System.out.println(dichTienTe);
				}
				if (dichTienTe1.getDonGia() > 1000000000) {
					System.out.println(dichTienTe1);
				}
			}
		
	}


