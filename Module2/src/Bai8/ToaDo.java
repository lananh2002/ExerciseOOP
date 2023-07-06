package Bai8;

public class ToaDo {
    private String ten;
    private float x;
    private float y;

    public ToaDo() {
        this.ten = "";
        this.x = 0;
        this.y = 0;
    }

    public ToaDo(float x, float y) {
        this.ten = "";
        this.x = x;
        this.y = y;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "ToaDo [Tên=" + ten + ", X=" + x + ", Y=" + y + "]";
    }
}
