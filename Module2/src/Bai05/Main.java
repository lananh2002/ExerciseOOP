package Bai05;
import java.time.LocalDate;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LopThucPham lopThucPham = new LopThucPham("A", "B", 5, LocalDate.of(2022, 10, 14), LocalDate.of(2021, 10, 14));
		
		System.out.println("\n"+lopThucPham);
		
		ArrayList<LopThucPham> listHLopThucPhams = new ArrayList<>();
		LopThucPham lopThucPham1 = new LopThucPham("d", "Bs",2, LocalDate.of(2022, 10, 14), LocalDate.of(2021, 10, 14));
		
		listHLopThucPhams.add(lopThucPham);
		listHLopThucPhams.add(lopThucPham1);
		System.out.println(lopThucPham1);
		

	}

}
