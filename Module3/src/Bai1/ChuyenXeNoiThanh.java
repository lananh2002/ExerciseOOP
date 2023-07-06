package Bai1;

class ChuyenXeNoiThanh extends ChuyenXe {
  
	private int soTuyen;
    private double soKmDiDuoc;
    
    
	public ChuyenXeNoiThanh(String maSo, String tenTaiXe, String soXe, double doanhThu, int soTuyen,
			double soKmDiDuoc) {
		super(maSo, tenTaiXe, soXe, doanhThu);
		this.soTuyen = soTuyen;
		this.soKmDiDuoc = soKmDiDuoc;
	}
	
	
}