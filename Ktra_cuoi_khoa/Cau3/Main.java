package Ktra_cuoi_khoa.Cau3;

public class Main {
    public static void main(String[] args) {
        VanBan vb1 = new VanBan();
        vb1.setContent("  Welcome    to     summoner's        rift");
        System.out.println(vb1.Demtu());
        vb1.setContent(vb1.Chuanhoa());
        System.out.println(vb1);
        vb1.setContent(vb1.Viethoa());
        System.out.println(vb1);
        vb1.setContent(vb1.Vietthuong());
        System.out.println(vb1);
        vb1.setContent(vb1.Viethoachucaidau());
        System.out.println(vb1);
    }
}
