package BaiTap9h40.model;

public class DoiQuan {
	private String ten;
	private int sothanhvien;
	private String loaiquandoi;
	public DoiQuan(String ten, int sothanhvien, String loaiquandoi) {
		super();
		this.ten = ten;
		this.sothanhvien = sothanhvien;
		this.loaiquandoi = loaiquandoi;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getSothanhvien() {
		return sothanhvien;
	}
	public void setSothanhvien(int sothanhvien) {
		this.sothanhvien = sothanhvien;
	}
	public String getLoaiquandoi() {
		return loaiquandoi;
	}
	public void setLoaiquandoi(String loaiquandoi) {
		this.loaiquandoi = loaiquandoi;
	}
	@Override
	public String toString() {
		return "DoiQuan [ten=" + ten + ", sothanhvien=" + sothanhvien + ", loaiquandoi=" + loaiquandoi + ", toString()="
				+ super.toString() + "]";
	}
	public void add1(BinhDoan bd1) {
		// TODO Auto-generated method stub
		
	}
	public void add(BinhDoan bd1) {
		// TODO Auto-generated method stub
		
	}
	public void add1(DoiQuan qd1) {
		
	}
	public void add(DoiQuan qd2) {
		
	}
	
	
}
