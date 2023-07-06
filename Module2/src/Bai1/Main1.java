package Bai1;
import java.util.ArrayList;
import java.util.List;
public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<ToaDo> toaDolist =new ArrayList<>();
		toaDolist.add(new ToaDo(2, 3, "A"));
		toaDolist.add(new ToaDo(5, 3, "b"));
		
		for(ToaDo toaDo : toaDolist) {
			System.out.println(toaDo);
		}
		
		
		

		
	}

}
