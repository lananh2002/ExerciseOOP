package Bai8;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CDList cdList = new CDList(5);
        Scanner scanner = new Scanner(System.in);

        // Nhập thông tin CD từ người dùng
        for (int i = 0; i < 5; i++) {
            System.out.println("Nhập thông tin cho CD " + (i + 1) + ":");
            System.out.print("Mã CD: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ ký tự newline
            System.out.print("Tựa CD: ");
            String title = scanner.nextLine();
            System.out.print("Số bài hát: ");
            int numberOfTracks = scanner.nextInt();
            System.out.print("Giá thành: ");
            double price = scanner.nextDouble();

            CD cd = new CD(id, title, numberOfTracks, price);
            cdList.addCD(cd);
        }

        System.out.println("Số lượng CD: " + cdList.getCDCount());
        System.out.println("Tổng giá thành: " + cdList.getTotalCost());

        cdList.sortByCostDescending();
        System.out.println("Danh sách sau khi sắp xếp giảm dần theo giá thành:");
        cdList.displayCDs();

        cdList.sortByTitleAscending();
        System.out.println("Danh sách sau khi sắp xếp tăng dần theo tựa CD:");
        cdList.displayCDs();
        
        // Đóng Scanner
        scanner.close();
    }
}
