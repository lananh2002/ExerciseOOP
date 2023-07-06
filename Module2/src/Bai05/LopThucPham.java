package Bai05;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LopThucPham {
	private String maHang; 
	private String tenHang; 
	private double donGia; 
	private LocalDate nsx;
	private LocalDate nhh;
	
	


	public LopThucPham(String maHang) {
		super();
		this.maHang = maHang;
	}




	public LopThucPham() {
		super();
		// TODO Auto-generated constructor stub
	}




	public LopThucPham(String maHang, String tenHang, double donGia, LocalDate nsx, LocalDate nhh) throws Exception {
		super();
		setMaHang(maHang);
		setTenHang(tenHang);
		setDonGia(donGia);
		setNsx(nsx);
		setNhh(nhh);
	}




	public String getMaHang() {
		return maHang;
	}




	public void setMaHang(String maHang) throws Exception {
		if (!maHang.trim().equals("")) {
			this.maHang = maHang;
		} else {
			throw new Exception("Loi : khong bo trong");
		}
	}




	public String getTenHang() {
		return tenHang;
	}




	public void setTenHang(String tenHang) {
		if (!tenHang.trim().equals("")) {
			this.tenHang = tenHang;
		} else {
			this.tenHang = "xxx";
		}
	}




	public double getDonGia() {
		return donGia;
	}




	public void setDonGia(double donGia) {
		if (donGia > 0) {
			this.donGia = donGia;
		} else {
			this.donGia = 0;
		}
	
	}




	public LocalDate getNsx() {
		return nsx;
	}




	public void setNsx(LocalDate nsx) {
		if (nsx.isBefore(LocalDate.now())) {
			this.nsx = nsx;
		} else {
			this.nsx = LocalDate.now();
		}
	
	}




	public LocalDate getNhh() {
		return nhh;
	}




	public void setNhh(LocalDate nhh) {
		
		if (nhh.isAfter(LocalDate.now())) {
			this.nhh = nhh;
		} else {
			this.nhh = LocalDate.now();
		}
	
	}




		//hàm định dạng 
		public String formatDDMMYYYY(LocalDate date) {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			String strDate = date.format(formatter);
			return strDate;		
		}




		
		
	@Override
		public String toString() {
			return "LopThucPham [maHang=" + maHang + ", tenHang=" + tenHang + ", donGia=" + donGia + ", nsx=" + formatDDMMYYYY(nsx)
					+ ", nhh=" + formatDDMMYYYY(nhh) + ", ghichu()=" + ghichu()+ "]";
		}




	public boolean  hetHan() {
		return nhh.isBefore(LocalDate.now()) ? true : false; 
	}
	public String ghichu() {
		if (hetHan()!=true) {
			return "da het han";
		} else {
			return "chua het han";
		}

	}
	

}
