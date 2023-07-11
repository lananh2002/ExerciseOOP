package Bai9;

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle");
    }
    
    void erase() {
        System.out.println("Erasing a circle");
    }
    
    void move(int x, int y) {
        System.out.println("Moving a circle to coordinates (" + x + ", " + y + ")");
    }
}