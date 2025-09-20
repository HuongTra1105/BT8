package Class;
import java.util.Scanner;

public class CBGV extends Nguoi {
    private double luongCung123;
    private double thuong123;
    private double phat123;
    private double luongThucLinh123;
    public CBGV() {
    }
    public void nhapThongTin(Scanner sc123) {
        super.nhapThongTin(sc123);
        System.out.print("\tNhap luong cung: ");
        luongCung123 = sc123.nextDouble();
        sc123.nextLine();
        System.out.print("\tNhap thuong: ");
        thuong123 = sc123.nextDouble();
        sc123.nextLine();
        System.out.print("\tNhap phat: ");
        phat123 = sc123.nextDouble();
        sc123.nextLine();
        luongThucLinh123 = luongCung123 + thuong123 - phat123;
    }
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\tLuong cung: " + luongCung123);
        System.out.println("\tThuong: " + thuong123);
        System.out.println("\tPhat: " + phat123);
        System.out.println("\tLuong thuc linh: " + luongThucLinh123);
    }
    public double getLuongThucLinh123() {
        return luongThucLinh123;
    }
}
