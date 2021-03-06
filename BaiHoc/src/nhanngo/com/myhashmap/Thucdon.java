package nhanngo.com.myhashmap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class Thucdon {
	private HashMap<Integer, SanPham> dsSanPham;

	public HashMap<Integer, SanPham> getDsSanPham() {
		return dsSanPham;
	}

	public void setDsSanPham(HashMap<Integer, SanPham> dsSanPham) {
		this.dsSanPham = dsSanPham;
	}

	public Thucdon() {
		super();
		this.dsSanPham =new HashMap<>();
	}

	public void themSanPham(SanPham sp)
	{
		if(dsSanPham.containsKey(sp.getMasp()))		
			System.out.println("San pham co ma "+sp.getMasp() +" da ton tai!!!");
		else
		{
			dsSanPham.put(sp.getMasp(), sp);
			System.out.println("San pham "+sp.getMasp() +" da them thanh cong.");
		}
	}

	public int soSanpham()
	{
		return dsSanPham.size();
	}

	public SanPham laySanpham(int masp)
	{
		if(dsSanPham.containsKey(masp))
		{
			SanPham sp=dsSanPham.get(masp);
			return sp;
		}
		return null;
	}

	public void xuatToanBoSanPham()
	{
		for(SanPham sp:this.dsSanPham.values())
		{
			System.out.println(sp);
		}
	}

	public Thucdon locSanPham(double minPrice, double maxPrice)
	{
		Thucdon dsLoc=new Thucdon();
		for(SanPham sp:this.dsSanPham.values())
		{
			if(sp.getGiasp()>=minPrice && sp.getGiasp() <=maxPrice)
			{
				dsLoc.themSanPham(sp);
			}
		}		
		return dsLoc;
	}

	public boolean xoaSanPham (int ma)
	{
		if(dsSanPham.containsKey(ma))
		{
			dsSanPham.remove(ma);
			return true;
		}
		return false;
	}
	
	public void xapSepSanPhamGiaTangDan()
	{
		ArrayList<SanPham> ds=new ArrayList<>(this.dsSanPham.values());
		Collections.sort(ds, new Comparator<SanPham>() {

			@Override
			public int compare(SanPham arg0, SanPham arg1) {
				// TODO Auto-generated method stub
				if (arg0.getGiasp() > arg1.getGiasp())
					return 1;
				if (arg0.getGiasp() <arg1.getGiasp())
					return -1;							
				return 0;
			}			
		});
		for (SanPham sp:ds)
		{
			System.out.println(sp);
		}
		
	}

}
