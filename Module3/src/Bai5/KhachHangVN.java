package Bai5;

import java.time.LocalDate;

public class KhachHangVN extends KhachHang{
	private String doiTuongKH ; 
	private double dinhMuc;
	public String getDoiTuongKH() {
		return doiTuongKH;
	}
	public void setDoiTuongKH(String doiTuongKH) {
		this.doiTuongKH = doiTuongKH;
	}
	public double getDinhMuc() {
		return dinhMuc;
	}
	public void setDinhMuc(double dinhMuc) {
		this.dinhMuc = dinhMuc;
	}
	public KhachHangVN(String maKH, String hoTen, LocalDate ngayLapHoaDon, double soKWtieuThu, double donGia,
			String doiTuongKH, double dinhMuc) {
		super(maKH, hoTen, ngayLapHoaDon, soKWtieuThu, donGia);
		this.doiTuongKH = doiTuongKH;
		this.dinhMuc = dinhMuc;
	}
	public KhachHangVN() {
		super();
		// TODO Auto-generated constructor stub
	}
	public KhachHangVN(String maKH, String hoTen, LocalDate ngayLapHoaDon, double soKWtieuThu, double donGia) {
		super(maKH, hoTen, ngayLapHoaDon, soKWtieuThu, donGia);
		// TODO Auto-generated constructor stub
	}
	
	public  double thanhTien() {
	    if (getSoKWtieuThu() <= getDinhMuc()) {
	        return getSoKWtieuThu() * getDonGia();
	    } else {
	        double soKWVuotDinhMuc = getSoKWtieuThu() - getDinhMuc();
	        return (getDinhMuc() * getDonGia()) + (soKWVuotDinhMuc * getDonGia() * 2.5);
	    }
	}
	@Override
	public String toString() {
		return "KhachHangVN [doiTuongKH=" + doiTuongKH + ", dinhMuc=" + dinhMuc + ", thanhTien()=" + thanhTien()
				+ ", getMaKH()=" + getMaKH() + ", getHoTen()=" + getHoTen() + ", getNgayLapHoaDon()="
				+ getNgayLapHoaDon() + ", getSoKWtieuThu()=" + getSoKWtieuThu() + ", getDonGia()=" + getDonGia() + "]";
	}

	
	
}
