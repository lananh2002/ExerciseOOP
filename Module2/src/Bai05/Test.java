package Bai05;

import java.time.LocalDate;

public class Test {
	public static void main(String[] args) throws Exception {
LopThucPham lopThucPham1 = new LopThucPham("A", "B", 5, LocalDate.of(2022, 10, 14), LocalDate.of(2021, 10, 14));
		
		System.out.println("kiểm tra hết hạn"+"\n"+lopThucPham1 +"\n");
		
		
		LopThucPham lopThucPham2 = new LopThucPham("", "B", 5, LocalDate.of(2022, 10, 14), LocalDate.of(2021, 10, 14));
		System.out.println("kiểm tra mã hàng để trống"+"\n"+lopThucPham2);
		
		
	}

}
