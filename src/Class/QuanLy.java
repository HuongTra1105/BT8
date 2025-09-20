package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {
	private ArrayList<CBGV> ds;

	public QuanLy() {
		ds = new ArrayList<CBGV>(10);
	}

	public void themCBGV(CBGV canBo) {
		ds.add(canBo);
	}
	public void nhapDanhSach(Scanner sc) {
		CBGV canBo;

		System.out.print("Nhap vao so luong can bo: ");
		int n = sc.nextInt();
		sc.nextLine();

		System.out.println("Nhap vao danh sach:");
		for (int i = 0; i < n; i++) {
			System.out.println("Can bo thu " + (i + 1) + " la:");
			canBo = new CBGV();
			canBo.nhapThongTin(sc);
			themCBGV(canBo);
		}
	}

	public void hienThiDanhSach() {
	    for (CBGV cb : ds) {
	        cb.hienThiThongTin();
	    }
	}

	public void timKiem(double luong) {
	    boolean found = false;
	    for (CBGV cb : ds) {
	        if (cb.getLuongThucLinh() >= luong) {
	            cb.hienThiThongTin();
	            found = true;
	        }
	    }
	    if (!found) {
	        System.out.println("\tKhong co can bo nao co luong thuc linh >= " + luong);
	    }
	}

	}

