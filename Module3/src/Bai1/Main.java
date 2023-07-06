package Bai1;

public class Main {
	 public static void main(String[] args) {
	        // Tạo sẵn các chuyến xe
	        ChuyenXe chuyenXeNoiThanh1 = new ChuyenXeNoiThanh("NT001", "Tai Xe A", "Xe 123", 2000000, 5, 100);
	        ChuyenXe chuyenXeNoiThanh2 = new ChuyenXeNoiThanh("NT002", "Tai Xe B", "Xe 456", 1500000, 3, 50);
	        ChuyenXe chuyenXeNgoaiThanh1 = new ChuyenXeNgoaiThanh("NT001", "Tai Xe C", "Xe 789", 3000000, "Nha Trang", 2);
	        ChuyenXe chuyenXeNgoaiThanh2 = new ChuyenXeNgoaiThanh("NT002", "Tai Xe D", "Xe 999", 2500000, "Da Lat", 1);

	        // Tính tổng doanh thu của tất cả các chuyến xe
	        double tongDoanhThuTatCaChuyenXe = chuyenXeNoiThanh1.getDoanhThu() + chuyenXeNoiThanh2.getDoanhThu()
	                + chuyenXeNgoaiThanh1.getDoanhThu() + chuyenXeNgoaiThanh2.getDoanhThu();
	        System.out.println("Tổng doanh thu của tất cả các chuyến xe: " + tongDoanhThuTatCaChuyenXe);

	        // Tính tổng doanh thu của từng loại chuyến xe
	        double tongDoanhThuChuyenXeNoiThanh = chuyenXeNoiThanh1.getDoanhThu() + chuyenXeNoiThanh2.getDoanhThu();
	        double tongDoanhThuChuyenXeNgoaiThanh = chuyenXeNgoaiThanh1.getDoanhThu() + chuyenXeNgoaiThanh2.getDoanhThu();
	        System.out.println("Tổng doanh thu của chuyến xe nội thành: " + tongDoanhThuChuyenXeNoiThanh);
	        System.out.println("Tổng doanh thu của chuyến xe ngoại thành: " + tongDoanhThuChuyenXeNgoaiThanh);
	    }
}
