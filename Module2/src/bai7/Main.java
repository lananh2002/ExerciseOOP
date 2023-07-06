package bai7;

public class Main {
    public static void main(String[] args) {
        // Tạo điểm tâm O
        Point centerPoint = new Point(5, 5);

        // Tạo đối tượng hình tròn
        Circle circle = new Circle(centerPoint, 10.5);

        // Hiển thị kết quả
        circle.display();
    }
}
