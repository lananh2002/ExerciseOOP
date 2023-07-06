package Bai03;
import java.util.ArrayList;
import java.util.List;
public class Main03 {
	    public static void main(String[] args) {
	    	
	        List<tamGiac> tamGiacList = new ArrayList<>();

	        // Thêm các đối tượng tam giác vào danh sách
	        tamGiacList.add(new tamGiac(3, 4, 5));
	        tamGiacList.add(new tamGiac(5, 12, 13));
	        tamGiacList.add(new tamGiac(8, 15, 17));

	        // In thông tin của từng đối tượng tam giác trong danh sách
	        for (tamGiac tamGiac : tamGiacList) {
	            System.out.println(tamGiac);
	        }
	    }
	}