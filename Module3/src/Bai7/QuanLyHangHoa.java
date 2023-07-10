package Bai7;

import java.util.ArrayList;
import java.util.Date;

class QuanLyHangHoa {
    private ArrayList<HangHoa> danhSachHangHoa;

    public QuanLyHangHoa(int n) {
        danhSachHangHoa = new ArrayList<>(n);
    }

    public boolean themHangHoa(HangHoa hangHoa) {
        if (timHangHoa(hangHoa.getMaHang()) != null) {
            return false; // Mã hàng đã tồn tại
        }
        danhSachHangHoa.add(hangHoa);
        return true;
    }

    public void inToanBoDanhSach() {
        for (HangHoa hangHoa : danhSachHangHoa) {
            System.out.println(hangHoa.toString());
        }
    }

    public void inHangThucPham() {
        for (HangHoa hangHoa : danhSachHangHoa) {
            if (hangHoa instanceof HangThucPham) {
                System.out.println(hangHoa.toString());
            }
        }
    }

    public void inHangDienMay() {
        for (HangHoa hangHoa : danhSachHangHoa) {
            if (hangHoa instanceof HangDienMay) {
                System.out.println(hangHoa.toString());
            }
        }
    }

    public void inHangSanhSu() {
        for (HangHoa hangHoa : danhSachHangHoa) {
            if (hangHoa instanceof HangSanhSu) {
                System.out.println(hangHoa.toString());
            }
        }
    }

    public HangHoa timHangHoa(String maHang) {
        for (HangHoa hangHoa : danhSachHangHoa) {
            if (hangHoa.getMaHang().equals(maHang)) {
                return hangHoa;
            }
        }
        return null; // Không tìm thấy hàng hóa
    }
    public static void swap(HangHoa[] arr, int i, int j) {
        HangHoa temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void sapXepTheoTenHangTangDan() {
        for (int i = 0; i < danhSachHangHoa.size() - 1; i++) {
            for (int j = i + 1; j < danhSachHangHoa.size(); j++) {
                if (danhSachHangHoa.get(i).getTenHang().compareTo(danhSachHangHoa.get(j).getTenHang()) > 0) {
                    swap(danhSachHangHoa, i, j);
                }
            }
        }
    }

    private void swap(ArrayList<HangHoa> danhSachHangHoa2, int i, int j) {
		// TODO Auto-generated method stub
		
	}

	public void sapXepTheoSoLuongTonGiamDan() {
        for (int i = 0; i < danhSachHangHoa.size() - 1; i++) {
            for (int j = i + 1; j < danhSachHangHoa.size(); j++) {
                if (danhSachHangHoa.get(i).getSoLuongTon() < danhSachHangHoa.get(j).getSoLuongTon()) {
                    swap(danhSachHangHoa, i, j);
                }
            }
        }
    }


    public void xuatHangThucPhamKhoBan() {
        for (HangHoa hangHoa : danhSachHangHoa) {
            if (hangHoa instanceof HangThucPham) {
                HangThucPham thucPham = (HangThucPham) hangHoa;
                Date currentDate = new Date();

                if (thucPham.getSoLuongTon() > 0 && currentDate.after(thucPham.getNgayHetHan())) {
                    System.out.println(hangHoa.toString());
                }
            }
        }
    }

    public boolean xoaHangHoa(String maHang) {
        HangHoa hangHoa = timHangHoa(maHang);
        if (hangHoa != null) {
            danhSachHangHoa.remove(hangHoa);
            return true;
        }
        return false; // Không tìm thấy hàng hóa để xóa
    }

    public boolean suaDonGiaHangHoa(String maHang, double donGia) {
        HangHoa hangHoa = timHangHoa(maHang);
        if (hangHoa != null) {
            hangHoa.setDonGia(donGia);
            return true;
        }
        return false; // Không tìm thấy hàng hóa để sửa
    }
}
