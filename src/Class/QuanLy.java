package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {
    private ArrayList<CBGV> ds123;

    public QuanLy() {
        ds123 = new ArrayList<CBGV>(10);
    }

    public void themCBGV(CBGV canBo123) {
        ds123.add(canBo123);
    }

    public void nhapDanhSach(Scanner sc123) {
        CBGV canBo123;

        System.out.print("Nhap vao so luong can bo: ");
        int n123 = sc123.nextInt();
        sc123.nextLine();

        System.out.println("Nhap vao danh sach:");
        for (int i = 0; i < n123; i++) {
            System.out.println("Can bo thu " + (i + 1) + " la:");
            canBo123 = new CBGV();
            canBo123.nhapThongTin(sc123);
            themCBGV(canBo123);
        }
    }

    public void hienThiDanhSach() {
        for (CBGV cb123 : ds123) {
            cb123.hienThiThongTin();
        }
    }

    public void timKiem(double luong123) {
        boolean found123 = false;
        for (CBGV cb123 : ds123) {
            if (cb123.getLuongThucLinh123() >= luong123) {
                cb123.hienThiThongTin();
                found123 = true;
            }
        }
        if (!found123) {
            System.out.println("\tKhong co can bo nao co luong thuc linh >= " + luong123);
        }
    }
}
