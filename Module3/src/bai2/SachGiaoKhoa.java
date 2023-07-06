package bai2;

import java.time.LocalDate;

public class SachGiaoKhoa  extends Sach{
	private String tinhTrangSach;

	public String getTinhTrangSach() {
		return tinhTrangSach;
	}

	public void setTinhTrangSach(String tinhTrangSach) {
		if (tinhTrangSach=="moi" || tinhTrangSach == "cu") {
			this.tinhTrangSach = tinhTrangSach;
		} else {
				System.out.println("Loi : Tinh trang Sach nhap moi hoac cu ");
		}
	
	}


	public SachGiaoKhoa(String maSach, LocalDate ngayNhap, int soLuong, String nhaXuatBan, double donGia,
			String tinhTrangSach) {
		super(maSach, ngayNhap, soLuong, nhaXuatBan, donGia);
		this.tinhTrangSach = tinhTrangSach;
	}

	public SachGiaoKhoa() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	
	
	public SachGiaoKhoa(String maSach, LocalDate ngayNhap, int soLuong, String nhaXuatBan, double donGia) {
		super(maSach, ngayNhap, soLuong, nhaXuatBan, donGia);
		// TODO Auto-generated constructor stub
	}

	public double  tinhTienSachGiaoKhoa() {
		if (tinhTrangSach=="moi" ) {
			return getSoLuong() * getDonGia() ;
		} else {
			return getSoLuong() * getDonGia()* 0.5;
		}
	
		
	}

	@Override
	public String toString() {
		return "SachGiaoKhoa [tinhTrangSach=" + tinhTrangSach + ", tinhTienSachGiaoKhoa()=" + tinhTienSachGiaoKhoa()
				+ ", getMaSach()=" + getMaSach() + ", getNgayNhap()=" + getNgayNhap() + ", getSoLuong()=" + getSoLuong()
				+ ", getNhaXuatBan()=" + getNhaXuatBan() + ", getDonGia()=" + getDonGia() + "]";
	}



	
	
}
