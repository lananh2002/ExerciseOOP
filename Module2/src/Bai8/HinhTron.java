package Bai8;

public class HinhTron {
    private ToaDo tam;
    private double banKinh;

    public HinhTron() {
        this.tam = new ToaDo();
        this.banKinh = 0;
    }

    public HinhTron(ToaDo tam, double banKinh) {
        this.tam = tam;
        this.banKinh = banKinh;
    }

    public ToaDo getTam() {
        return tam;
    }

    public void setTam(ToaDo tam) {
        this.tam = tam;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    public double tinhChuVi() {
        return 2 * Math.PI * banKinh;
    }

    public double tinhDienTich() {
        return Math.PI * Math.pow(banKinh, 2);
    }
}