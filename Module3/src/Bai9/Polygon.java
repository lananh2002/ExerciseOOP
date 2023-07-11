package Bai9;

class Polygon extends Shape {
    void draw() {
        System.out.println("Drawing a polygon");
    }
    
    void erase() {
        System.out.println("Erasing a polygon");
    }
    
    void move(int x, int y) {
        System.out.println("Moving a polygon to coordinates (" + x + ", " + y + ")");
    }
}
