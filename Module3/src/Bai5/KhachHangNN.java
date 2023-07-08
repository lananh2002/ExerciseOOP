package Bai5;

import java.time.LocalDate;

public class KhachHangNN extends KhachHang{
	private String quocTich;

	public String getQuocTich() {
		return quocTich;
	}

	public void setQuocTich(String quocTich) {
		this.quocTich = quocTich;
	}

	public KhachHangNN(String maKH, String hoTen, LocalDate ngayLapHoaDon, double soKWtieuThu, double donGia,
			String quocTich) {
		super(maKH, hoTen, ngayLapHoaDon, soKWtieuThu, donGia);
		this.quocTich = quocTich;
	}

	public KhachHangNN() {
		super();
		// TODO Auto-generated constructor stub
	}

	public KhachHangNN(String maKH, String hoTen, LocalDate ngayLapHoaDon, double soKWtieuThu, double donGia) {
		super(maKH, hoTen, ngayLapHoaDon, soKWtieuThu, donGia);
		// TODO Auto-generated constructor stub
	} 
	
	
	public  double  thanhTien() {
		return getSoKWtieuThu()*getDonGia();
	}

	@Override
	public String toString() {
		return "KhachHangNN [quocTich=" + quocTich + ", thanhTien()=" + thanhTien() + ", getMaKH()=" + getMaKH()
				+ ", getHoTen()=" + getHoTen() + ", getNgayLapHoaDon()=" + getNgayLapHoaDon() + ", getSoKWtieuThu()="
				+ getSoKWtieuThu() + ", getDonGia()=" + getDonGia() + "]";
	}
	
	
}
