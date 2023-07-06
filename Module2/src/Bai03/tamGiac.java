package Bai03;

public class tamGiac {
	private int ma;
	private int mb;
	private int mc;
	public int getMa() {
		return ma;
	}
	public void setMa(int ma)  throws Exception{
		if (ma >0) {
			this.ma = ma;
		} else {
			throw new Exception("Loi : Nho hon 0");
		}
		

	}
	public int getMb() {
		return mb;
	}
	public void setMb(int mb) throws Exception {
		if (mb >0) {
			this.mb = mb;
		} else {
			throw new Exception("Loi : Nho hon 0");
		}
	}
	public int getMc() {
		return mc;
	}
	public void setMc(int mc) throws Exception{
		if (mc >0) {
			this.mc = mc;
		} else {
			throw new Exception("Loi : Nho hon 0");
		}
	}
	public tamGiac(int ma, int mb, int mc) {
		this.ma = ma;
		this.mb = mb;
		this.mc = mc;
		if (ma>0 || mb>0 || mc >0 || ((ma+mb)>mc)||((ma+mc)>ma)||((mb+mc)>ma)) {
			ma = mb = mc =0;
		}
	}
	public tamGiac() {
		super();
		// TODO Auto-generated constructor stub
	} 
	
	public double  chuVi() {
		return (ma+mb+mc); 
	}
	
	public double  dienTich() {
		double dienTich; 
		double s = chuVi()/2; 
		return dienTich = Math.sqrt(s*(s-ma)*(s-mb)*(s-mc));
	}
	@Override
	public String toString() {
		return "tamGiac [ma=" + ma + ", mb=" + mb + ", mc=" + mc + ", chuVi()=" + chuVi() + ", dienTich()=" + dienTich()
				+ "]";
	}
	
	
	

}
