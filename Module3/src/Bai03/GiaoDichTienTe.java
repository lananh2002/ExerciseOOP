package Bai03;

import java.time.LocalDate;

public class GiaoDichTienTe extends GiaoDich{
	private double  triGia; 
	private String loaiTienTe;
	
	
	public double getTriGia() {
		return triGia;
	}
	public void setTriGia(double triGia) {
		this.triGia = triGia;
	}
	public String getLoaiTienTe() {
		return loaiTienTe;
	}
	public void setLoaiTienTe(String loaiTienTe) {
//		if (loaiTienTe == "tien Viet Nam" || loaiTienTe == "tien USD " || loaiTienTe == "tien Euro") {
//			this.loaiTienTe = loaiTienTe;
//		} else {
//			System.out.println("Phai nhap loai tien te la: tien Viet Nam , tien USD , tien Euro");
//		}
	
		this.loaiTienTe = loaiTienTe;
	}
	public GiaoDichTienTe(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, double soLuong, double triGia,
			String loaiTienTe) {
		super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
		this.triGia = triGia;
		this.loaiTienTe = loaiTienTe;
	}
	public GiaoDichTienTe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GiaoDichTienTe(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, double soLuong) {
		super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
		// TODO Auto-generated constructor stub
	} 
	
	public double thanhTien() {
		String tien = loaiTienTe;
		
	    if (tien==("usd") || tien==("euro")) {
	    	System.out.println("usd");
	        return getSoLuong() * getDonGia() * triGia;
	        
	    } else if (tien==("vnd") ){
	    	System.out.println("vnd");
	        return (getSoLuong() * getDonGia());
		}
		return thanhTien();
	
	
	}
	@Override
	public String toString() {
		return "GiaoDichTienTe [triGia=" + triGia + ", loaiTienTe=" + loaiTienTe + ", thanhTien()=" + thanhTien()
				+ ", getMaGiaoDich()=" + getMaGiaoDich() + ", getNgayGiaoDich()=" + getNgayGiaoDich() + ", getDonGia()="
				+ getDonGia() + ", getSoLuong()=" + getSoLuong() + "]";
	}
	
	
	
	
	}
	

