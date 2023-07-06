package Bai4;

import java.time.LocalDate;

public class GiaoDichDat extends GiaoDich{
	private String loaiDat;

	public String getLoaiDat() {
		return loaiDat;
	}

	public void setLoaiDat(String loaiDat) {
		this.loaiDat = loaiDat;
	}

	public GiaoDichDat(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, double dienTich, String loaiDat) {
		super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
		this.loaiDat = loaiDat;
	}

	public GiaoDichDat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GiaoDichDat(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, double dienTich) {
		super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
		// TODO Auto-generated constructor stub
	} 

	public double  thanhTien() {
		if (loaiDat == ("B") || loaiDat == ("C")) {
			return getDienTich() * getDonGia();
		} else if (loaiDat == ("A")){
			return getDienTich() * getDonGia()*1.5;
		}
		return  thanhTien();
	}

	@Override
	public String toString() {
		return "GiaoDichDat [loaiDat=" + loaiDat + ", thanhTien()=" + thanhTien() + ", getMaGiaoDich()="
				+ getMaGiaoDich() + ", getNgayGiaoDich()=" + getNgayGiaoDich() + ", getDonGia()=" + getDonGia()
				+ ", getDienTich()=" + getDienTich() + "]";
	}
	
	
	
}
