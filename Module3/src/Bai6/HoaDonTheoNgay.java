package Bai6;

import java.time.LocalDate;

public class HoaDonTheoNgay extends HoaDon{
	private double soNgayThue;

	public double getSoNgayThue() {
		return soNgayThue;
	}

	public void setSoNgayThue(double soNgayThue) {
		this.soNgayThue = soNgayThue;
	}

	public HoaDonTheoNgay(String maHD, LocalDate ngayHD, String tenKH, String maPhong, double donGia,
			double soNgayThue) {
		super(maHD, ngayHD, tenKH, maPhong, donGia);
		this.soNgayThue = soNgayThue;
	}

	public HoaDonTheoNgay() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HoaDonTheoNgay(String maHD, LocalDate ngayHD, String tenKH, String maPhong, double donGia) {
		super(maHD, ngayHD, tenKH, maPhong, donGia);
		// TODO Auto-generated constructor stub
	}
	
	
	
	public double thanhTienTheoNgay() {
	    double totalAmount = 0;
	    
	    if (soNgayThue > 7) {
	        double remainingDays = soNgayThue - 7;
	        totalAmount = 7 * getDonGia() + remainingDays * getDonGia() * 0.8; // Apply 20% discount
	    } else {
	        totalAmount = soNgayThue * getDonGia();
	    }
	    
	    return totalAmount;
	}

	@Override
	public String toString() {
		return "HoaDonTheoNgay [soNgayThue=" + soNgayThue + ", thanhTienTheoNgay()=" + thanhTienTheoNgay()
				+ ", getMaHD()=" + getMaHD() + ", getNgayHD()=" + getNgayHD() + ", getTenKH()=" + getTenKH()
				+ ", getMaPhong()=" + getMaPhong() + ", getDonGia()=" + getDonGia() + "]";
	}
	

}
