package Ktra_cuoi_khoa.Cau2;

public class KyThuat extends NhanVien{
    private String chuyennganh;

    public KyThuat(String manhanvien, String hoten, String chuyennganh) {
        super(manhanvien, hoten);
        this.chuyennganh = chuyennganh;
    }

    public KyThuat(String manhanvien, String hoten, String namsinh, String diachi, String chuyennganh) {
        super(manhanvien, hoten, namsinh, diachi);
        this.chuyennganh = chuyennganh;
    }

    public String getChuyennganh() {
        return chuyennganh;
    }

    public void setChuyennganh(String chuyennganh) {
        this.chuyennganh = chuyennganh;
    }

    @Override
    public String moTaCongViec() {
        return "Văn Phòng";
    }

    @Override
    public String toString() {
        return "KyThuat[" + super.toString() +
                "chuyennganh='" + chuyennganh + '\'' +
                ']';
    }
}
