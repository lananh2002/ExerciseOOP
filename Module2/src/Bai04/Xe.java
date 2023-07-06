package Bai04;

public class Xe {
	private String tenChuXe; 
	private String loaiXe; 
	private int dungTich; 
	private int triGia;
	private double thue;

	
	
	public String getTenChuXe() {
		return tenChuXe;
	}
	public void setTenChuXe(String tenChuXe) {
		if (tenChuXe.trim().equals("")) {
			this.tenChuXe = tenChuXe;
		} else {
			System.out.println("Khong de  trong");
		}

	}
	public String getLoaiXe() {
		return loaiXe;
	}
	public void setLoaiXe(String loaiXe) {
		if (loaiXe.trim().equals("")) {
			this.loaiXe = loaiXe;
		} else {
			System.out.println("Khong de trong");
		}

	}
	public int getDungTich() {
		return dungTich;
	}
	public void setDungTich(int dungTich) {
		if (dungTich>0) {
			this.dungTich = dungTich;
		} else {
			System.out.println("Dung tich lon hon 0");
		}
	
	}
	public int getTriGia() {
		return triGia;
	}
	public void setTriGia(int triGia) {
		if (triGia>0) {
			this.triGia = triGia;	
		} else {
			System.out.println("Tri gia lon hon 0");
		}

	}


	
	public Xe() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Xe(String tenChuXe, String loaiXe, int dungTich, int triGia) {
		super();
		this.tenChuXe = tenChuXe;
		this.loaiXe = loaiXe;
		this.dungTich = dungTich;
		this.triGia = triGia;
	}
	

	public double  thue() {
		if (dungTich < 100) {
			thue = triGia*0.01; 
		} else if (dungTich<200 ) {
			thue = triGia * 0.03;
		} else {
			thue = triGia*0.005;
		}
		return thue; 
	}
	
	
	public static String inTieuDe() {
		String s="";
		s+="\n";

		s+=String.format("%-15s|%15s|%15s|%15s|%15s|\n","Tên chủ xe","Loại xe","dung tích","trị giá","Thuế");
		for(int i=0;i<120;i++)
		s+="-";
		s+="\n";
		return s;
		}
	@Override
	public String toString() {
		return String.format("%15s %15s %15s %15s %15s", tenChuXe,loaiXe,dungTich,triGia,thue() );
	}
	}
	
	
	
	

