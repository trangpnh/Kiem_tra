package Ktra_cuoi_khoa.Cau2;

public abstract class NhanVien {
    private String manhanvien;
    private String hoten;
    private String namsinh;
    private String diachi;
    public NhanVien(String manhanvien, String hoten) {
        this.manhanvien = manhanvien;
        this.hoten = hoten;
    }

    public NhanVien(String manhanvien, String hoten, String namsinh, String diachi) {
        this.manhanvien = manhanvien;
        this.hoten = hoten;
        this.namsinh = namsinh;
        this.diachi = diachi;
    }

    public String getmanhanvien() {
        return manhanvien;
    }

    public String gethoten() {
        return hoten;
    }

    public void sethoten(String hoten) {
        this.hoten = hoten;
    }

    public String getnamsinh() {
        return namsinh;
    }

    public void setnamsinh(String namsinh) {
        this.namsinh = namsinh;
    }

    public String getdiachi() {
        return diachi;
    }

    public void setdiachi(String diachi) {
        this.diachi = diachi;
    }

    @Override
    public String toString() {
        return "NhanVien[" +
                "manhanvien='" + manhanvien + '\'' +
                ", hoten='" + hoten + '\'' +
                ", namsinh='" + namsinh + '\'' +
                ", diachi='" + diachi + '\'' +
                ']';
    }
    public abstract String moTaCongViec();
}
