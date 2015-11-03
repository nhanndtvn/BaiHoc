package nhanngo.com.test;

import java.util.Scanner;

import nhanngo.com.myhashmap.SanPham;
import nhanngo.com.myhashmap.Thucdon;

public class TestHashMap {
	
	public static void main(String[] args) {
		
		SanPham cola=new SanPham(1111, "coca", 120);
		SanPham pepsi=new SanPham(2222, "pepsi", 110);
		SanPham redbull=new SanPham(3333, "redbull", 150);
		SanPham sting=new SanPham(4444, "sting", 180);
		
		Thucdon dsSP=new Thucdon();
		dsSP.themSanPham(cola);
		dsSP.themSanPham(pepsi);
		dsSP.themSanPham(redbull);
		dsSP.themSanPham(sting);
		
		dsSP.xuatToanBoSanPham();
		
		System.out.println("Nhap ma san pham muon xoa: ");
		int maXoa=new Scanner(System.in).nextInt();
		
		dsSP.xoaSanPham(maXoa);
		System.out.println("---------Danh sach san pham sau khi xoa--------");
		dsSP.xuatToanBoSanPham();
		
		System.out.println("---------Danh sach san pham co gia tang dan--------");
		dsSP.xapSepSanPhamGiaTangDan();
		
	}

}
