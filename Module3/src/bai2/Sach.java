package bai2;

import java.time.LocalDate;


public class Sach {
	private  String maSach; 
	private LocalDate ngayNhap; 
	private int soLuong; 
	private String nhaXuatBan;
	private double donGia; 
	
	
	public String getMaSach() {
		return maSach;
	}
	
	public void setMaSach(String maSach) {
		this.maSach = maSach;
	}
	
	public LocalDate getNgayNhap() {
		return ngayNhap;
	}
	
	public void setNgayNhap(LocalDate ngayNhap) {
		this.ngayNhap = ngayNhap;
	}
	
	public int getSoLuong() {
		return soLuong;
	}
	
	public void setSoLuong(int soLuong) {
		if (soLuong>0) {
			this.soLuong = soLuong;	
		} else {
			this.soLuong = 0; 
		}

	}
	
	public String getNhaXuatBan() {
		return nhaXuatBan;
	}
	
	public void setNhaXuatBan(String nhaXuatBan) {
		if (!nhaXuatBan.trim().equals("")) {
			this.nhaXuatBan = nhaXuatBan;
		} else {
			this.nhaXuatBan = "Chua cap nhat"; 
		}

		
	}
	
	
	
	
	public Sach(String maSach, LocalDate ngayNhap, int soLuong, String nhaXuatBan, double donGia) {
		super();
		this.maSach = maSach;
		this.ngayNhap = ngayNhap;
		setSoLuong(soLuong);
		setNhaXuatBan(nhaXuatBan);
		this.donGia = donGia;
	}

	public Sach() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	} 
	
	


}
