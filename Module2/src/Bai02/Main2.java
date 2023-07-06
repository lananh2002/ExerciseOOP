package Bai02;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	SinhVien sinhVien = new SinhVien(21, "Lan Anh", 7, 8); 
	SinhVien sinhVien2 = new SinhVien(23, "Hoang", 8, 5);
	System.out.println(sinhVien.inTieuDe());
	System.out.println(sinhVien.toString());
	System.out.println(sinhVien2);
		
		
		SinhVien sinhVien3 = new SinhVien(); 
		Scanner sc = new Scanner(System.in); 
		System.out.println("Nhap ma SV : ");
		sinhVien3.setMaSV(sc.nextInt());
		
		System.out.println("Nhap ten SV : ");
		sinhVien3.setName(sc.next());
		
		System.out.println("Nhap Diem li thuyet: ");
		sinhVien3.setDiemLT(sc.nextDouble());
		
		System.out.println("Nhap diem Thuc hanh: ");
		sinhVien3.setDiemTH(sc.nextDouble());
		
		System.out.println("Diem TB : " +sinhVien.diemTB());
		System.out.println(sinhVien3.inTieuDe());
		System.out.println(sinhVien3.toString());
		
		
		
		
		
		
		
	}

}
