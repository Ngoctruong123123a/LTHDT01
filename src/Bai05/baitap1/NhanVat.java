package Bai05.baitap1;

public class NhanVat {
	private String ten;
	private String id;
	private String gioitinh;
	private int nangluong;
	
	public NhanVat(String ten, String id, String gioitinh, int nangluong) {
		super();
		this.ten = ten;
		this.id = id;
		this.gioitinh = gioitinh;
		this.nangluong = nangluong;
	
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getGioitinh() {
		return gioitinh;
	}
	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}
	public int getNangluong() {
		return nangluong;
	}
	public void setNangluong(int nangluong) {
		this.nangluong = nangluong;
	}
	public void hanhdong() {
		
	}
	public void sucmanh() {
		
	}
	@Override
	public String toString() {
		return "NhanVat [ten=" + ten + ", id=" + id + ", gioitinh=" + gioitinh + "]";
	}
	
}
