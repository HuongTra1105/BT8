package Testing;

import java.util.Scanner;
import Class.QuanLy;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        QuanLy ql = new QuanLy();

        ql.nhapDanhSach(sc);

        System.out.println("\n----- Danh sach tat ca can bo -----");
        ql.hienThiDanhSach();

        System.out.println("\n----- Danh sach nhung can bo co luong >= 8 trieu -----");
        ql.timKiem(8000000);

        sc.close();
    }
}
