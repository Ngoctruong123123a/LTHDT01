package Bai05.baitap1;

public class KiemKhach extends NhanVat implements KieuDichuyen {
	private int soKiem;
	private boolean giap;
	
	public KiemKhach(String ten, String id, String gioitinh, int nangluong, int soKiem, boolean giap) {
		super(ten, id, gioitinh, nangluong);
		this.soKiem = soKiem;
		this.giap = giap;
	
	}
	public int getSoKiem() {
		return soKiem;
	}
	public void setSoKiem(int soKiem) {
		this.soKiem = soKiem;
	}
	public boolean isGiap() {
		return giap;
	}
	public void setGiap(boolean giap) {
		this.giap = giap;
	}
	
	@Override
	public String toString() {
		return "KiemKhach [soKiem=" + soKiem + ", giap=" + giap + ", toString()=" + super.toString() + "]";
	}
	@Override
	public void hanhdong() {
		// TODO Auto-generated method stub
		System.out.println("chem chet cha no");
	}
	@Override
	public void sucmanh() {
		// TODO Auto-generated method stub
//		double energy = this.getNangluong() * 1.5;
		System.out.println("100%");
		
	}
	 @Override
	    public void sangtrai() {
	        System.out.println("KiemKhach di chuyen sang trai");
	    }

	    @Override
	    public void sangphai() {
	        System.out.println("KiemKhach di chuyen sang phai");
	    }

	    @Override
	    public void nhaylen() {
	        System.out.println("KiemKhach nhay len");
	    }

	    @Override
	    public void bochay() {
	        System.out.println("KiemKhach bo chay");
	    }
		
}
