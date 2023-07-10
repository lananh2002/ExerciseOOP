package Bai7;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        QuanLyHangHoa quanLyHangHoa = new QuanLyHangHoa(10);

        // Thêm các mặt hàng vào danh sách
        HangThucPham thucPham = new HangThucPham("TP001", "Thực phẩm 1", 100, 10, "Nhà cung cấp 1", new Date(), new Date());
        quanLyHangHoa.themHangHoa(thucPham);

        HangDienMay dienMay = new HangDienMay("DM001", "Điện máy 1", 200, 5, 12, 1500);
        quanLyHangHoa.themHangHoa(dienMay);

        HangSanhSu sanhSu = new HangSanhSu("SS001", "Sành sứ 1", 50, 60, "Nhà sản xuất 1", new Date());
        quanLyHangHoa.themHangHoa(sanhSu);

        // In toàn bộ danh sách hàng hóa
        System.out.println("Toàn bộ danh sách hàng hóa:");
        quanLyHangHoa.inToanBoDanhSach();
        System.out.println();

        // In danh sách hàng thực phẩm
        System.out.println("Danh sách hàng thực phẩm:");
        quanLyHangHoa.inHangThucPham();
        System.out.println();

        // In danh sách hàng điện máy
        System.out.println("Danh sách hàng điện máy:");
        quanLyHangHoa.inHangDienMay();
        System.out.println();

        // In danh sách hàng sành sứ
        System.out.println("Danh sách hàng sành sứ:");
        quanLyHangHoa.inHangSanhSu();
        System.out.println();

        // Tìm kiếm hàng hóa theo mã
        String maHang = "DM001";
        HangHoa hangHoa = quanLyHangHoa.timHangHoa(maHang);
        if (hangHoa != null) {
            System.out.println("Hàng hóa có mã " + maHang + ":");
            System.out.println(hangHoa.toString());
        } else {
            System.out.println("Không tìm thấy hàng hóa có mã " + maHang);
        }
        System.out.println();

        // Sắp xếp hàng hóa theo tên hàng tăng dần
        System.out.println("Danh sách hàng hóa sau khi sắp xếp theo tên hàng tăng dần:");
        quanLyHangHoa.sapXepTheoTenHangTangDan();
        quanLyHangHoa.inToanBoDanhSach();
        System.out.println();

        // Sắp xếp hàng hóa theo số lượng tồn giảm dần
        System.out.println("Danh sách hàng hóa sau khi sắp xếp theo số lượng tồn giảm dần:");
        quanLyHangHoa.sapXepTheoSoLuongTonGiamDan();
        quanLyHangHoa.inToanBoDanhSach();
        System.out.println();

        // Xuất hàng thực phẩm khó bán
        System.out.println("Danh sách hàng thực phẩm khó bán:");
        quanLyHangHoa.xuatHangThucPhamKhoBan();
        System.out.println();

        // Xóa hàng hóa
        String maHangXoa = "TP001";
        if (quanLyHangHoa.xoaHangHoa(maHangXoa)) {
            System.out.println("Đã xóa hàng hóa có mã " + maHangXoa);
        } else {
            System.out.println("Không tìm thấy hàng hóa có mã " + maHangXoa + " để xóa");
        }
        System.out.println();

        // Sửa thông tin đơn giá của hàng hóa
        String maHangSua = "DM001";
        double donGiaMoi = 250;
        if (quanLyHangHoa.suaDonGiaHangHoa(maHangSua, donGiaMoi)) {
            System.out.println("Đã sửa đơn giá hàng hóa có mã " + maHangSua + " thành " + donGiaMoi);
        } else {
            System.out.println("Không tìm thấy hàng hóa có mã " + maHangSua + " để sửa");
        }
    }
}