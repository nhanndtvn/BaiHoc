package nhanngo.com.myhashmap;

public class SanPham {
private int masp;

public int getMasp() {
	return masp;
}
public void setMasp(int masp) {
	this.masp = masp;
}
public String getTensp() {
	return tensp;
}
public void setTensp(String tensp) {
	this.tensp = tensp;
}
public double getGiasp() {
	return giasp;
}
public void setGiasp(double giasp) {
	this.giasp = giasp;
}
private String tensp;
private double giasp;
public SanPham() {
	super();
	// TODO Auto-generated constructor stub
}

public SanPham(int masp, String tensp, double giasp) {
	super();
	this.masp = masp;
	this.tensp = tensp;
	this.giasp = giasp;
}
@Override
public String toString() {
	String msg=masp+"\t"
			+tensp+"\t"
			+giasp;

	return msg;
}

}
