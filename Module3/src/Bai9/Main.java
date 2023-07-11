package Bai9;

public class Main {
    public static void main(String[] args) {
        Drawing drawing = new Drawing();
        
        Circle circle = new Circle();
        drawing.drawShape(circle);
        circle.move(10, 20);
        
        Rectangle rectangle = new Rectangle();
        drawing.drawShape(rectangle);
        rectangle.erase();
    }
}