package Bai6;

import java.time.LocalDate;

public class HoaDonTheoGio extends HoaDon{
	private double soGioThue;

	public double getSoGioThue() {
		return soGioThue;
	}

	public void setSoGioThue(double soGioThue) {
		this.soGioThue = soGioThue;
	}

	public HoaDonTheoGio(String maHD, LocalDate ngayHD, String tenKH, String maPhong, double donGia, double soGioThue) {
		super(maHD, ngayHD, tenKH, maPhong, donGia);
		this.soGioThue = soGioThue;
	}

	public HoaDonTheoGio() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HoaDonTheoGio(String maHD, LocalDate ngayHD, String tenKH, String maPhong, double donGia) {
		super(maHD, ngayHD, tenKH, maPhong, donGia);
		// TODO Auto-generated constructor stub
	} 
	
	public double  thanhTienTheoGio() {
		if (soGioThue > 24 && soGioThue <30) {
			return 24* getDonGia();
		}else {
			return soGioThue * getDonGia(); 
		}
	}

	@Override
	public String toString() {
		return "HoaDonTheoGio [soGioThue=" + soGioThue + ", thanhTienTheoGio()=" + thanhTienTheoGio() + ", getMaHD()="
				+ getMaHD() + ", getNgayHD()=" + getNgayHD() + ", getTenKH()=" + getTenKH() + ", getMaPhong()="
				+ getMaPhong() + ", getDonGia()=" + getDonGia() + "]";
	}
	
	
	
}
