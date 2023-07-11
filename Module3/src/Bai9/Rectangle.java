package Bai9;

class Rectangle extends Quad {
    void draw() {
        System.out.println("Drawing a rectangle");
    }
    
    void erase() {
        System.out.println("Erasing a rectangle");
    }
    
    void move(int x, int y) {
        System.out.println("Moving a rectangle to coordinates (" + x + ", " + y + ")");
    }
}
