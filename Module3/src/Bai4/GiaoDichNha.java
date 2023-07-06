package Bai4;

import java.time.LocalDate;

public class GiaoDichNha  extends GiaoDich{
	private String loaiNha; 
	private String diaChi;
	
	
	public String getLoaiNha() {
		return loaiNha;
	}
	public void setLoaiNha(String loaiNha) {
		this.loaiNha = loaiNha;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public GiaoDichNha(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, double dienTich, String loaiNha,
			String diaChi) {
		super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
		this.loaiNha = loaiNha;
		this.diaChi = diaChi;
	}
	public GiaoDichNha() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GiaoDichNha(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, double dienTich) {
		super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
		// TODO Auto-generated constructor stub
	} 
	
	public double  thanhTien() {
		if (loaiNha == ("Cao Cap")) {
			return getDienTich()* getDonGia();
		} else if (loaiNha == ("Thuong")) {
			return getDienTich()* getDonGia()*0.9;
		}
		return thanhTien();
		
	}
	@Override
	public String toString() {
		return "GiaoDichNha [loaiNha=" + loaiNha + ", diaChi=" + diaChi + ", thanhTien()=" + thanhTien()
				+ ", getMaGiaoDich()=" + getMaGiaoDich() + ", getNgayGiaoDich()=" + getNgayGiaoDich() + ", getDonGia()="
				+ getDonGia() + ", getDienTich()=" + getDienTich() + "]";
	}
	
	
	

}
