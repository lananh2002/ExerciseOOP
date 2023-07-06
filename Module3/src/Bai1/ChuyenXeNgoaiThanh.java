package Bai1;

class ChuyenXeNgoaiThanh extends ChuyenXe {
    private String noiDen;
    private int soNgayDiDuoc;
    
    public ChuyenXeNgoaiThanh(String maSo, String tenTaiXe, String soXe, double doanhThu, String noiDen, int soNgayDiDuoc) {
        super(maSo, tenTaiXe, soXe, doanhThu);
        this.noiDen = noiDen;
        this.soNgayDiDuoc = soNgayDiDuoc;
    }
}
