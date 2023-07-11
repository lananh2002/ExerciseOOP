package Bai9;

class Quad extends Shape {
    void draw() {
        System.out.println("Drawing a quad");
    }
    
    void erase() {
        System.out.println("Erasing a quad");
    }
    
    void move(int x, int y) {
        System.out.println("Moving a quad to coordinates (" + x + ", " + y + ")");
    }
}