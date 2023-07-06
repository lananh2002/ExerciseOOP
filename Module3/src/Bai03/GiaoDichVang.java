package Bai03;

import java.time.LocalDate;

public class GiaoDichVang extends GiaoDich{
	private String loaiVang;

	public String getLoaiVang() {
		return loaiVang;
	}

	public void setLoaiVang(String loaiVang) {
		this.loaiVang = loaiVang;
	}

	public GiaoDichVang(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, double soLuong, String loaiVang) {
		super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
		this.loaiVang = loaiVang;
	}

	public GiaoDichVang() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GiaoDichVang(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, double soLuong) {
		super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
		// TODO Auto-generated constructor stub
	} 
	
	
	public double thanhTien() {
		return getSoLuong() * getDonGia();
	}

	@Override
	public String toString() {
		return "GiaoDichVang [loaiVang=" + loaiVang + ", thanhTien()=" + thanhTien() + ", getMaGiaoDich()="
				+ getMaGiaoDich() + ", getNgayGiaoDich()=" + getNgayGiaoDich() + ", getDonGia()=" + getDonGia()
				+ ", getSoLuong()=" + getSoLuong() + "]";
	}
	
	
	
	
}
