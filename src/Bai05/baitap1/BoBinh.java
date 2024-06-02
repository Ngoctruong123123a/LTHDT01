package Bai05.baitap1;

public class BoBinh extends NhanVat implements KieuDichuyen {
	private boolean giao;
	private boolean khien;
	private boolean kiem;
	private boolean giap;


	public BoBinh(String ten, String id, String gioitinh, int nangluong, boolean giao, boolean khien, boolean kiem,
			boolean giap) {
		super(ten, id, gioitinh, nangluong);
		this.giao = giao;
		this.khien = khien;
		this.kiem = kiem;
		this.giap = giap;
	}
	public boolean isGiao() {
		return giao;
	}
	public void setGiao(boolean giao) {
		this.giao = giao;
	}
	public boolean isKhien() {
		return khien;
	}
	public void setKhien(boolean khien) {
		this.khien = khien;
	}
	public boolean isKiem() {
		return kiem;
	}
	public void setKiem(boolean kiem) {
		this.kiem = kiem;
	}
	public boolean isGiap() {
		return giap;
	}
	public void setGiap(boolean giap) {
		this.giap = giap;
	}
	
	
	@Override
	public void hanhdong() {
		// TODO Auto-generated method stub
		System.out.println("hehe");
	}
	@Override
	public void sucmanh() {
		// TODO Auto-generated method stub
		System.out.println("hehe");
	}
	 @Override
	    public void sangtrai() {
	        System.out.println("BoBinh di chuyen sang trai");
	    }

	    @Override
	    public void sangphai() {
	        System.out.println("BoBinh di chuyen sang phai");
	    }

	    @Override
	    public void nhaylen() {
	        System.out.println("BoBinh nhay len");
	    }

	    @Override
	    public void bochay() {
	        System.out.println("BoBinh bo chay");
	    }
	@Override
	public String toString() {
		return "BoBinh [giao=" + giao + ", khien=" + khien + ", kiem=" + kiem + ", giap=" + giap + ", toString()="
				+ super.toString() + "]";
	}
}
