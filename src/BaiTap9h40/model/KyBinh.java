package BaiTap9h40.model;

public class KyBinh extends NhanVat {
	private boolean guom;
	private boolean giao;
	private boolean cung;
	private boolean ngua;
	public KyBinh(String ten, int id, String gioitinh, int namsinh, boolean guom, boolean giao, boolean cung,
			boolean ngua) {
		super(ten, id, gioitinh, namsinh);
		this.guom = guom;
		this.giao = giao;
		this.cung = cung;
		this.ngua = ngua;
	}
	public boolean isGuom() {
		return guom;
	}
	public void setGuom(boolean guom) {
		this.guom = guom;
	}
	public boolean isGiao() {
		return giao;
	}
	public void setGiao(boolean giao) {
		this.giao = giao;
	}
	public boolean isCung() {
		return cung;
	}
	public void setCung(boolean cung) {
		this.cung = cung;
	}
	public boolean isNgua() {
		return ngua;
	}
	public void setNgua(boolean ngua) {
		this.ngua = ngua;
	}
	@Override
	public String toString() {
		return "KyBinh [guom=" + guom + ", giao=" + giao + ", cung=" + cung + ", ngua=" + ngua + ", toString()="
				+ super.toString() + ", getTen()=" + getTen() + ", getId()=" + getId() + ", getGioitinh()="
				+ getGioitinh() + ", getNamsinh()=" + getNamsinh() + "]";
	}
	public void add(BinhDoan bd1) {
		// TODO Auto-generated method stub
		
	}
	
	
}
