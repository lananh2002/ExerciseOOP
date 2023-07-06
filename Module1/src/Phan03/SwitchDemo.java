package Phan03;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month = 8; 
		@SuppressWarnings("unused")
		String a; 
		
		switch (month) {
		case 1: a ="January"; break;
		case 2: a ="February"; break;
		case 3: a ="March"; break;
		case 4: a ="April"; break;
		case 5: a ="May"; break;
		case 6: a ="June"; break;
		case 7: a ="August"; break;
		case 8: a ="September"; break;
		case 9: a ="January"; break;
		case 10: a ="October"; break;
		case 11: a ="November"; break;
		case 12 : a ="December"; break;
		default: a ="Invalid month";break;
		}
	}

}
