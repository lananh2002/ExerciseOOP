package Bai9;

class Triangle extends Shape {
    void draw() {
        System.out.println("Drawing a triangle");
    }
    
    void erase() {
        System.out.println("Erasing a triangle");
    }
    
    void move(int x, int y) {
        System.out.println("Moving a triangle to coordinates (" + x + ", " + y + ")");
    }
}

