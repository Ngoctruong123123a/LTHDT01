package BaiTap9h40.model;

public class PhuThuy extends NhanVat {
	private boolean choi;
	private boolean gay;
	public PhuThuy(String ten, int id, String gioitinh, int namsinh, boolean choi, boolean gay) {
		super(ten, id, gioitinh, namsinh);
		this.choi = choi;
		this.gay = gay;
	}
	public boolean isChoi() {
		return choi;
	}
	public void setChoi(boolean choi) {
		this.choi = choi;
	}
	public boolean isGay() {
		return gay;
	}
	public void setGay(boolean gay) {
		this.gay = gay;
	}
	@Override
	public String toString() {
		return "PhuThuy [choi=" + choi + ", gay=" + gay + ", toString()=" + super.toString() + ", getTen()=" + getTen()
				+ ", getId()=" + getId() + ", getGioitinh()=" + getGioitinh() + ", getNamsinh()=" + getNamsinh() + "]";
	}
	
}
