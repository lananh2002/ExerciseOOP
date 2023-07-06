package bai7;
import java.lang.Math;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

class Circle {
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }

    public void display() {
        System.out.printf("Hình tròn có tâm O(%d, %d) với bán kính %.3f có diện tích và chu vi lần lượt là %.3f và %.3f.%n",
                center.getX(), center.getY(), radius, area(), circumference());
    }
}

