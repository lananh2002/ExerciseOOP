package Bai02;

public class SinhVien {
	private int maSV; 
	private String name; 
	private double diemLT; 
	private double diemTH;
	
	
	public int getMaSV() {
		return maSV;
	}
	
	public void setMaSV(int maSV) {
		if ( maSV >0) {
			this.maSV = maSV;
		} else {
			System.out.println("Loi ! ");
		}
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if (!name.trim().equals("")) {
			this.name = name;	
		} else {
			System.out.println("Loi : Khong bo trong");
		}

	}
	public double getDiemLT() {
		return diemLT;
	}
	public void setDiemLT(double diemLT) {
		if (diemLT >0) {
			this.diemLT = diemLT;
		} else {
			System.out.println("Loi: Lon hon 0");
		}
	
	}
	public double getDiemTH() {
		return diemTH;
	}
	public void setDiemTH(double diemTH) {
		if ( diemTH > 0) {
			this.diemTH = diemTH;
		} else {
			System.out.println("Loi: Lon hon 0");
		}
	
	}
	
	public double diemTB() {
		return(diemLT+diemTH)/2;
	} 
	public SinhVien(int maSV, String name, double diemLT, double diemTH) {
		super();
		setMaSV(maSV);
		setName(name);
		setDiemLT(diemLT);
		setDiemTH(diemTH);
	}
	public SinhVien() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static String inTieuDe() {
		String s="";
		s+="\n";

		s+=String.format("%15s%15s%15s%15s%15s","Ma SV ","Name","diemLT","diemTH","diemTB");
		for(int i=0;i<120;i++) {
		s+=" ";
		s+="\n";
		return s;
		}
		return s;
		}

	
	public String toString() {
		return String.format("%15s %15s %15s %15s %15s", maSV,name,diemLT,diemTH,diemTB());
	}
	

	
	
}
