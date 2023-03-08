package Ktra_cuoi_khoa.Cau2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NhanVien nv1 = new KyThuat("nv1","Nguyen van a", "1997","Bac Ninh", "IT");
        System.out.println(nv1);
        System.out.println(nv1.moTaCongViec());



        Scanner in = new Scanner(System.in);
        System.out.print("\nMã nhân viên: ");
        String manhanvien = in.nextLine();
        System.out.print("Họ tên nhân viên: ");
        String hoten = in.nextLine();
        System.out.print("Năm sinh: ");
        String namsinh = in.nextLine();
        System.out.print("Địa chỉ: ");
        String diachi = in.nextLine();
        System.out.print("Chuyên nghành: ");
        String chuyennghanh = in.nextLine();

        NhanVien nv2 = new KyThuat(manhanvien,hoten, namsinh, diachi, chuyennghanh);
        System.out.println(nv2);
        System.out.println(nv2.moTaCongViec());
    }
}
