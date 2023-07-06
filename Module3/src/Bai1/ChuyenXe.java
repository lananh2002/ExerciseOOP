package Bai1;

public class ChuyenXe {
	  private String maSo;
	    private String tenTaiXe;
	    private String soXe;
	    private double doanhThu;
	    
	    
	    
		public String getMaSo() {
			return maSo;
		}
		public void setMaSo(String maSo) {
			this.maSo = maSo;
		}
		public String getTenTaiXe() {
			return tenTaiXe;
		}
		public void setTenTaiXe(String tenTaiXe) {
			this.tenTaiXe = tenTaiXe;
		}
		public String getSoXe() {
			return soXe;
		}
		public void setSoXe(String soXe) {
			this.soXe = soXe;
		}
		public double getDoanhThu() {
			return doanhThu;
		}
		public void setDoanhThu(double doanhThu) {
			this.doanhThu = doanhThu;
		}
	    
		   public ChuyenXe(String maSo, String tenTaiXe, String soXe, double doanhThu) {
		        this.maSo = maSo;
		        this.tenTaiXe = tenTaiXe;
		        this.soXe = soXe;
		        this.doanhThu = doanhThu;
		    }

	
}
