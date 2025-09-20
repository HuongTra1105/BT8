package Testing;

import java.util.Scanner;
import Class.QuanLy;

public class Test {

    public static void main(String[] args) {
        Scanner sc123 = new Scanner(System.in);

        QuanLy ql123 = new QuanLy();

        ql123.nhapDanhSach(sc123);

        System.out.println("\n----- Danh sach tat ca can bo -----");
        ql123.hienThiDanhSach();

        System.out.println("\n----- Danh sach nhung can bo co luong >= 8 trieu -----");
        ql123.timKiem(8000000);

        sc123.close();
    }
}
