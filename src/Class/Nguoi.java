package Class;

import java.util.Scanner;

public class Nguoi {
    protected String hoTen123;
    protected String ngaySinh123;
    protected String queQuan123;

    public Nguoi() {
    }
    public Nguoi(String hoTen123, String ngaySinh123, String queQuan123) {
        this.hoTen123 = hoTen123;
        this.ngaySinh123 = ngaySinh123;
        this.queQuan123 = queQuan123;
    }
    public void nhapThongTin(Scanner sc123) {
        System.out.print("\tNhap ho ten: ");
        hoTen123 = sc123.nextLine();
        System.out.print("\tNhap ngay sinh: ");
        ngaySinh123 = sc123.nextLine();
        System.out.print("\tNhap que quan: ");
        queQuan123 = sc123.nextLine();
    }
    public void hienThiThongTin() {
        System.out.println("\tHo ten: " + hoTen123);
        System.out.println("\tNgay sinh: " + ngaySinh123);
        System.out.println("\tQue quan: " + queQuan123);
    }
    public String getQueQuan123() {
        return queQuan123;
    }

    public String getNgaySinh123() {
        return ngaySinh123;
    }
}
