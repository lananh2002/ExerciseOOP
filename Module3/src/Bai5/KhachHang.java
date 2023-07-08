package Bai5;

import java.time.LocalDate;

public class KhachHang {
	private String maKH; 
	private String hoTen; 
	private LocalDate ngayLapHoaDon; 
	private double soKWtieuThu; 
	private double donGia;
	
	
	public String getMaKH() {
		return maKH;
	}
	
	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}
	
	public String getHoTen() {
		return hoTen;
	}
	
	
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public LocalDate getNgayLapHoaDon() {
		return ngayLapHoaDon;
	}
	public void setNgayLapHoaDon(LocalDate ngayLapHoaDon) {
		this.ngayLapHoaDon = ngayLapHoaDon;
	}
	public double getSoKWtieuThu() {
		return soKWtieuThu;
	}
	public void setSoKWtieuThu(double soKWtieuThu) {
		this.soKWtieuThu = soKWtieuThu;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public KhachHang(String maKH, String hoTen, LocalDate ngayLapHoaDon, double soKWtieuThu, double donGia) {
		super();
		this.maKH = maKH;
		this.hoTen = hoTen;
		this.ngayLapHoaDon = ngayLapHoaDon;
		this.soKWtieuThu = soKWtieuThu;
		this.donGia = donGia;
	}
	public KhachHang() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
