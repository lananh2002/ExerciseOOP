package bai2;

import java.time.LocalDate;

public class SachThamKhao extends Sach{
	private double thue;

	public double getThue() {
		return thue;
	}

	public void setThue(double thue) {
		this.thue = thue;
	}

	public SachThamKhao(String maSach, LocalDate ngayNhap, int soLuong, String nhaXuatBan, double donGia, double thue) {
		super(maSach, ngayNhap, soLuong, nhaXuatBan, donGia);
		this.thue = thue;
	}

	public SachThamKhao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SachThamKhao(String maSach, LocalDate ngayNhap, int soLuong, String nhaXuatBan, double donGia) {
		super(maSach, ngayNhap, soLuong, nhaXuatBan, donGia);
		// TODO Auto-generated constructor stub
	}

	public double  tinhTienSachGiaoKhoa() {
		return getSoLuong()*getDonGia() + thue;
	}

	@Override
	public String toString() {
		return "SachThamKhao [thue=" + thue + ", tinhTienSachGiaoKhoa()=" + tinhTienSachGiaoKhoa() + ", getMaSach()="
				+ getMaSach() + ", getNgayNhap()=" + getNgayNhap() + ", getSoLuong()=" + getSoLuong()
				+ ", getNhaXuatBan()=" + getNhaXuatBan() + ", getDonGia()=" + getDonGia() + "]";
	}


}
